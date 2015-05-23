package com.danymany.minerutils.init;

import com.danymany.minerutils.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class modblocks
{
    public static final blockMU blockDiamondGlass = new blockDiamondGlass();
    public static final blockMU blockSuperClearGlass = new blockSuperClearGlass();
    public static final blockMU blockBlue = new blockBlue();
    public static final blockMU blockBlack = new blockBlack();
    public static final blockMU blockBrown = new blockBrown();
    public static final blockMU blockCyan = new blockCyan();
    public static final blockMU blockGreen = new blockGreen();
    public static final blockMU blockGrey = new blockGrey();
    public static final blockMU blockLightBlue = new blockLightBlue();
    public static final blockMU blockLightGray = new blockLightGray();
    public static final blockMU blockLime = new blockLime();
    public static final blockMU blockMagenta = new blockMagenta();
    public static final blockMU blockOrange = new blockOrange();
    public static final blockMU blockPink = new blockPink();
    public static final blockMU blockPurple = new blockPurple();
    public static final blockMU blockRed = new blockRed();
    public static final blockMU blockYellow = new blockYellow();
    public static final blockMU blockQuestionMark = new blockQuestionMark();
    public static final blockMU blockWhite = new blockWhite();
    public static final blockMU blockElis = new blockElis();

    public static void init()
    {
        GameRegistry.registerBlock(blockDiamondGlass, "blockDiamondGlass");
        GameRegistry.registerBlock(blockSuperClearGlass, "blockSuperClearGlass");
        GameRegistry.registerBlock(blockBlue, "blockBlue");
        GameRegistry.registerBlock(blockBlack, "blockBlack");
        GameRegistry.registerBlock(blockBrown, "blockBrown");
        GameRegistry.registerBlock(blockCyan, "blockCyan");
        GameRegistry.registerBlock(blockGreen, "blockGreen");
        GameRegistry.registerBlock(blockGrey, "blockGrey");
        GameRegistry.registerBlock(blockLightBlue, "blockLightBlue");
        GameRegistry.registerBlock(blockLightGray, "blockLightGray");
        GameRegistry.registerBlock(blockLime, "blockLime");
        GameRegistry.registerBlock(blockMagenta, "blockMagenta");
        GameRegistry.registerBlock(blockOrange, "blockOrange");
        GameRegistry.registerBlock(blockPink, "blockPink");
        GameRegistry.registerBlock(blockPurple, "blockPurple");
        GameRegistry.registerBlock(blockRed, "blockRed");
        GameRegistry.registerBlock(blockYellow, "blockYellow");
        GameRegistry.registerBlock(blockWhite, "blockWhite");
        GameRegistry.registerBlock(blockQuestionMark, "blockQuestionMark");
        GameRegistry.registerBlock(blockElis, "blockElis");
    }

}