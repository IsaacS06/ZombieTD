package com.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Resources {
    //UI Elements
    static Texture bg = new Texture(Gdx.files.internal("DungeonBackground.png"));
    static Texture bg_start = new Texture(Gdx.files.internal("ztdtitle.png"));
    static Texture start_button = new Texture(Gdx.files.internal("startButton.png"));
    static Texture exit_button = new Texture(Gdx.files.internal("exitButton.png"));
    static Texture cannon_button = new Texture(Gdx.files.internal("CannonIcon.png"));
    static Texture double_cannon_button = new Texture(Gdx.files.internal("doubleCannonIcon.png"));
    static Texture fire_cannon_button = new Texture(Gdx.files.internal("FireCannonIcon.png"));
    static Texture flappy_cannon_button = new Texture(Gdx.files.internal("EvilFlappyCannon.png"));
    static Texture laser_cannon_button = new Texture(Gdx.files.internal("laserCannonIcon.png"));
    static Texture super_cannon_button = new Texture(Gdx.files.internal("SuperCannonIcon.png"));
    static Texture mounted_cannon_button = new Texture(Gdx.files.internal("mountedCannonIcon.png"));
    static Texture locked_button = new Texture(Gdx.files.internal("Locked.png"));
    static Texture selected_button = new Texture(Gdx.files.internal("border.png"));
    static Texture button_close = new Texture(Gdx.files.internal("x.png"));
    static Texture tooltip_bg = new Texture(Gdx.files.internal("ttbg.png"));
    static Texture red_bar = new Texture(Gdx.files.internal("red_bar.png"));
    static Texture green_bar = new Texture(Gdx.files.internal("green_bar.png"));
    static Texture wall = new Texture(Gdx.files.internal("Wall.png"));
    static Texture wall_button = new Texture(Gdx.files.internal("WallIcon.png"));
    static Texture pause = new Texture(Gdx.files.internal("pause.png"));
    static Texture play = new Texture(Gdx.files.internal("play.png"));

    //Cannons
    static Texture cannon = new Texture(Gdx.files.internal("Cannon.png"));
    static Texture double_cannon = new Texture(Gdx.files.internal("doubleCannon.png"));
    static Texture evil_flappy_cannon = new Texture(Gdx.files.internal("EvilFlappyCannon.png"));
    static Texture fire_cannon = new Texture(Gdx.files.internal("Firecannon.png"));
    static Texture laser_cannon = new Texture(Gdx.files.internal("Lasercannon.png"));
    static Texture super_cannon = new Texture(Gdx.files.internal("SuperCannon.png"));
    static Texture mounted_cannon = new Texture(Gdx.files.internal("mountedCannon.png"));

    //Bullets
    static Texture bullet = new Texture(Gdx.files.internal("Bullet.png"));
    static Texture fire_bullet = new Texture(Gdx.files.internal("firebullet.png"));
    static Texture super_bullet = new Texture(Gdx.files.internal("superbullet.png"));

    //Zombies
    static Texture test_zombie = new Texture(Gdx.files.internal("Zombie.png"));
    static Texture zombie = new Texture(Gdx.files.internal("Zombies.png"));
    static Texture dif_zombie = new Texture(Gdx.files.internal("DifZombies.png"));
    static Texture fast_zombie = new Texture(Gdx.files.internal("Fastzombies.png"));
    static Texture riot_zombie = new Texture(Gdx.files.internal("riotzombie.png"));
    static Texture riot_zombie_big = new Texture(Gdx.files.internal("riotzombieBIG.png"));
    static Texture speedy_zombie = new Texture(Gdx.files.internal("speedy_zombie.png"));

    //Effects
    static Texture particles = new Texture(Gdx.files.internal("New Piskel.png"));
    static Texture muzzle_flash = new Texture(Gdx.files.internal("muzzleflash.png"));
    static Texture boom = new Texture(Gdx.files.internal("boom.png"));
    static Texture damaged = new Texture(Gdx.files.internal("damaged.png"));
    static Texture click = new Texture(Gdx.files.internal("click_effect.png"));
}
