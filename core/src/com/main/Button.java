package com.main;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Button {
        int x, y, w, h;
        String type;
        boolean selected, locked;

        Button(String type, int x, int y){
            this.type = type;
            w = Tables.button_resources.get(type) == null ? 50 : Tables.button_resources.get(type).getWidth();
            h = Tables.button_resources.get(type) == null ? 50 : Tables.button_resources.get(type).getHeight();
            this.x = x;
            this.y = y;
            selected = true;
            locked = true;
        }

        void draw(SpriteBatch batch) {
            batch.draw(Resources.cannon_button, x, y);
            if(locked) batch.draw(Resources.locked_button, x, y);
            if(selected) batch.draw(Resources.selected_button, x - 7, y - 7);
        }


        void update(){
        }
    }
