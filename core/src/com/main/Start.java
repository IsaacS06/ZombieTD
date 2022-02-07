package com.main;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Start extends Scene{
    mButton m1, m2, m3;


    Start(){
        m1 = new mButton("start", (1024 / 2) - (mButton.bw / 2), 325, mButton.bw, mButton.bh);
        m2 = new mButton("about", (1024 / 2) - (mButton.bw / 2), 200, mButton.bw, mButton.bh);
        m3 = new mButton("exit", (1024 / 2) - (mButton.bw / 2), 75, mButton.bw, mButton.bh);
        font = new BitmapFont(Gdx.files.internal("./Fonts/sotd.fnt"));
        font.setColor(Color.FOREST);
        layout.setText(font, "ZOMBIE TOWER DEFENSE");
    }

    void handle_clicks(int x, int y) {
        if(m1.hitbox().contains(x, y)) Main.started = true;
        if(m2.hitbox().contains(x, y)) Main.about = true;
    }

    void draw(SpriteBatch batch) {
        ScreenUtils.clear(new Color(0x11441100));
        font.draw(batch, layout, (float)1024 / 2 - layout.width / 2, 575);
        m1.draw(batch);
        m2.draw(batch);
        m3.draw(batch);
    }
}
