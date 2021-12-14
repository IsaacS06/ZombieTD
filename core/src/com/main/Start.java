package com.main;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Start {
    mButton m1, m2, m3;
    final int bw = 150;
    final int bh = 75;

    Start(){
        m1 = new mButton("start", (1024 / 2) - (bw / 2), 325, bw, bh);
        m2 = new mButton("start", (1024 / 2) - (bw / 2), 200, bw, bh);
        m3 = new mButton("start", (1024 / 2) - (bw / 2), 75, bw, bh);
    }

    void handle_clicks(int x, int y){
        if(m1.hitbox().contains(x, y)) Main.started = true;
    }

    void draw(SpriteBatch batch) {
        batch.draw(Resources.bg_start, 0, 0);
        m1.draw(batch);
        m2.draw(batch);
        m3.draw(batch);
    }
}
