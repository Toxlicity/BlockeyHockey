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

    public HockeyPlayerManager hockeyPlayerManager;
    public RinkManager rinkManager;

    private int numErrors = 0;

    @Override
    public void onEnable() {
        // configuration
        loadConfig();
        // create manager classes
        hockeyPlayerManager = new HockeyPlayerManager(this);
        rinkManager = new RinkManager(this);
        // register permissions
        Permissions.registerAll();
        // register listener classes
        new BasicListener(this);
        printLoadedMessage();
    }

    @Override
    public void onLoad() {
        registerCommands();
    }

    /**
     * Register all of the commands.
     */
    private void registerCommands() {
        BasicBukkitCommandGraph cmdGraph = new BasicBukkitCommandGraph();
        // all of the commands to register
        cmdGraph.getRootDispatcherNode().registerCommands(new DebuggerCommand());
        new BukkitIntake(this, cmdGraph).register();
    }

    /**
     * Load the default configuration file.
     */
    private void loadConfig() {
        try {
            saveDefaultConfig();
        } catch (Exception e) {
            numErrors++;
            Debugger.debug("There was an error loading the config! Unable to set up rinks.", DebugMessage.ERROR);
            e.printStackTrace();
        }
    }

    /**
     * Print a {@link Debugger} message on the status of the plugin.
     * It will print a success message if no errors were found in the start up of the plugin.
     * It will print a warning message with the number of errors detected if errors were caught in the start up of
     * the plugin.
     */
    private void printLoadedMessage() {
        if (numErrors < 1) {
            Debugger.debug("Plugin loaded successfully!", DebugMessage.SUCCESS);
        } else {
            Debugger.debug("Plugin loaded with " + numErrors + " error(s). See stack traces.", DebugMessage.WARNING);
        }
    }

    @Override
    public void onDisable() {
        hockeyPlayerManager.removeAllHockeyPlayers();
    }
}
