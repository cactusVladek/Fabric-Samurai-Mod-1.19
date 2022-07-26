package net.cactus.samuraimod.item;

import net.cactus.samuraimod.SamuraiMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SamuraiMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SamuraiMod.LOGGER.debug("Registering Mod Items for" + SamuraiMod.MOD_ID);
    }
}
