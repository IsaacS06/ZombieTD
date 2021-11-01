package com.main;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Button {
        int x, y, w, h;
        String type;
        boolean selected, locked;
        ToolTip t;

        Button(String type, int x, int y){
            this.type = type;
            w = (Tables.button_resources.get(type) == null ? Resources.cannon_button : Tables.button_resources.get(type)).getWidth();
            h = (Tables.button_resources.get(type) == null ? Resources.cannon_button : Tables.button_resources.get(type)).getHeight();
            this.x = x;
            this.y = y;
            selected = false;
            locked = true;

            if(!type.equals("close")) t = new ToolTip(type, this);
        }

        void draw(SpriteBatch batch) {
            batch.draw((Tables.button_resources.get(type) == null ? Resources.cannon_button : Tables.button_resources.get(type)), x, y);
            if(locked) batch.draw(Resources.locked_button, x, y);
            if(selected) batch.draw(Resources.selected_button, x - 7, y - 7);
            if(t!=null) t.draw(batch);
        }

        Rectangle hitbox() { return new Rectangle(x, y, w, h); }


        void update(){
        }
    }
