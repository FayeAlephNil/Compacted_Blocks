package mods.compactblocks;

import mods.compactblocks.handler.ConfigurationHandler;
import mods.compactblocks.init.ModBlocks;
import mods.compactblocks.init.Recipes;
import mods.compactblocks.proxy.CommonProxy;
import mods.compactblocks.reference.Reference;
import mods.compactblocks.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class CompactBlocks
{
    @Mod.Instance(Reference.MOD_ID)
    public static CompactBlocks instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.initRenderers();
        proxy.initSounds();


        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

        ModBlocks.addNames();
        ModBlocks.registerTileEntities();

        Recipes.init();

        LogHelper.info("Initialization Complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");

    }

}
