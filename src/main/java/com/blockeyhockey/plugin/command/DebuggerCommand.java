package com.blockeyhockey.plugin.command;

import app.ashcon.intake.Command;
import com.blockeyhockey.plugin.api.Permissions;
import org.bukkit.command.CommandSender;

public class DebuggerCommand {

    @Command(
        aliases = {"debugger", "debug"},
        desc = "Toggle debug messages in chat and console.",
        perms = Permissions.DEBUG
    )
    public void debugger(CommandSender sender) {

    }

}
