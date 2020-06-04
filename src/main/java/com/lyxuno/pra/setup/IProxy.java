package com.lyxuno.pra.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    public World getClientWorld();
}
