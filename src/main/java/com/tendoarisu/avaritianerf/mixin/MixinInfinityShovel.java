package com.tendoarisu.avaritianerf.mixin;

import net.byAqua3.avaritia.item.ItemInfinityShovel;
import net.byAqua3.avaritia.loader.AvaritiaDataComponents;
import net.minecraft.core.component.DataComponentType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ItemInfinityShovel.class)
public class MixinInfinityShovel {

    @Redirect(method = "mineBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;has(Lnet/minecraft/core/component/DataComponentType;)Z"))
    private boolean redirectHasDestroyer(net.minecraft.world.item.ItemStack instance, DataComponentType<?> type) {
        if (type == AvaritiaDataComponents.DESTROYER.get()) {
            return false;
        }
        return instance.has(type);
    }
}
