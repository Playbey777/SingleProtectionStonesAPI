package org.playbey.singleprotectionstonesapi.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.playbey.singleprotectionstonesapi.objects.PSRegion;

public class PSRegionDamageEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final PSRegion region;
    private int damage;
    private final String explosionType;
    private boolean cancelled;

    public PSRegionDamageEvent(PSRegion region, int damage, String explosionType) {
        this.region = region;
        this.damage = damage;
        this.explosionType = explosionType;
    }

    public PSRegion getRegion() { return region; }
    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
    public String getExplosionType() { return explosionType; }

    @Override
    public boolean isCancelled() { return cancelled; }

    @Override
    public void setCancelled(boolean cancel) { this.cancelled = cancel; }

    @Override
    public HandlerList getHandlers() { return handlers; }

    public static HandlerList getHandlerList() { return handlers; }
}