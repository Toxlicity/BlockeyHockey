package com.blockeyhockey.plugin.command;

import app.ashcon.intake.Command;
import com.blockeyhockey.plugin.puck.Puck;
import com.blockeyhockey.plugin.api.Permissions;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PuckCommand {

    @Command(
        aliases = {"puck"},
        desc = "Spawn a puck at your location.",
        perms = Permissions.PUCK
    )
    public void spawnPuck(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            new Puck(player.getLocation());
        }
    }
}
