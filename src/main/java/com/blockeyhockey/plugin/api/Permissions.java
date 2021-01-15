package com.blockeyhockey.plugin.api;

import com.google.common.collect.ImmutableMap;
import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

import java.util.stream.Stream;

/**
 * A hard-coded list of permissions.
 */
public interface Permissions {

    // Root permission node
    String ROOT = "hockey";

    // Individual permission nodes
    String HELP = ROOT + ".help";       // basic help notes for the hockey plugin
    String DEBUG = ROOT + ".debug";     // view and toggle debug messages in chat

    // Role-specific permission nodes
    Permission DEFAULT =
        new Permission(
            ROOT + ".default",
            PermissionDefault.TRUE,
            new ImmutableMap.Builder<String, Boolean>()
                .put(HELP, true)
                .build());

    Permission MODERATOR =
        new Permission(
            ROOT + ".mod",
            PermissionDefault.FALSE,
            new ImmutableMap.Builder<String, Boolean>()
                .putAll(DEFAULT.getChildren())
                .put(DEFAULT.getName(), true)
                .build());

    Permission DEVELOPER =
        new Permission(
            ROOT + ".dev",
            PermissionDefault.FALSE,
            new ImmutableMap.Builder<String, Boolean>()
                .putAll(MODERATOR.getChildren())
                .put(MODERATOR.getName(), true)
                .put(DEBUG, true)
                .build());

    Permission ADMIN =
        new Permission(
            ROOT + ".*",
            PermissionDefault.OP,
            new ImmutableMap.Builder<String, Boolean>()
                .putAll(DEVELOPER.getChildren())
                .put(DEVELOPER.getName(), true)
                .build());

    static void registerAll() {
        Stream.of(DEFAULT, MODERATOR, DEVELOPER, ADMIN).forEachOrdered(Permissions::register);
    }

    /**
     * @param permission The permission to register.
     * @return The permission that was registered.
     */
    static Permission register(Permission permission) {
        try {
            Bukkit.getServer().getPluginManager().addPermission(permission);
        } catch (Throwable t) {
            // No-op, the permission was already registered
        }
        return permission;
    }
}
