package com.thevortex.allthetweaks.config;

import com.thevortex.allthetweaks.blocks.TweakBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class Reference {
    public static final String MOD_ID = "allthetweaks";

    public static ResourceLocation tweaks(String path) {
        return new ResourceLocation("allthetweaks", path);
    }
    public static ResourceLocation forge(String path) {
        return new ResourceLocation("forge", path);
    }
    public static ResourceLocation block(String path) {
        return forge("storage_blocks/" + path);
    }

    public static String tab() {
        return String.format("itemGroup.%s", MOD_ID);
    }
    public static final TagKey<Block> ENDERPEARL_BLOCK = BlockTags.create(block("ender_pearl"));
    public static final TagKey<Block> NETHERSTAR_BLOCK = BlockTags.create(block("nether_star"));
    public static final TagKey<Block> ATMSTAR_BLOCK = BlockTags.create(block("atm_star"));
    public static final TagKey<Block> GREGSTAR_BLOCK = BlockTags.create(block("greg_star"));

    public static final TagKey<Block> BuildingGadgets = BlockTags.create(new ResourceLocation("buildinggadgets","blacklist/copy_paste"));
    public static final TagKey<Block> BuildingGadgets_generic = BlockTags.create(new ResourceLocation("buildinggadgets","blacklist/generic"));

    public static final TagKey<Item> ENDERPEARL_BLOCK_ITEM = ItemTags.create(Reference.block("ender_pearl"));
    public static final TagKey<Item> NETHERSTAR_BLOCK_ITEM = ItemTags.create(Reference.block("nether_star"));
    public static final TagKey<Item> ATMSTAR_BLOCK_ITEM = ItemTags.create(Reference.block("atm_star"));
    public static final TagKey<Item> GREGSTAR_BLOCK_ITEM = ItemTags.create(Reference.block("greg_star"));

    public static final TagKey<Item> ATMSTAR = ItemTags.create(Reference.tweaks("atm_star"));
    public static final TagKey<Item> GREGSTAR = ItemTags.create(Reference.tweaks("greg_star"));

}
