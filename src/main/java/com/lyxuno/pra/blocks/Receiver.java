package com.lyxuno.pra.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Receiver extends Block {
    public Receiver()
    {
        super(Properties.create(Material.IRON)
                        .sound(SoundType.METAL)
                        .hardnessAndResistance(2.0f)
                        .lightValue(0)
        );
        setRegistryName("receiver");
    }
}
