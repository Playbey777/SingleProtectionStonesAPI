package org.playbey.singleprotectionstonesapi.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.playbey.singleprotectionstonesapi.objects.PSRegion;

import javax.annotation.Nullable;

public class PSRegionRemoveEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Player player; // Может быть null, если удалено консолью/взрывом
    private final PSRegion region;
    private final Cause cause;
    private boolean cancelled;

    public enum Cause {
        PLAYER_BREAK,
        COMMAND,
        EXPLOSION,
        OTHER
    }

    public PSRegionRemoveEvent(@Nullable Player player, PSRegion region, Cause cause) {
        this.player = player;
        this.region = region;
        this.cause = cause;
    }

    @Nullable
    public Player getPlayer() { return player; }
    public PSRegion getRegion() { return region; }
    public Cause getCause() { return cause; }

    @Override
    public boolean isCancelled() { return cancelled; }

    @Override
    public void setCancelled(boolean cancel) { this.cancelled = cancel; }

    @Override
    public HandlerList getHandlers() { return handlers; }

    public static HandlerList getHandlerList() { return handlers; }
}