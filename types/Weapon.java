package types;

import entities.Bullet;
import java.util.ArrayList;
import processing.core.PApplet;

public abstract class Weapon {	
	protected PApplet parent;
	protected int lastShot;
	protected int cooldown;
	
	public Weapon(PApplet p){
		parent = p;
		lastShot = 0;
	}
	
	public abstract ArrayList<Bullet> shoot(float xPos, float yPos);
	
	public abstract String getName();
	
	public boolean checkCooldown(){
		return parent.frameCount - lastShot >= cooldown;
	}
}
