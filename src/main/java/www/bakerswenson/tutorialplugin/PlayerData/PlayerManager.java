package www.bakerswenson.tutorialplugin.PlayerData;

import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.UUID;

public class PlayerManager implements Listener {
    private UUID uuid;
    private ArrayList<PlayerHome> PlayerHomes = new ArrayList<PlayerHome>();

    public PlayerManager(UUID uuid){
        this.uuid = uuid;
    }


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void addNewPlayerHome( String name, float x, float y, float z){
        this.PlayerHomes.add(
                new PlayerHome(name, x, y, z));
    }

    public ArrayList<PlayerHome> getSensorReadings() {
        return PlayerHomes;
    }

}
