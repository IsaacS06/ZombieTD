package com.main;

import com.badlogic.gdx.graphics.Texture;
import java.util.HashMap;

public class Tables {
    static HashMap<String, Texture> cannon_resources = new HashMap<String, Texture>();
    static HashMap<String, Texture> button_resources = new HashMap<String, Texture>();
    static HashMap<String, Texture> zombie_resources = new HashMap<String, Texture>();
    static HashMap<String, Texture> resources = new HashMap<String, Texture>();
    static HashMap<String, String> tooltip_info = new HashMap<String, String>();
    static HashMap<String, Integer>values = new HashMap<String, Integer>();

    static void init(){
        resources.put("effect_boom", Resources.boom);
        resources.put("effect_muzzle_flash", Resources.muzzle_flash);
        resources.put("effect_particles", Resources.particles);
        resources.put("effect_click", Resources.click);

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
        button_resources.put("flappy", Resources.flappy_cannon_button);
        button_resources.put("close", Resources.button_close);
        button_resources.put("wall", Resources.wall_button);
        button_resources.put("pause", Resources.pause);
        button_resources.put("play", Resources.play);
        button_resources.put("start", Resources.start_button);
        button_resources.put("exit", Resources.exit_button);

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

        //Cannon placement costs
        values.put("place_fire", 30);
        values.put("place_super", 25);
        values.put("place_laser", 30);
        values.put("place_double", 30);

        //CANNON UNLOCK COSTS
        values.put("unlock_fire", 500);
        values.put("unlock_super", 500);
        values.put("unlock_laser", 1000);
        values.put("unlock_double", 250);

        //CANNON FIRE DELAY
        values.put("delay_fire", 10);
        values.put("delay_laser", 100);
        values.put("delay_double", 40);

        //ZOMBIE SPEED
        values.put("speed_dif", 1);
        values.put("speed_speedy", 5);
        values.put("speed_fast", 3);
        values.put("speed_riot", 1);

        //ZOMBIE HEALTH
        values.put("health_dif", 2);
        values.put("health_speedy", 2);
        values.put("health_fast", 3);
        values.put("health_riot", 10);

        //ANIMATION COLUMNS
        values.put("columns_laser", 16);
        values.put("columns_speedy", 6);
        values.put("columns_boom", 7);
        values.put("columns_particles", 11);
    }
}
