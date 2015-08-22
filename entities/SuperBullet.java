package entities;

import processing.core.PApplet;

public class SuperBullet extends Bullet{
	public SuperBullet(float xPos, float yPos, float xVel, float yVel, float xAcc, float yAcc, int width, int height, int damage, String name, PApplet p){
		super(xPos, yPos, xVel, yVel, xAcc, yAcc, width, height, damage, name, p);
	}
	
	public void cull(){
		if (y < 0 || y > parent.height){
			cull = true;
		}
	}
}
