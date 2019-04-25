package io.github.c9lul12btw.utils;

import io.github.c9lul12btw.Main;
import org.bukkit.entity.Player;

public class LoggerUtil {

    /**
     * Sends a certain player a message.
     * @param player, msg
     */
    public static void sendMessage(Player player, String msg) {
        player.sendMessage(msg.replace("&", "§"));
    }

    /**
     * Sends a message to the console
     * @param msg
     */
    public static void logMessage(String msg) {
        Main.getPlugin(Main.class).getLogger().info(msg.replace("&", "§"));
    }

}
