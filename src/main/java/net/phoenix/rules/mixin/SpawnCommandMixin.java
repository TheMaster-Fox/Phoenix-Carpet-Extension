package net.phoenix.rules.mixin;

import carpet.commands.PlayerCommand;
import carpet.utils.Messenger;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.phoenix.rules.CarpetSettings;
import net.phoenix.rules.Helpers.BotSubscriptionHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;


@Mixin(PlayerCommand.class)
public class SpawnCommandMixin {


    @Inject(method = "spawn", at = @At(value = "HEAD"), cancellable = true, remap = false)
    private static void register(CommandContext<ServerCommandSource> context, CallbackInfoReturnable<Integer> cir){
        if(!CarpetSettings.botSpawnSubscription){
            return;
        }
        ServerPlayerEntity player = context.getSource().getPlayer();
        assert player != null;
        UUID uuid = player.getUuid();

        if(!BotSubscriptionHelper.IsSubscribing(uuid)){

            Messenger.m(context.getSource(), Text.literal("You dont have permission to use this command. Try /bots to get access").formatted(Formatting.RED));

            cir.setReturnValue(0);
            cir.cancel();
        }
    }
}
