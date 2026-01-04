package com.tendoarisu.avaritianerf;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Avaritianerf.MODID)
public class Avaritianerf {
    public static final String MODID = "avaritianerf";

    public Avaritianerf(IEventBus modEventBus) {
        // 补丁 Mod 不需要额外的注册逻辑，Mixin 会由 NeoForge 自动加载
    }
}
