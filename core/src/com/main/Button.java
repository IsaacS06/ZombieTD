package com.main;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Button {
        int x, y, w, h;
        String type;

        Button(String type, int x, int y){
            this.type = type;
            w = Tables.button_resources.get(type) == null ? 50 : Tables.button_resources.get(type).getWidth();
            h = Tables.button_resources.get(type) == null ? 50 : Tables.button_resources.get(type).getHeight();
            this.x = x;
            this.y = y;
        }

        void draw(SpriteBatch batch) {
            batch.draw(Tables.button_resources.get(type) == null ? Resources.cannon_button : Tables.button_resources.get(type), x, y);

        }


        void update(){
        }
    }
