package com.main;

import com.badlogic.gdx.graphics.Texture;
import java.util.HashMap;

public class Tables {
    static HashMap<String, Texture> cannon_resources = new HashMap<String, Texture>();
    static HashMap<String, Texture> button_resources = new HashMap<String, Texture>();
    static HashMap<String, Texture> zombie_resources = new HashMap<String, Texture>();
    static HashMap<String, String> tooltip_info = new HashMap<String, String>();

    static void init(){
        cannon_resources.put("cannon", Resources.cannon);
        cannon_resources.put("fire", Resources.fire_cannon);
        cannon_resources.put("double", Resources.double_cannon);
        cannon_resources.put("flappy", Resources.evil_flappy_cannon);
        cannon_resources.put("laser", Resources.laser_cannon);
        cannon_resources.put("mounted", Resources.mounted_cannon);
        cannon_resources.put("super", Resources.super_cannon);

        button_resources.put("fire", Resources.fire_cannon_button);
        button_resources.put("super", Resources.super_cannon_button);
        button_resources.put("double", Resources.double_cannon_button);
        button_resources.put("laser", Resources.laser_cannon_button);
        button_resources.put("mounted", Resources.mounted_cannon_button);
        button_resources.put("mounted", Resources.flappy_cannon_button);
        button_resources.put("close", Resources.button_close);

        tooltip_info.put("cannon", "Fires some bullets at some rate of fire.");
        tooltip_info.put("fire", "Fires some bullets at some rate of fire.");
        tooltip_info.put("super", "Fires some bullets at some rate of fire.");
        tooltip_info.put("double", "Fires some bullets at some rate of fire.");
        tooltip_info.put("laser", "Fires some bullets at some rate of fire.");
        tooltip_info.put("mounted", "Fires some bullets at some rate of fire.");
        tooltip_info.put("flappy", "Fires some bullets at some rate of fire.");

        zombie_resources.put("dif", Resources.dif_zombie);
        zombie_resources.put("speedy", Resources.speedy_zombie);
        zombie_resources.put("riot", Resources.riot_zombie);
        zombie_resources.put("BIGriot", Resources.riot_zombie_big);
        zombie_resources.put("fast", Resources.fast_zombie);
    }
}
