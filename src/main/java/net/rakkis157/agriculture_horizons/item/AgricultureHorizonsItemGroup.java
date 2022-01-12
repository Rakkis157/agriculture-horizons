package net.rakkis157.agriculture_horizons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.rakkis157.agriculture_horizons.AgricultureHorizons;

public class AgricultureHorizonsItemGroup {
    public static final ItemGroup MAIN = FabricItemGroupBuilder.build(new Identifier(AgricultureHorizons.MOD_ID,
            "title"), () -> new ItemStack(AgricultureHorizonsItems.WAX));
}
