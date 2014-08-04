package com.strikingwolf.compactblocks.creativetab;

import com.strikingwolf.compactblocks.init.ModBlocks;
import com.strikingwolf.compactblocks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabCB
{
    public static final CreativeTabs CB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return Items.stick;
        }
    };
}
