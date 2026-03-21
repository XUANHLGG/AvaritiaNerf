package com.tendoarisu.avaritianerf.mixin;

import net.byAqua3.avaritia.entity.EntityGapingVoid;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityGapingVoid.class)
public class MixinEntityGapingVoid {

    @Inject(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), cancellable = true)
    private void onBlockTick(CallbackInfo ci) {
        ci.cancel();
    }

    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;explode(Lnet/minecraft/world/entity/Entity;DDDFZLnet/minecraft/world/level/Level$ExplosionInteraction;)Lnet/minecraft/world/level/Explosion;"))
    private net.minecraft.world.level.Explosion redirectExplode(Level instance, net.minecraft.world.entity.Entity entity, double x, double y, double z, float explosionRadius, boolean causesFire, Level.ExplosionInteraction interaction) {
        return instance.explode(entity, x, y, z, explosionRadius, causesFire, Level.ExplosionInteraction.NONE);
    }
}
