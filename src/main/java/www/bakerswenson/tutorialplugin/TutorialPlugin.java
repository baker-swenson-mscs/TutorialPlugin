package www.bakerswenson.tutorialplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TutorialPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        getServer().getPluginManager().registerEvents(this, this);
    }


    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.sendMessage("sup nigga");
    }

    public void playerChat(AsyncPlayerChatEvent event){
        event.getMessage();
    }

}
