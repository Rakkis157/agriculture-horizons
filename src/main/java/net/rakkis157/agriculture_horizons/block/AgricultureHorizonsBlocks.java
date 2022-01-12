package net.rakkis157.agriculture_horizons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rakkis157.agriculture_horizons.AgricultureHorizons;
import net.rakkis157.agriculture_horizons.item.AgricultureHorizonsItemGroup;

public class AgricultureHorizonsBlocks {

    private static final Block WAX_BLOCK = registerBlock("wax_block", new Block(
            FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool()));
    private static final Block WAX_PALM_LOG = registerBlock("wax_palm_log", new PillarBlock(
            FabricBlockSettings.copy(Blocks.OAK_LOG)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(AgricultureHorizons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(AgricultureHorizons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(AgricultureHorizonsItemGroup.MAIN)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering Mod Blocks for " + AgricultureHorizons.MOD_ID);
    }
}