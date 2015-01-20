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
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockDiamondGlass), "ggg", "gig", "gdg", 'g', Blocks.glass, 'i', moditems.itemCrafter, 'd', Items.diamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(moditems.itemCrafter), "cic", "isi", "cic", 's', Items.stick, 'c', Blocks.cobblestone, 'i', Items.iron_ingot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modblocks.blockSuperClearGlass), "ggg", "gcg", "gig", 'g', Blocks.glass, 'c', moditems.itemCrafter, 'i', Items.iron_ingot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.obsidian), "ppp", "lll", "www", 'p', Items.iron_pickaxe, 'l', Items.lava_bucket, 'w', Items.water_bucket));
    }
}
