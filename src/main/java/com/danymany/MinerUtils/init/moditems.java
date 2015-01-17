package com.danymany.MinerUtils.init;

import com.danymany.MinerUtils.item.itemCrafter;
import com.danymany.MinerUtils.item.itemMU;
import cpw.mods.fml.common.registry.GameRegistry;

public class moditems
{
    public static final itemMU itemCrafter = new itemCrafter();

    public static void init()
    {
        GameRegistry.registerItem(itemCrafter, "itemCrafter");
    }
}
