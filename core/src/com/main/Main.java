package com.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import java.util.ArrayList;
import java.util.Random;


public class Main extends ApplicationAdapter {
	//TODO: GAME VARIABLES
	static SpriteBatch batch;
	static Start start;
	static About about_scene;
	static ZTD ztd;
	static String current_type = "";
	static boolean about = false;
	static boolean started = false;

	@Override
	public void create () {
		batch = new SpriteBatch();
		start = new Start();
		about_scene = new About();
		ztd = new ZTD();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		tap();
		batch.begin();
		if(!started) if(about) about_scene.draw(batch); else start.draw(batch);
		else {
			ztd.update();
			ztd.draw(batch);
		}
		batch.end();
	}

	void tap(){
		if(Gdx.input.justTouched()){
			int x = Gdx.input.getX(), y = Gdx.graphics.getHeight() - Gdx.input.getY();
			if(about) { about_scene.handle_clicks(x, y); return; }
			if(!started) { start.handle_clicks(x, y); return; }
			ztd.tap(x, y);
		}
	}

	//*******************END OF FILE*******************\\
	@Override
	public void dispose () {
		batch.dispose();
	}
}
