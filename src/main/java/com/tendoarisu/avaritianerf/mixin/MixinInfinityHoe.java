package com.tendoarisu.avaritianerf.mixin;

import net.byAqua3.avaritia.item.ItemInfinityHoe;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ItemInfinityHoe.class)
public class MixinInfinityHoe {

    @Redirect(method = "useOn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;isShiftKeyDown()Z"))
    private boolean redirectIsShiftKeyDown(Player instance) {
        return true;
    }
}
