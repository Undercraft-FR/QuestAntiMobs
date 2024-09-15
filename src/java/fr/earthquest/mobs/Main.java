package fr.earthquest.mobs;

import fr.earthquest.mobs.listener.EnderDragonMobs;
import fr.earthquest.mobs.listener.WhitherMobs;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WhitherMobs(), this);
        getServer().getPluginManager().registerEvents(new EnderDragonMobs(), this);
        getServer().getConsoleSender().sendMessage("Plugin EarthQuestMobs activé !");
    }


}
