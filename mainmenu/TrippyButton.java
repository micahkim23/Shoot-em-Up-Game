package mainmenu;

import processing.core.PFont;
import resources.Cache;

public class TrippyButton extends Button{
	public TrippyButton(float xPos, float yPos, PFont f, Mainmenu p){
		super(xPos, yPos, f, "???", p);
	}
	
	public void effect(){
		Cache.kevin = !Cache.kevin;
	}
}
