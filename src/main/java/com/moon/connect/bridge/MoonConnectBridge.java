package com.moon.connect.bridge;

import org.bukkit.plugin.java.JavaPlugin;

public class MoonConnectBridge extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MoonConnectBridge Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MoonConnectBridge Disabled!");
    }
}
