package com.blockeyhockey.plugin.Puck;

import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Endermite;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

/**
 * The hockey puck.
 * @since 01-31-2021
 * @author harvanchik
 */
public class Puck {

    private final Endermite puck;

    /**
     * Spawn a new puck at the specified location.
     * @param location The location to spawn the puck at.
     */
    public Puck(@NotNull final Location location) {
        this.puck = (Endermite) location.getWorld().spawnEntity(location, EntityType.ENDERMITE);
        configurePuck();
        // TODO: spawn puck entity from config instead of hard coded endermite
    }

    private void configurePuck() {
        // entity data
        puck.setFallDistance(0);
        puck.setSilent(true);
        puck.setPersistent(true);
        puck.setRemoveWhenFarAway(false);
        // attributes
        puck.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0);
        puck.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(0);
        // effects
        puck.addPotionEffect(new PotionEffect(
            PotionEffectType.DAMAGE_RESISTANCE,
            Integer.MAX_VALUE,
            255,
            false,
            false,
            false)
        );
        // tag
        puck.addScoreboardTag("puck");
    }
}
