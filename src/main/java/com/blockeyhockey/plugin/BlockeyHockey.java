package com.blockeyhockey.plugin;

import app.ashcon.intake.bukkit.BukkitIntake;
import app.ashcon.intake.bukkit.graph.BasicBukkitCommandGraph;
import com.blockeyhockey.plugin.api.Permissions;
import com.blockeyhockey.plugin.command.DebuggerCommand;
import com.blockeyhockey.plugin.listeners.BasicListener;
import com.blockeyhockey.plugin.player.HockeyPlayerManager;
import com.blockeyhockey.plugin.rink.RinkManager;
import com.blockeyhockey.utils.debugger.DebugMessage;
import com.blockeyhockey.utils.debugger.Debugger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main instance of the plugin.
 * @author harvanchik
 * @since 01-12-2021
 */
public final class BlockeyHockey extends JavaPlugin {

    public final HockeyPlayerManager hockeyPlayerManager;
    public final RinkManager rinkManager;

    /**
     * The constructor for the main instance.
     */
    public BlockeyHockey() {
        this.hockeyPlayerManager = new HockeyPlayerManager(this);
        this.rinkManager = new RinkManager(this);
    }

    @Override
    public void onEnable() {
        Permissions.registerAll();
        // register listener classes
        new BasicListener(this);
        Debugger.console("Plugin loaded successfully!", DebugMessage.SUCCESS);
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
