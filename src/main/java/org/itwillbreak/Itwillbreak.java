package org.itwillbreak;

import org.bukkit.plugin.java.JavaPlugin;

public final class Itwillbreak extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("ItWillBreak has been enabled")

    }

    @Override
    public void onDisable() {

        getLogger().info("ItWillBreak has been disabled")

    }
}
