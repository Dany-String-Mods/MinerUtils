package com.danymany.MinerUtils.creativetab;

import com.danymany.MinerUtils.init.moditems;
import com.danymany.MinerUtils.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMinerUtils
{
    public static final CreativeTabs MinerUtils_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return moditems.itemCrafter;
        }
    };
}
