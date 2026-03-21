package com.tendoarisu.avaritianerf.mixin;

import net.byAqua3.avaritia.item.ItemInfinityPickaxe;
import net.byAqua3.avaritia.loader.AvaritiaDataComponents;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ItemInfinityPickaxe.class)
public class MixinInfinityPickaxe {

    @Redirect(method = "mineBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;has(Lnet/minecraft/core/component/DataComponentType;)Z"))
    private boolean redirectHasHammer(net.minecraft.world.item.ItemStack instance, DataComponentType<?> type) {
        if (type == AvaritiaDataComponents.HAMMER.get()) {
            return false;
        }
        return instance.has(type);
    }

    @Redirect(method = "mineBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;isAir()Z"))
    private boolean redirectIsAir(BlockState instance) {
        return true; 
    }
}
