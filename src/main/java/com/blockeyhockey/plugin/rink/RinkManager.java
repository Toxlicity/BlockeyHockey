package com.blockeyhockey.plugin.rink;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.utils.debugger.DebugMessage;
import com.blockeyhockey.utils.debugger.Debugger;
import org.bukkit.configuration.ConfigurationSection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The {@link RinkManager} builds and stores all the {@link Rink}s in the world.
 * @author harvanchik
 * @since 01-16-2021
 */
public class RinkManager {

    private final BlockeyHockey plugin;

    private final HashMap<String, Rink> rinks = new HashMap<>();    // key = rink name | value = Rink

    private final ConfigurationSection RINKS_CONFIG;

    /**
     * Create the {@link RinkManager} and get the configuration section for rinks.
     * @param plugin The plugin's main instance.
     */
    public RinkManager(BlockeyHockey plugin) {
        this.plugin = plugin;
        this.RINKS_CONFIG = plugin.getConfig().getConfigurationSection("rinks");
        constructRinks();
    }

    /**
     * Construct the {@link Rink}s based on the values from the configuration.
     */
    private void constructRinks() {
        if (RINKS_CONFIG != null) {
            int numRinks = 0;
            for (String key : RINKS_CONFIG.getKeys(false)) {
                String rinkName = RINKS_CONFIG.getString(key + ".name");    // get rink's name
                if (rinkName != null) {                                        // check that it's not null
                    rinks.put( rinkName.toLowerCase(),
                        new Rink(plugin,
                                 new RinkDimension(
                                     RINKS_CONFIG.getDouble(key + ".x1"),
                                     RINKS_CONFIG.getDouble(key + ".y1"),
                                     RINKS_CONFIG.getDouble(key + ".z1"),
                                     RINKS_CONFIG.getDouble(key + ".x2"),
                                     RINKS_CONFIG.getDouble(key + ".y2"),
                                     RINKS_CONFIG.getDouble(key + ".z2")
                                 ),
                                 rinkName
                        )
                    );
                    numRinks++;
                } else {
                    Debugger.debug("Make sure each rink has a name.", DebugMessage.ERROR);
                }

            }
            Debugger.debug("Successfully created " + numRinks + " rink(s)!", DebugMessage.SUCCESS);
        } else {
            plugin.numErrors++;
            Debugger.debug("No rinks were found in the config! Add at least one rink.", DebugMessage.ERROR);
        }
    }

    /**
     * Get all rinks loaded in the world.
     * @return an array of rinks loaded in the world.
     */
    public Rink[] getRinks() {
        return rinks.values().toArray(new Rink[0]);
    }

    /**
     * Get a {@link Rink} by the rink's name.
     * @param rinkName The name of the {@link Rink}.
     * @return the {@link Rink}.
     */
    public Rink getRink(String rinkName) {
        return rinks.get(rinkName.toLowerCase());
    }
}
