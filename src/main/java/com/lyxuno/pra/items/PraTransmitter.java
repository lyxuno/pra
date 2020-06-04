package com.lyxuno.pra.items;

import com.lyxuno.pra.Pra;
import net.minecraft.item.Item;

public class PraTransmitter extends Item {

    public PraTransmitter()
    {
        super(new Item.Properties()
                      .maxStackSize(1)
                      .group(Pra.setup.itemGroup));
        setRegistryName("pra_transmitter");
    }
}
