

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	private double xV, yV;
	private int maxXV, maxYV;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
		xV = 0;
		yV = 0;
		maxXV = 10;
		maxYV = 10;
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
		xV += dir;
		
	}

	public void jump() {
		// JUMP!
		
		yV -= 2;
		
		
	}

	public void act(ArrayList<Shape> obstacles) {
		// FALL (and stop when a platform is hit)
		boolean onGround = false;
		for(Shape s : obstacles) {
			if(s.intersects(this)) {
				onGround = true;
				if(yV > 0 && s.getBounds().getY() > y)
					yV = 0;
				else if(yV < 0 && s.getBounds().getY() < y)
					yV = 1;
				break;
			}
		}
		if(!onGround)
			yV+=1;
		
		
		
		
		if(xV > maxXV) {
			xV = maxXV;
		} else if(xV < -maxXV) {
			xV = -maxXV;
		}
		
		if(yV > maxYV) {
			yV = maxYV;
		} else if(yV < -maxYV) {
			yV = -maxYV;
		}
		xV *= 0.9;
		
		x += xV;
		y += yV;
		
		
	}


}
