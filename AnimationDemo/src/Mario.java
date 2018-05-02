

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
		x += dir;
	}

	public void jump() {
		// JUMP!
		y -= 5;
	
		
		

	}

	public void act(ArrayList<Shape> obstacles) {
		// FALL (and stop when a platform is hit)
	}


}
