package net.rakkis157.agriculture_horizons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rakkis157.agriculture_horizons.AgricultureHorizons;
import net.rakkis157.agriculture_horizons.item.AgricultureHorizonsItemGroup;

public class AgricultureHorizonsBlocks {

    private static final Block WAX_BLOCK = registerBlock("wax_block", new Block(
            FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(AgricultureHorizons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(AgricultureHorizons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(AgricultureHorizonsItemGroup.AGRICULTURE_HORIZONS)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering Mod Blocks for " + AgricultureHorizons.MOD_ID);
    }
}