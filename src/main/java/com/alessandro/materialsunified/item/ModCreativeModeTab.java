package com.alessandro.materialsunified.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MATERIALS_UNIFIED_TAB = new CreativeModeTab("materialsunifiedtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };

}
