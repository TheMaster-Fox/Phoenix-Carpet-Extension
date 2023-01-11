package net.phoenix.rules.mixin;

import net.minecraft.server.MinecraftServer;
import net.phoenix.rules.Helpers.BotSubscriptionHelper;
import net.phoenix.rules.Utils.FileUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @Inject(method = "loadWorld", at = @At(value = "HEAD"))
    private void serverLoaded(CallbackInfo ci)
    {
        FileUtils.init(((MinecraftServer)(Object)this));
        BotSubscriptionHelper.init();
    }
}
