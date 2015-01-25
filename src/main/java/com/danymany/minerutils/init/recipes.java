package com.danymany.minerutils.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockDiamondGlass, 16), "ggg", "gig", "gdg", 'g', Blocks.glass, 'i', moditems.itemCrafter, 'd', Items.diamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(moditems.itemCrafter), "cic", "isi", "cic", 's', Items.stick, 'c', Blocks.cobblestone, 'i', Items.iron_ingot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockSuperClearGlass, 7), "ggg", "gcg", "gig", 'g', Blocks.glass, 'c', moditems.itemCrafter, 'i', Items.iron_ingot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.obsidian, 10), "ppp", "lwl", "lll", 'p', Items.iron_pickaxe, 'l', Items.lava_bucket, 'w', Items.water_bucket));
    }
}
