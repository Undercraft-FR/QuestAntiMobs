package fr.earthquest.mobs.listener;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class EnderDragonMobs implements Listener {

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.ENDER_DRAGON) {
            event.setCancelled(true);
            for (Player player : event.getEntity().getWorld().getPlayers()) {
                System.out.println("L'enderdragon a disparu !");
            }
        }
    }
}
