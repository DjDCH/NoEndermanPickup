package com.djdch.bukkit.noendermanpickup.listener;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

/**
 * Class who listen for any Enderman events.
 * 
 * @author djdch
 */
public class EndermanListener implements Listener {
    /**
     * Constructor for the initialization of the EndermanListener class.
     */
    public EndermanListener() {
    }

    /**
     * Method who is called each time an entity change a block in the game.
     * 
     * @param event Contains the EntityChangeBlockEvent instance.
     */
    @EventHandler(priority = EventPriority.NORMAL)
    public void onEndermanPickup(EntityChangeBlockEvent event) {
        Entity entity = event.getEntity();

        if (entity instanceof Enderman) {
            event.setCancelled(true);
        }
    }
}
