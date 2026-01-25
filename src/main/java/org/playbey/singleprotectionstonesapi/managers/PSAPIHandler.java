package org.playbey.singleprotectionstonesapi.managers;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.playbey.singleprotectionstonesapi.objects.PSRegion;

import java.util.List;
import java.util.UUID;

public interface PSAPIHandler {

    /**
     * Проверяет, является ли материал блоком привата.
     */
    boolean isProtectionBlock(Material material);

    /**
     * Получает регион по локации (если есть).
     */
    PSRegion getRegion(Location location);

    /**
     * Получает регион по ID.
     */
    PSRegion getRegion(String regionId);

    /**
     * Получает список регионов игрока.
     */
    List<PSRegion> getPlayerRegions(Player player);

    /**
     * Получает список регионов игрока по UUID.
     */
    List<PSRegion> getPlayerRegions(UUID playerUUID);

    /**
     * Проверяет, может ли игрок создать регион в данной локации.
     */
    boolean canCreateRegion(Player player, Location location);

    /**
     * Принудительно восстанавливает прочность региона.
     */
    void repairRegion(String regionId);
}