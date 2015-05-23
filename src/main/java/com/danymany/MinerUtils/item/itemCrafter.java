package com.danymany.minerutils.item;

import net.minecraft.item.ItemStack;

public class itemCrafter extends itemMU
{
    public itemCrafter()
    {
        super();
        this.maxStackSize = 1;
        this.setUnlocalizedName("itemCrafter");
        this.setTextureName("minerutils:itemcrafter");
        this.setNoRepair();
        this.setMaxDamage(10);

    }
    @Override
    public boolean isRepairable()
    {
        return false;
    }
    public boolean doesContainerItemLeaveCraftingGrid( ItemStack a, ItemStack b)
    {
        return false;
    }





}
