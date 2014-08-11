package mods.compactblocks.creativetab;

import mods.compactblocks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
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
