package resources;

import java.util.HashMap;
import processing.core.*;

public final class Cache{
	public static boolean kevin = false;
	public static HashMap<String, PImage> images = initializeCache();
	public static HashMap<String, PImage> kevinImages;// = initializeKCache();

	public static HashMap<String, PImage> initializeCache(){
		PApplet p = new PApplet();
		images = new HashMap<String, PImage>();
		//Player and Enemies
		images.put("Player", p.loadImage("src/res/sprites/Standard/Player/Player.png"));
		images.put("Asteroid", p.loadImage("src/res/sprites/Standard/Enemies/Asteroid.png"));
		images.put("ShootingDude", p.loadImage("src/res/sprites/Standard/Enemies/ShootingDude.png"));
		images.put("ShotgunDude", p.loadImage("src/res/sprites/Standard/Enemies/ShotgunDude.png"));
		images.put("SprayerDude", p.loadImage("src/res/sprites/Standard/Enemies/SprayerDude.png"));
		images.put("SprinklerDude", p.loadImage("src/res/sprites/Standard/Enemies/SprinklerDude.png"));
		//Powerups and weapons
		images.put("AA12", p.loadImage("src/res/sprites/Standard/Powerup/AA12.png"));
		images.put("LineGun", p.loadImage("src/res/sprites/Standard/Powerup/LineGun.png"));
		images.put("M1014", p.loadImage("src/res/sprites/Standard/Powerup/M1014.png"));
		images.put("M107", p.loadImage("src/res/sprites/Standard/Powerup/M107.png"));
		images.put("M134", p.loadImage("src/res/sprites/Standard/Powerup/M134.png"));
		images.put("M1911", p.loadImage("src/res/sprites/Standard/Powerup/M1911.png"));
		images.put("M2", p.loadImage("src/res/sprites/Standard/Powerup/M2.png"));
		images.put("Nuke", p.loadImage("src/res/sprites/Standard/Powerup/Nuke.png"));
		images.put("Speed", p.loadImage("src/res/sprites/Standard/Powerup/speedup.png"));
		//Bullets
		images.put("Bullet", p.loadImage("src/res/sprites/Standard/Bullets/Bullet.png"));
		images.put("Magnum", p.loadImage("src/res/sprites/Standard/Bullets/Magnum.png"));
		images.put("Line", p.loadImage("src/res/sprites/Standard/Bullets/Line.png"));
		images.put("Pellet", p.loadImage("src/res/sprites/Standard/Bullets/Pellet.png"));
		images.put("EnemyShot", p.loadImage("src/res/sprites/Standard/Bullets/EnemyShot.png"));
		images.put("EnemyPellet", p.loadImage("src/res/sprites/Standard/Bullets/EnemyPellet.png"));
		return images;
	}

	public static HashMap<String, PImage> initializeKCache(){
		PApplet p = new PApplet();
		images = new HashMap<String, PImage>();

		//Player and Enemies
		images.put("Player", p.loadImage("src/res/sprites/Kevin/Player/Player.png"));
		images.put("Asteroid", p.loadImage("src/res/sprites/Kevin/Enemies/Asteroid.png"));
		images.put("ShootingDude", p.loadImage("src/res/sprites/Kevin/Enemies/ShootingDude.png"));
		images.put("ShotgunDude", p.loadImage("src/res/sprites/Kevin/Enemies/ShotgunDude.png"));
		images.put("SprayerDude", p.loadImage("src/res/sprites/Kevin/Enemies/SprayerDude.png"));
		images.put("SprinklerDude", p.loadImage("src/res/sprites/Kevin/Enemies/SprinklerDude.png"));
		//Powerups and weapons
		images.put("AA12", p.loadImage("src/res/sprites/Kevin/Powerup/AA12.png"));
		images.put("LineGun", p.loadImage("src/res/sprites/Kevin/Powerup/LineGun.png"));
		images.put("M1014", p.loadImage("src/res/sprites/Kevin/Powerup/M1014.png"));
		images.put("M107", p.loadImage("src/res/sprites/Kevin/Powerup/M107.png"));
		images.put("M134", p.loadImage("src/res/sprites/Kevin/Powerup/M134.png"));
		images.put("M1911", p.loadImage("src/res/sprites/Kevin/Powerup/M1911.png"));
		images.put("M2", p.loadImage("src/res/sprites/Kevin/Powerup/M2.png"));
		images.put("Nuke", p.loadImage("src/res/sprites/Kevin/Powerup/Nuke.png"));
		images.put("Speed", p.loadImage("src/res/sprites/Kevin/Powerup/speedup.png"));
		//Bullets
		images.put("Bullet", p.loadImage("src/res/sprites/Kevin/Bullets/Bullet.png"));
		images.put("Magnum", p.loadImage("src/res/sprites/Kevin/Bullets/Magnum.png"));
		images.put("Line", p.loadImage("src/res/sprites/Kevin/Bullets/Line.png"));
		images.put("Pellet", p.loadImage("src/res/sprites/Kevin/Bullets/Pellet.png"));
		images.put("EnemyShot", p.loadImage("src/res/sprites/Kevin/Bullets/EnemyShot.png"));
		images.put("EnemyPellet", p.loadImage("src/res/sprites/Kevin/Bullets/EnemyPellet.png"));
		return images;
	}
}
