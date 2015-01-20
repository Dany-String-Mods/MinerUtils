package com.danymany.minerutils.init;

import com.danymany.minerutils.block.blockDiamondGlass;
import com.danymany.minerutils.block.blockMU;
import com.danymany.minerutils.block.blockSuperClearGlass;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class modblocks
{
    public static final blockMU DiamondGlass = new blockDiamondGlass();
    public static final blockMU SuperClearGlass = new blockSuperClearGlass();

    public static void init()
    {
        GameRegistry.registerBlock(DiamondGlass, "blockDiamondGlass");
        GameRegistry.registerBlock(SuperClearGlass, "blockSuperClearGlass");
    }

    public static Block blockDiamondGlass = new blockDiamondGlass().setBlockTextureName("minerutils:blockDiamondGlass");
    public static Block blockSuperClearGlass = new blockSuperClearGlass().setBlockTextureName("minerutils:blockSuperClearGlass");

}
