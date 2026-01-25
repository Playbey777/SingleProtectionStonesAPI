package org.playbey.singleprotectionstonesapi.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PSRegionCreateEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Location location;
    private final String materialName;
    private boolean cancelled;

    public PSRegionCreateEvent(Player player, Location location, String materialName) {
        this.player = player;
        this.location = location;
        this.materialName = materialName;
    }

    public Player getPlayer() { return player; }
    public Location getLocation() { return location; }
    public String getMaterialName() { return materialName; }

    @Override
    public boolean isCancelled() { return cancelled; }

    @Override
    public void setCancelled(boolean cancel) { this.cancelled = cancel; }

    @Override
    public HandlerList getHandlers() { return handlers; }

    public static HandlerList getHandlerList() { return handlers; }
}