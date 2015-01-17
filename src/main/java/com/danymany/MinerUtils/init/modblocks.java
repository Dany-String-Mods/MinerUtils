package com.danymany.MinerUtils.init;

import com.danymany.MinerUtils.block.blockDiamondGlass;
import com.danymany.MinerUtils.block.blockMU;
import com.danymany.MinerUtils.item.itemCrafter;
import cpw.mods.fml.common.registry.GameRegistry;

public class modblocks
{
    public static final blockMU DiamondGlass = new blockDiamondGlass();

    public static void init()
    {
        GameRegistry.registerBlock(DiamondGlass, "blockDiamondGlass");
    }
}
