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
	SpriteBatch batch;
	Random r;

	//TODO: GAME LISTS\
	ArrayList<Zombie> zombies = new ArrayList<Zombie>();
	ArrayList<Cannon> cannons = new ArrayList<Cannon>();
	ArrayList<Button> buttons = new ArrayList<Button>();

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		r = new Random();
		r.nextInt();
		setup();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		update();
		batch.begin();
		/* bg */ batch.draw(Resources.bg, 0, 0);
		for(Zombie z : zombies) z.draw(batch);
		for(Cannon c : cannons) c.draw(batch);
		for(Button b : buttons) b.draw(batch);
		batch.end();
	}

	public void update(){
		spawn_zombies();
		tap();
		for(Zombie z : zombies) z.update();
		for(Cannon c : cannons) c.update();
		for(Button b : buttons) b.update();

		housekeeping();
	}

	void tap(){
		if(Gdx.input.justTouched()){
			int x = Gdx.input.getX(), y = Gdx.graphics.getHeight() - Gdx.input.getY();

			for(Cannon c : cannons) if(c.hitbox().contains(x, y)) return;
			if(buildable(x, y)) cannons.add(new Cannon("fire", x, y));
		}
	}

	boolean buildable(int x, int y) {
		// 0 - 200 | 300 - 500 | 1000
		return ((y > 0 && y < 200 || y > 300 && y < 500) && x < 1000);

	}

	void setup(){
		Tables.init();
		for (int i = 0; i < 5; i ++){
			buttons.add(new Button("fire", 25 + i * 75, 525));
		}
	}

	public void spawn_zombies(){
		if(!zombies.isEmpty()) return;
		for (int i = 0; i < 5; i ++) zombies.add(new Zombie("zombie", 1024 + i * 50, r.nextInt(400), 5));
	}

	void housekeeping(){
		for(Zombie z : zombies) if(!z.active) { zombies.remove(z); break; }
	}

	//*******************END OF FILE*******************\\
	@Override
	public void dispose () {
		batch.dispose();
	}
}
