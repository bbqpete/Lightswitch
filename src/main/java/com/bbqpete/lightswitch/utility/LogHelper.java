package com.bbqpete.lightswitch.utility;

import com.bbqpete.lightswitch.reference.Reference;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{

    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel,String.valueOf(object));
    }

    public static void all(Object object){ log(Level.ALL, object); }

    public static void fine(Object object){ log(Level.DEBUG, object); }

    public static void warning(Object object){ log(Level.WARN, object); }

    public static void inform(Object object){ log(Level.INFO, object); }

    public static void off(Object object){ log(Level.OFF, object); }

    public static void finer(Object object){ log(Level.TRACE, object); }

    public static void severe(Object object){ log(Level.ERROR, object); }

}
