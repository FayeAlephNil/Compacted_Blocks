package com.strikingwolf.compactblocks.init;
import com.strikingwolf.compactblocks.block.*;
import com.strikingwolf.compactblocks.reference.BlocksReference;
import com.strikingwolf.compactblocks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{

    //Compressed Blocks
    public static final BlockCB compressed_obsidian = new BlockCompressedObsidian();

    //Compressed Items
    public static final BlockCB stick_bundle = new BlockStickBundle();

    public static void init()
    {

        //Compressed Blocks
        GameRegistry.registerBlock(compressed_obsidian, "compressed_obsidian");

        //Compressed Items
        GameRegistry.registerBlock(stick_bundle, "stick_bundle");

    }

    public static void addNames()
    {

    }

    public static void registerTileEntities()
    {
    }
}
