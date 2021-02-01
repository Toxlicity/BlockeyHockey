package com.blockeyhockey.plugin.command;

import app.ashcon.intake.Command;
import com.blockeyhockey.plugin.api.Permissions;
import com.blockeyhockey.utils.debugger.Debugger;
import org.bukkit.command.CommandSender;

/**
 * The command to toggle on and off debug messages.
 * @author harvanchik
 * @since 01-14-2021
 */
public class DebuggerCommand {

    @Command(
        aliases = {"debugger", "debug"},
        desc = "Toggle debug messages in chat and console.",
        perms = Permissions.DEBUG
    )
    public void debugger() {
        Debugger.toggleDebug();
    }
}
