package com.danymany.minerutils.init;

import com.danymany.minerutils.item.itemCrafter;
import com.danymany.minerutils.item.itemMU;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class moditems
{
    public static final itemMU Crafter = new itemCrafter();

    public static void init()
    {
        GameRegistry.registerItem(Crafter, "itemCrafter");
    }

    public static Item itemCrafter = new itemCrafter().setTextureName("minerutilities:itemCrafter");
}
