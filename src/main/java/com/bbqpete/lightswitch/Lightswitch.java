package com.bbqpete.lightswitch;

import com.bbqpete.lightswitch.reference.Reference;
import com.bbqpete.lightswitch.proxy.CommonProxy;
import com.bbqpete.lightswitch.proxy.IProxy;
import com.bbqpete.lightswitch.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Lightswitch
{

    @Mod.Instance(Reference.MOD_ID)
    public static Lightswitch instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.inform("lightswitch PreInit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.inform("lightswitch Init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.inform("lightswitch PostInit");
    }

}
