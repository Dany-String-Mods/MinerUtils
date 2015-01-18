package com.danymany.minerutils.init;

import com.danymany.minerutils.block.blockDiamondGlass;
import com.danymany.minerutils.block.blockMU;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class modblocks
{
    public static final blockMU DiamondGlass = new blockDiamondGlass();

    public static void init()
    {
        GameRegistry.registerBlock(DiamondGlass, "blockDiamondGlass");
    }

    public static Block blockDiamondGlass = new blockDiamondGlass().setBlockTextureName("minerutils:blockDiamondGlass");

}
