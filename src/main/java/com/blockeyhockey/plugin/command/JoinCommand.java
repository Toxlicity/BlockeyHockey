package com.blockeyhockey.plugin.command;

import app.ashcon.intake.Command;
import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.api.Permissions;
import com.blockeyhockey.plugin.player.HockeyPlayer;
import com.blockeyhockey.plugin.player.HockeyPlayerManager;
import com.blockeyhockey.plugin.rink.RinkManager;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * The command to join a rink.
 * @author harvanchik
 * @since 02-02-2021
*/
public class JoinCommand {

    private final BlockeyHockey plugin;

    private final HockeyPlayerManager hockeyPlayerManager;
    private final RinkManager rinkManager;

    public JoinCommand(BlockeyHockey plugin) {
        this.plugin = plugin;
        this.hockeyPlayerManager = plugin.hockeyPlayerManager;
        this.rinkManager = plugin.rinkManager;
    }

    // TODO: learn how to accept a rink instead of string of rink name
    @Command(
        aliases = "join",
        desc = "Join a rink/game.",
        usage = "[rink]",
        perms = Permissions.JOIN
    )
    public void join(CommandSender sender, String rinkName) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            HockeyPlayer hockeyPlayer = hockeyPlayerManager.getHockeyPlayer(player.getUniqueId());
            hockeyPlayer.setRink(rinkManager.getRink(rinkName));
        }
    }
}
