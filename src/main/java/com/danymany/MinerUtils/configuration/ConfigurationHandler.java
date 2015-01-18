package com.danymany.minerutils.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean itemInit = true;
        boolean blockInit = true;
        try
        {
            //Load the configuration file
            configuration.load();

            itemInit = configuration.get(Configuration.CATEGORY_GENERAL, "itemInit", true, "This says if you want items or not").getBoolean(true);
            blockInit = configuration.get(Configuration.CATEGORY_GENERAL, "blockInit" , true, "This says if you want blocks or not").getBoolean(true);
        }
        catch (Exception e)
        {
            //Log the exception
        }
        finally
        {
            //Save The configuration file
            configuration.save();
        }

        System.out.println(itemInit);
        System.out.println(blockInit);
    }
}
