package com.github.Elmartino4.enchantsPlusPlus;

import com.github.Elmartino4.enchantsPlusPlus.config.ModConfig;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnchantsPlusPlus implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "enchants-plus-plus";
    public static final String MOD_NAME = "Enchants++";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        ModConfig.init();

        log(Level.INFO, "Finished initialising");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}
