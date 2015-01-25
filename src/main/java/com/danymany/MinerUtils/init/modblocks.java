package com.danymany.minerutils.init;

import com.danymany.minerutils.block.blockDiamondGlass;
import com.danymany.minerutils.block.blockMU;
import com.danymany.minerutils.block.blockSuperClearGlass;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class modblocks
{
    public static final blockMU blockDiamondGlass = new blockDiamondGlass();
    public static final blockMU blockSuperClearGlass = new blockSuperClearGlass();

    public static void init()
    {
        GameRegistry.registerBlock(blockDiamondGlass, "blockDiamondGlass");
        GameRegistry.registerBlock(blockSuperClearGlass, "blockSuperClearGlass");
    }

}