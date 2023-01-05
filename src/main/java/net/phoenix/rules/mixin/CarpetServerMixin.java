package net.phoenix.rules.mixin;

import carpet.CarpetServer;
import net.minecraft.util.crash.CrashReport;
import net.phoenix.rules.PhoenixExtension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CrashReport.class)
public class CarpetServerMixin {
    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "initCrashReport", at = @At(value = "HEAD"))
    private static void registerCarpetExtension100Success(CallbackInfo ci)
    {
        PhoenixExtension.noop();
    }
}
