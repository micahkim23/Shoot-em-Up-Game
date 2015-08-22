package entities;

import java.util.ArrayList;
import collision.CollisionDetector;
import processing.core.*;
import resources.Cache;

public class Bullet extends VectorEntity
{
	protected int width;
	protected int height;
	protected float lastX;
	protected float lastY;
	protected PImage sprite;
	protected int damage;

	public Bullet(float xPos, float yPos, float xVel, float yVel, float xAcc, float yAcc, int width, int height, int damage, PApplet p){
		super (xPos,yPos,xVel,yVel,xAcc, yAcc,p);
		this.height = height;
		this.width = width;
		lastX = 0;
		lastY = 0;
		sprite = null;
		this.damage = damage;
		parent.ellipseMode(PConstants.CENTER);
	}
	
	public Bullet(float xPos, float yPos, float xVel, float yVel, float xAcc, float yAcc, int width, int height, int damage, String name, PApplet p){
		super (xPos,yPos,xVel,yVel,xAcc, yAcc,p);
		this.height = height;
		this.width = width;
		lastX = 0;
		lastY = 0;
		if (Cache.kevin){
			sprite = Cache.kevinImages.get(name);
		} else {
			sprite = Cache.images.get(name);
		}
		parent.imageMode(PConstants.CENTER);
		this.damage = damage;
	}

	public void render()
	{
		if (sprite == null){
			parent.ellipse(x, y, width, height);
		} else {
			parent.image(sprite, x, y, width, height);
		}

	}
	
	public int getDamage(){
		return damage;
	}
	
	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public float getLastX(){
		return lastX;
	}
	
	public float getLastY(){
		return lastY;
	}
	
	public boolean effect(Player p){
		return false;
	}
	
	public boolean collision(Bullet b){
		return CollisionDetector.collision(b, x, y, width, height);
	}
	
	public void hit(Bullet b){
		return;
	}
	
	public ArrayList<Bullet> shoot(){
		return new ArrayList<Bullet>();
	}
	
	public void update()
	{
		lastX = x;
		lastY = y;
		super.update();
		if (y > parent.height || y < 0)
		{
			super.cull();
		}

	}
}
