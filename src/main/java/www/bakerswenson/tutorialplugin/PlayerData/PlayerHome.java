package www.bakerswenson.tutorialplugin.PlayerData;

import org.bukkit.event.Listener;

public class PlayerHome implements Listener {
    private String name;
    private float x;
    private float y;
    private float z;


    public PlayerHome(String name, float x, float y, float z){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }


}
