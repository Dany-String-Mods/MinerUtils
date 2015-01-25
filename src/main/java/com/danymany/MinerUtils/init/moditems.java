package com.danymany.minerutils.init;

import com.danymany.minerutils.item.itemCrafter;
import com.danymany.minerutils.item.itemMU;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class moditems
{
    public static final itemMU itemCrafter = new itemCrafter();

    public static void init()
    {
        GameRegistry.registerItem(itemCrafter, "itemCrafter");
    }


}
