package enemy;

import processing.core.PApplet;

public class Asteroid extends Enemy{
	public Asteroid (float xPos, float yPos, float xVel, float yVel, float xAcc, float yAcc, 
			int width, int height, int hp, PApplet p)
	{
		super(xPos,yPos,xVel,yVel,xAcc,yAcc,width,height,hp,"Asteroid",p);
	}
}
