package mods.compactblocks.init;
import mods.compactblocks.block.*;
import mods.compactblocks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

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
