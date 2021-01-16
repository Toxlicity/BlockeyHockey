package com.blockeyhockey.plugin;

import app.ashcon.intake.bukkit.BukkitIntake;
import app.ashcon.intake.bukkit.graph.BasicBukkitCommandGraph;
import com.blockeyhockey.plugin.api.Permissions;
import com.blockeyhockey.plugin.command.DebuggerCommand;
import com.blockeyhockey.plugin.listeners.BasicListener;
import com.blockeyhockey.plugin.player.HockeyPlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main instance of the plugin.
 * @author harvanchik
 * @since 01-12-2021
 */
public final class BlockeyHockey extends JavaPlugin {

    public final HockeyPlayerManager hockeyPlayerManager;

    /**
     * The constructor for the main instance.
     */
    public BlockeyHockey() {
        this.hockeyPlayerManager = new HockeyPlayerManager(this);
    }

    @Override
    public void onEnable() {
        Permissions.registerAll();
        // register listener classes
        new BasicListener(this);
    }

    @Override
    public void onLoad() {
        registerCommands();
    }

    private void registerCommands() {
        BasicBukkitCommandGraph cmdGraph = new BasicBukkitCommandGraph();
        // all of the commands to register
        cmdGraph.getRootDispatcherNode().registerCommands(new DebuggerCommand());
        new BukkitIntake(this, cmdGraph).register();
    }

    @Override
    public void onDisable() {
        hockeyPlayerManager.removeAllHockeyPlayers();
    }
}
