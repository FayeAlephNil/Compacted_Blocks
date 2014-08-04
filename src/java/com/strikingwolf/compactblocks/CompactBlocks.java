package com.strikingwolf.compactblocks;

import com.strikingwolf.compactblocks.handler.ConfigurationHandler;
import com.strikingwolf.compactblocks.init.ModBlocks;
import com.strikingwolf.compactblocks.init.Recipes;
import com.strikingwolf.compactblocks.proxy.CommonProxy;
import com.strikingwolf.compactblocks.proxy.IProxy;
import com.strikingwolf.compactblocks.reference.Reference;
import com.strikingwolf.compactblocks.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
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
