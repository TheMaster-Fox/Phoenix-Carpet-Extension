package net.phoenix.rules.Commands;

import carpet.utils.Messenger;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.item.Items;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.phoenix.rules.CarpetSettings;
import net.phoenix.rules.Configs.Config;
import net.phoenix.rules.Helpers.BotSubscriptionHelper;
import net.phoenix.rules.Utils.DateUtils;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static net.minecraft.command.CommandSource.suggestMatching;
import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;


public class BotSubscriptionCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher){
        dispatcher.register(literal("bots")
                .requires((player) -> player.hasPermissionLevel(CarpetSettings.botSpawnSubscription ? 0 : 10))
                .then(literal("buy")
                        .then(argument("days", StringArgumentType.greedyString())
                                .suggests((c,b)->suggestMatching(new String[]{"1"}, b))
                                .executes(BotSubscriptionCommand::Subscribe)
                        )
                )
                .then(literal("show")
                        .then(argument("player", StringArgumentType.greedyString())
                                .suggests((c,b)->suggestMatching(getPlayers(c.getSource()), b))
                                        .executes(BotSubscriptionCommand::ShowDays)
                        )
                )
        );
    }

    private static int Subscribe(CommandContext<ServerCommandSource> context){

        ServerPlayerEntity player = context.getSource().getPlayer();
        assert player != null;

        UUID uuid = player.getUuid();

        if(!CarpetSettings.botSpawnSubscription){
            Messenger.m(player,Text.literal("This feature is not enabled on this server.")
                        .formatted(Formatting.RED));
           return 0;
        }

        int messageint = Integer.parseInt(StringArgumentType.getString(context, "days"));

        if(!player.getMainHandStack().getItem().equals(Items.DIAMOND) || player.getMainHandStack().getCount() < (Config.DiamondCost * messageint)){

            Messenger.m(player, Text.literal("You need to have %s*%s=%s or more diamonds in your main hand.".formatted(Config.DiamondCost, messageint, (Config.DiamondCost*messageint)))
                    .formatted(Formatting.RED));
            return 1;
        }


        player.getMainHandStack().decrement(Config.DiamondCost * messageint);

        BotSubscriptionHelper.setValue(player.getUuid(),
                    BotSubscriptionHelper.getSubDays(uuid) + (messageint*Config.SubscribeDays));

        Messenger.m(player,Text.literal("You have successfully subscribed for spawning bots for %s more days.".formatted(Config.SubscribeDays*messageint))
                .formatted(Formatting.GREEN));

        return 1;
    }
    private static int ShowDays(CommandContext<ServerCommandSource> context){

        String playerName = StringArgumentType.getString(context, "player");

        ServerWorld world = Objects.requireNonNull(context.getSource().getPlayer()).getWorld();

        List<ServerPlayerEntity> players = world.getPlayers();

        UUID uuid = Objects.requireNonNull(context.getSource().getPlayer()).getUuid();

        for(ServerPlayerEntity other : players){
            if(other.getName().getString().equals(playerName)){
                uuid = other.getUuid();
            }
        }


        Date date1 = BotSubscriptionHelper.getDate(uuid);
        Date date2 = DateUtils.AddDays(date1, BotSubscriptionHelper.getSubDays(uuid));


        Messenger.m(context.getSource(),
                Text.literal("Player %s has %s days left".formatted(
                        playerName,
                        String.valueOf(DateUtils.DaysTo(date1, date2))
                ))
        );

        return 1;
    }
    private static List<String> getPlayers(ServerCommandSource source){
        return List.of(source.getServer().getPlayerNames());
    }
}
