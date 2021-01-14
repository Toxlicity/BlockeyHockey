package com.blockeyhockey.plugin.player;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.utils.debugger.DebugMessage;
import com.blockeyhockey.utils.debugger.Debugger;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.UUID;

/**
 * The {@link HockeyPlayerManager} manages and stores all {@link HockeyPlayer}'s.
 * @author harvanchik
 * @since 01-13-2021
 */
public class HockeyPlayerManager {

    private final BlockeyHockey plugin;

    private HashMap<UUID, HockeyPlayer> hockeyPlayers;

    /**
     * Create the {@link HockeyPlayerManager}.
     * @param plugin The plugin's main instance.
     */
    public HockeyPlayerManager(@NotNull final BlockeyHockey plugin) {
        this.plugin = plugin;
        this.hockeyPlayers = new HashMap<>();
    }

    /**
     * Create and store {@link HockeyPlayer} in the {@link HockeyPlayerManager}.
     * @param player The {@link Player} to create a {@link HockeyPlayer} for.
     */
    public void createHockeyPlayer(@NotNull final Player player) {
        if (hockeyPlayers.put(player.getUniqueId(), new HockeyPlayer(player, plugin)) != null) {
            Debugger.console(player.getName() + " added to hockeyPlayers HashMap.", DebugMessage.SUCCESS);
        }
    }

    /**
     * Get a {@link HockeyPlayer} from the {@link HockeyPlayerManager}.
     * @param uuid The {@link UUID} of the {@link Player} to search for.
     * @return The {@link HockeyPlayer} with specified {@link UUID}.
     */
    public HockeyPlayer getHockeyPlayer(@NotNull final UUID uuid) {
        return hockeyPlayers.get(uuid);
    }

    /**
     * Remove a {@link HockeyPlayer} from the {@link HockeyPlayerManager}.
     * @param uuid The {@link UUID} of the {@link HockeyPlayer} to remove.
     */
    public void removeHockeyPlayer(@NotNull final UUID uuid) {
        if (hockeyPlayers.remove(uuid, getHockeyPlayer(uuid))) {
            Debugger.console(getHockeyPlayer(uuid).getPlayer().getName() + " was removed from the hockeyPlayers HashMap.",
                DebugMessage.SUCCESS);
        }
    }

    /**
     * Remove all {@link HockeyPlayer}'s from the {@link HockeyPlayerManager}.
     */
    public void removeAllHockeyPlayers() {
        hockeyPlayers.clear();
    }
}
