package org.playbey.singleprotectionstonesapi.managers;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.playbey.singleprotectionstonesapi.objects.PSRegion;

import java.util.List;
import java.util.UUID;

public interface PSAPIHandler {

    boolean isProtectionBlock(Material material);

    PSRegion getRegion(Location location);

    PSRegion getRegion(String regionId);

    List<PSRegion> getPlayerRegions(Player player);

    List<PSRegion> getPlayerRegions(UUID playerUUID);

    boolean canCreateRegion(Player player, Location location);

    void repairRegion(String regionId);
}