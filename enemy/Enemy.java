package enemy;

import processing.core.PApplet;
import processing.core.PConstants;
import entities.Bullet;

public class Enemy extends Bullet{
	protected int health;
	
	public Enemy(float xPos, float yPos, float xVel, float yVel, float xAcc, float yAcc, int width, int height, int hp, String name, PApplet p){
		super(xPos, yPos, xVel, yVel, xAcc, yAcc, width, height, 1, name, p);
		health = hp;
		p.imageMode(PConstants.CENTER);
	}
	
	public void hit(Bullet b){
		health -= b.getDamage();
		if (health <= 0){
			super.cull();
		}
	}
}
