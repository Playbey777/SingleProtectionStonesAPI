package org.playbey.singleprotectionstonesapi;

import org.bukkit.plugin.java.JavaPlugin;
import org.playbey.singleprotectionstonesapi.managers.PSAPIHandler;

public class SingleProtectionStonesAPI extends JavaPlugin {

    private static SingleProtectionStonesAPI instance;
    private static PSAPIHandler implementation;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("SingleProtectionStonesAPI enabled!");
        getLogger().info("Waiting for implementation registration...");
    }

    public static SingleProtectionStonesAPI getInstance() {
        return instance;
    }

    /**
     * Получить доступ к методам API.
     * @return Реализация API или null, если основной плагин не загружен.
     */
    public static PSAPIHandler getAPI() {
        if (implementation == null) {
            throw new IllegalStateException("SingleProtectionStones core plugin is not loaded or hasn't registered the API yet!");
        }
        return implementation;
    }

    /**
     * Внутренний метод для регистрации реализации (вызывается основным плагином).
     */
    public static void registerImplementation(PSAPIHandler handler) {
        implementation = handler;
        if (instance != null) {
            instance.getLogger().info("API Implementation registered successfully!");
        }
    }
}