package com.thevortex.allthetweaks.blocks;

import com.thevortex.allthetweaks.config.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TweakBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Reference.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MOD_ID);

    public static final RegistryObject<Block> ENDERPEARL_BLOCK = BLOCKS.register("ender_pearl_block",() -> new Block(Block.Properties.of().strength(0.85f,1.0f).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> NETHERSTAR_BLOCK = BLOCKS.register("nether_star_block",() -> new Block(Block.Properties.of().strength(0.85f,1.0f).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> ATMSTAR_BLOCK = BLOCKS.register("atm_star_block",() -> new Block(Block.Properties.of().strength(0.85f,1.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> GREGSTAR_BLOCK = BLOCKS.register("greg_star_block",() -> new Block(Block.Properties.of().strength(0.85f,1.0f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MINI_END_BLOCK = BLOCKS.register("mini_end",() -> new MiniPortalBlock(Block.Properties.of().strength(0.75f).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MINI_EXIT_BLOCK = BLOCKS.register("mini_exit",() -> new MiniPortalBlock(Block.Properties.of().strength(0.75f).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MINI_NETHER_BLOCK = BLOCKS.register("mini_nether",() -> new MiniPortalBlock(Block.Properties.of().strength(0.75f).sound(SoundType.NETHERRACK).noOcclusion()));

    public static final RegistryObject<Block> ATM_TROPHY = BLOCKS.register("trophy_atm",() -> new Block(Block.Properties.of().strength(0.75f).sound(SoundType.NETHERRACK).noOcclusion()));

    public static final RegistryObject<Item> ENDERPEARL_BLOCK_ITEM = ITEMS.register("ender_pearl_block",
            () -> new BlockItem(ENDERPEARL_BLOCK.get(), new Item.Properties()));

   public static final RegistryObject<Item> NETHERSTAR_BLOCK_ITEM = ITEMS.register("nether_star_block",
        () -> new BlockItem(NETHERSTAR_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> ATMSTAR_BLOCK_ITEM = ITEMS.register("atm_star_block",
            () -> new BlockItem(ATMSTAR_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> GREGSTAR_BLOCK_ITEM = ITEMS.register("greg_star_block",
            () -> new BlockItem(GREGSTAR_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> MINI_END_BLOCK_ITEM = ITEMS.register("mini_end",
    () -> new BlockItem(MINI_END_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MINI_EXIT_BLOCK_ITEM = ITEMS.register("mini_exit",
            () -> new BlockItem(MINI_EXIT_BLOCK.get(), new Item.Properties()));
            
    public static final RegistryObject<Item> MINI_NETHER_BLOCK_ITEM = ITEMS.register("mini_nether",
    () -> new BlockItem(MINI_NETHER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> TROPHY_ATM = ITEMS.register("trophy_atm",
            () -> new BlockItem(ATM_TROPHY.get(), new Item.Properties()));

    public static final RegistryObject<Item> ATMSTAR = ITEMS.register("atm_star", () -> new Shiny(new Item.Properties()));
    public static final RegistryObject<Item> GREGSTAR = ITEMS.register("greg_star", () -> new Shiny(new Item.Properties()));
    public static final RegistryObject<Item> ATMSTAR_SHARD = ITEMS.register("atm_star_shard", () -> new Shiny(new Item.Properties()));
    public static final RegistryObject<Item> CATALYST = ITEMS.register("allthecatalystium",() -> new Shiny(new Item.Properties()));
    public static final RegistryObject<Item> DIM_SEED = ITEMS.register("dimensional_seed", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SOUL = ITEMS.register("dragon_soul", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPPD = ITEMS.register("improbable_probability_device", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEXIUM_EMITTER = ITEMS.register("nexium_emitter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBLIV_SHARD = ITEMS.register("oblivion_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PATRICK_STAR = ITEMS.register("patrick_star", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHIL_FUEL = ITEMS.register("philosophers_fuel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PULSE_BLACK_HOLE = ITEMS.register("pulsating_black_hole", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITHER_COMPASS = ITEMS.register("withers_compass", () -> new WitherCompass(new Item.Properties()));

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_TABS.register("creative_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable(Reference.tab()))
            .icon(() -> ATMSTAR.get().getDefaultInstance())
            .displayItems((parameters, output) -> ITEMS.getEntries().stream()
                    .map(RegistryObject::get)
                    .map(Item::getDefaultInstance)
                    .forEach(output::accept))
            .build()
    );
}
