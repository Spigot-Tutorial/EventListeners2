package me.shalckercraft.eventlisteners2;

import me.shalckercraft.eventlisteners2.listeners.ShearSheepListener;
import me.shalckercraft.eventlisteners2.listeners.XPBottleBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
