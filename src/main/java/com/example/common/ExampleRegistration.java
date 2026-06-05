package com.example.common;

import com.gto.registrylib.util.entry.BlockEntry;
import net.minecraft.world.item.Item;

import com.gto.registrylib.util.entry.ItemEntry;
import net.minecraft.world.level.block.Block;

import static com.example.ExampleMod.REGISTRY;
import static com.example.common.ExampleTab.TAB_GANM;

/**
 * 方块和实体注册类
 */
public class ExampleRegistration {

    public static void init() {}

    public static final ItemEntry<Item> NXAMPLE_ITEM = REGISTRY
            .item("example_item", Item::new)
            .langCn("示例物品")
            .lang("Example Item")
            .addTab(TAB_GANM.getKey())
            .defaultModel()
            .register();

    public static final BlockEntry<Block> NXAMPLE_BLOCK = REGISTRY
            .block("example_block", Block::new)
            .langCn("示例块")
            .lang("Example Block")
            .item(builder -> builder.addTab(TAB_GANM.getKey()))
            .register();
}
