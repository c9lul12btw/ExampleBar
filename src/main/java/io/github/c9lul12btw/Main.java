package io.github.c9lul12btw;

import io.github.c9lul12btw.cmds.ExampleCommand;
import io.github.c9lul12btw.listeners.ExampleListener;
import io.github.c9lul12btw.utils.GuiUtil;
import io.github.c9lul12btw.utils.RegisterUtil;
import io.github.c9lul12btw.utils.LoggerUtil;
import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Your main class for your plugin.
 */
public class Main extends JavaPlugin { // Must extend JavaPlugin from org.bukkit

    public Permission perm = new Permission("pluginname.permission");

    /**
     * Void that gets called on plugin startup.
     * This can be used to register io.github.c9lul12btw.listeners and commands.
     */
    @Override
    public void onEnable() {
        LoggerUtil.logMessage("Plugin has been enabled!");
        registerCmds();
        registerListeners();
        registerPermissions();
        Bukkit.getPluginManager().registerEvents(new GuiUtil(), this);
    }

    public void registerPermissions() {
        RegisterUtil.registerPermission(perm);
    }

    public void registerListeners() {
        // Registers all class that listen for events, the class must implement Listener at org.bukkit
        RegisterUtil.registerListener(new ExampleListener());
    }

    public void registerCmds() {
        // Registers all the commands and sets their executor class
        RegisterUtil.registerCommand("review", new ExampleCommand());
    }

    /**
     * Void that gets called on plugin shutdown.
     */
    @Override
    public void onDisable() {
        LoggerUtil.logMessage("Plugin has been disabled!");
    }

}
