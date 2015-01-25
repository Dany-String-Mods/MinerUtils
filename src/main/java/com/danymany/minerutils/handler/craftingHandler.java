package com.danymany.minerutils.handler;

import com.danymany.minerutils.item.itemCrafter;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class craftingHandler
{
    public void onCrafting(ItemCraftedEvent event)
    {
        final IInventory craftMatrix = null;
        for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++)
        {
            if(event.craftMatrix.getStackInSlot(i) != null)
            {
                ItemStack item0 = event.craftMatrix.getStackInSlot(i);
                    if(item0 != null && item0.getItem() == itemCrafter)
                    {
                        ItemStack k = new ItemStack(itemCrafter, 2, (item0.getItemDamage() + 1));
                            if (k.getItemDamage() >= k.getMaxDamage())
                            {
                                k.stackSize--;
                            }
                            event.craftMatrix.setInventorySlotContents(i, k);
                    }
            }
        }
    }
}
