package com.djdch.bukkit.noendermanpickup;

import org.bukkit.plugin.java.JavaPlugin;

import com.djdch.bukkit.noendermanpickup.listener.EndermanListener;

/**
 * Main class of the <b>NoEndermanPickup</b> plugin for Bukkit.
 * <p>
 * Prevent Enderman from picking up blocks.
 * 
 * @author DjDCH
 */
public class NoEndermanPickup extends JavaPlugin {
    /**
     * Contains the endermanListener instance.
     */
    protected EndermanListener endermanListener;

    /**
     * Method execute when the plugin is enable.
     */
    public void onEnable() {
        this.endermanListener = new EndermanListener();

        this.getServer().getPluginManager().registerEvents(this.endermanListener, this);
    }

    /**
     * Method execute when the plugin is disable.
     */
    public void onDisable() {
    }
}
