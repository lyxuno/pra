package com.lyxuno.pra.setup;

import com.lyxuno.pra.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("pra") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.RECEIVER);
        }
    };

    public void init() {

    }
}
