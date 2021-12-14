package com.main;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class mButton {
    //THIS CLASS IS FOR BUILDING CUSTOM BUTTONS
    int x, y, w, h, ox, oy, sx, sy, sw, sh;
    String type;

    mButton(String type, int x, int y, int w, int h){
    this.type = type;
    this.x = ox = x;
    this.y = oy = y;
    this.w = w;
    this.h = h;
    sx = 0;
    sy = 0;
    sw = 15;
    sh = 15;
    }


    void draw(SpriteBatch batch){
        batch.draw(
                Resources.start_button,
                x,
                y,
                ox,
                oy,
                w,
                h,
                1f,
                1f,
                0f,
                sx,
                sy,
                sw,
                sh,
                false,
                false
        );
    }
    Rectangle hitbox() { return new Rectangle(x, y, w, h); }
}
