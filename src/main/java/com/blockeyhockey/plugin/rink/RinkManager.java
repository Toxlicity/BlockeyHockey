package com.blockeyhockey.plugin.rink;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.utils.debugger.DebugMessage;
import com.blockeyhockey.utils.debugger.Debugger;
import org.bukkit.configuration.ConfigurationSection;

import java.util.ArrayList;

/**
 * The {@link RinkManager} builds and stores all the {@link Rink}s in the world.
 * @author harvanchik
 * @since 01-16-2021
 */
public class RinkManager {

    private final BlockeyHockey plugin;

    private final ArrayList<Rink> rinks = new ArrayList<>();

    private final ConfigurationSection RINKS_CONFIG;

    public RinkManager(BlockeyHockey plugin) {
        this.plugin = plugin;
        this.RINKS_CONFIG = plugin.getConfig().getConfigurationSection("rinks");
        constructRinks();
    }

    private void constructRinks() {
        if (RINKS_CONFIG != null) {
            for (String key : RINKS_CONFIG.getKeys(false)) {
                rinks.add(
                    new Rink(plugin,
                             new RinkDimension(
                                 RINKS_CONFIG.getDouble(key + ".x1"),
                                 RINKS_CONFIG.getDouble(key + ".y1"),
                                 RINKS_CONFIG.getDouble(key + ".z1"),
                                 RINKS_CONFIG.getDouble(key + ".x2"),
                                 RINKS_CONFIG.getDouble(key + ".y2"),
                                 RINKS_CONFIG.getDouble(key + ".z2")
                             )
                    )
                );
            }
        } else {
            Debugger.debug("No rinks were found in the config! Add at least one rink.", DebugMessage.ERROR);
        }
    }

    /**
     * Get all rinks loaded in the world.
     * @return an array of rinks loaded in the world.
     */
    public Rink[] getRinks() {
        return rinks.toArray(new Rink[0]);
    }
}
