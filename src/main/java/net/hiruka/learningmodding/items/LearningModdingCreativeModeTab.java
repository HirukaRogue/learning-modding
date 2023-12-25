package net.hiruka.learningmodding.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class LearningModdingCreativeModeTab {
    public static final CreativeModeTab MY_TAB = new CreativeModeTab("my_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(LearningModdingItems.ZIRCON.get());
        }
    };
}
