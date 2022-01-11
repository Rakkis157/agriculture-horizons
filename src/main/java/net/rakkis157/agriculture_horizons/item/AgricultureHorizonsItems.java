package net.rakkis157.agriculture_horizons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoneycombItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rakkis157.agriculture_horizons.AgricultureHorizons;


public class AgricultureHorizonsItems {

    public static final Item WAX = registerItem("wax", new HoneycombItem(
            new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(AgricultureHorizons.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + AgricultureHorizons.MOD_ID);
    }
}
