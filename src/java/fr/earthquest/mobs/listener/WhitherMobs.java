package fr.earthquest.mobs.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class WhitherMobs implements Listener {

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.WITHER) {
            event.setCancelled(true);
            for (Player player : event.getEntity().getWorld().getPlayers()) {
                player.sendMessage(ChatColor.RED + "Il est interdit de faire spawn un Wither !");
            }
        }
    }
}
