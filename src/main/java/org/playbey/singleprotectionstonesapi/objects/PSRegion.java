package org.playbey.singleprotectionstonesapi.objects;

import org.bukkit.Location;
import org.bukkit.Material;

import java.util.List;
import java.util.UUID;

public interface PSRegion {

    String getId();

    UUID getOwnerId();

    String getOwnerName();

    Location getLocation();

    Material getType();

    int getDurability();

    int getMaxDurability();

    List<UUID> getMembers();

    List<UUID> getOwners();

    boolean isDestroyed();
}