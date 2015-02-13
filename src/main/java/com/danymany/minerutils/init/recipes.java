package com.danymany.minerutils.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockDiamondGlass, 16), "ggg", "gig", "gdg", 'g', Blocks.glass, 'i', moditems.itemCrafter, 'd', Items.diamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(moditems.itemCrafter), "cic", "isi", "cic", 's', Items.stick, 'c', Blocks.cobblestone, 'i', Items.iron_ingot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockSuperClearGlass, 7), "ggg", "gcg", "gig", 'g', Blocks.glass, 'c', moditems.itemCrafter, 'i', Items.iron_ingot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.obsidian, 10), "ppp", "lwl", "lll", 'p', Items.iron_pickaxe, 'l', Items.lava_bucket, 'w', Items.water_bucket));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockBlack, 16),"ppp", "ppp","ppp", 'p', new ItemStack(Items.dye, 1, 0)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockBlue, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 4)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockBrown, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 3)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockCyan, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 6)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockGreen, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 2)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockGrey, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 8)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockLightBlue, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 12)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockLightGray, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 7)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockLime, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 10)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockMagenta, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 13)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockOrange, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 14)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockPink, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 9)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockPurple, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 5)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockRed, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 1)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockWhite, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 15)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockYellow, 16), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.dye, 1, 11)));
    }
}