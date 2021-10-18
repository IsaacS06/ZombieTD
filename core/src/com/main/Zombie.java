package com.main;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Zombie {
    int x, y, w, h;
    int speed;
    String type;

    Zombie(String type, int x, int y, int speed){
        this.type = type;
        w = Tables.zombie_resources.get(type) == null ? 50 : Tables.zombie_resources.get(type).getWidth();
        h = Tables.zombie_resources.get(type) == null ? 50 : Tables.zombie_resources.get(type).getHeight();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    void draw(SpriteBatch batch){
        batch.draw(Tables.zombie_resources.get(type) == null ? Resources.zombie : Tables.zombie_resources.get(type), x, y);
    }

    void update(){
        x -= speed;
    }
}
