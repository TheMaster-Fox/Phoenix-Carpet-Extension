package net.phoenix.rules.mixin;

import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.tag.BlockTags;
import net.phoenix.rules.CarpetSettings;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.tag.TagKey;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(PickaxeItem.class)
public class PickaxeItemMixin{

    @Inject(at = @At(value = "HEAD"),method = "getMiningSpeedMultiplier", cancellable = true)
    private void getMiningSpeedMultiplier(ItemStack stack, BlockState state, CallbackInfoReturnable<Float> info) {

        if(state.getBlock().equals(Blocks.DEEPSLATE) &&
                stack.getItem().equals(Items.NETHERITE_PICKAXE)) {
            if(!CarpetSettings.instaMineDeepslate) {
                return;
            }
            info.setReturnValue(50f);
            info.cancel();
        }
        if((state.getBlock().equals(Blocks.END_STONE)) &&
                stack.getItem().equals(Items.NETHERITE_PICKAXE)) {
            if(!CarpetSettings.instaMineEndstone) {
                return;
            }
            info.setReturnValue(50f);
            info.cancel();
        }
    }
}
