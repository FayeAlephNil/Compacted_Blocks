package mods.compactblocks.init;
import mods.compactblocks.block.*;
import mods.compactblocks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{

    //Compressed Blocks
    public static final BlockCB compressed_obsidian = new BlockCompressedObsidian();
    public static final BlockCB log_pile = new BlockLogPile();

    //Compressed Items
    public static final BlockCB stick_bundle = new BlockStickBundle();
    public static final BlockCB blaze_rod_bundle = new BlockBlazeRodBundle();

    public static void init()
    {
        //Compressed Blocks
        GameRegistry.registerBlock(compressed_obsidian, "compressed_obsidian");
        GameRegistry.registerBlock(log_pile, "log_pile");

        //Compressed Items
        GameRegistry.registerBlock(stick_bundle, "stick_bundle");
        GameRegistry.registerBlock(blaze_rod_bundle, "blaze_rod_bundle");

    }

    public static void addNames()
    {

    }

    public static void registerTileEntities()
    {
    }
}
