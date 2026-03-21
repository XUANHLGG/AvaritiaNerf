# AvaritiaNerf (无尽保护补丁)
![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)
![Platform: NeoForge](https://img.shields.io/badge/platform-NeoForge-green.svg)
![Minecraft: 1.21.1](https://img.shields.io/badge/minecraft-1.21.1-orange.svg)

专门为 **Avaritia Neo (无尽贪婪Neo)** 打造的服务端功能管控补丁，旨在保护服务器地形免受大规模破坏。

## 🛡️ 核心功能
本补丁通过 Mixin 技术，在保留无尽装备顶级属性（如挖掘速度、攻击力）的同时，精准拦截其“大范围删除地形”的逻辑：
- 世界崩解之镐：禁用 16x64x16 的 Hammer 挖掘模式。无论形态，仅破坏单块方块
- 星球吞噬之铲：禁用 16x16x16 的 Destroyer 挖掘模式
- 自然荒芜之斧：禁用大范围伐木与右键大面积清除功能
- 终望珍珠：黑洞不再吞噬方块。保持其吸引力与战斗伤害，但对地形不再有任何实质性破坏

## 🚀 安装指南
1. 本模组为纯服务端（Server Side）补丁
2. 仅需将构建产物（jar）放入服务器的 `mods/` 文件夹中
3. 注意：客户端可选安装。不安装客户端时，使用装备与终望珍珠可能出现短暂视觉差（方块看似消失但会复原），为完美视觉体验可选择客户端也安装

## 🛠️ 开发与构建
1. 克隆本项目
2. 在根目录下创建 `libs` 文件夹，并放入 `AvaritiaNeo` 的 jar 包
3. 运行 `./gradlew build`（Windows 可使用 `./gradlew.bat build`）
4. 构建产物位于 `build/libs/`

## 📄 开源协议
基于 MIT 协议开源。由 TendoArisu 开发。

