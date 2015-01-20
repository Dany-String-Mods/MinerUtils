package com.danymany.minerutils.creativetab;

import com.danymany.minerutils.init.moditems;
import com.danymany.minerutils.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMinerUtils
{
    public static final CreativeTabs MinerUtils_TAB = new CreativeTabs("Miner Utilities") {
        @Override
        public Item getTabIconItem() {
            return moditems.Crafter;
        }
    };
}
