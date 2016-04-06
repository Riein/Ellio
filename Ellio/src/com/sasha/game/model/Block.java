package com.sasha.game.model;

import java.awt.Rectangle;
import com.sasha.framework.util.RandomNumberGenerator;

public class Block {
	private float x, y;
	private int width, height;
	private Rectangle rect;
	private boolean visible;
	
	private static final int UPPER_Y = 275;
	private static final int LOWER_Y = 355;
	
	public Block(float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		rect = new Rectangle((int) x, (int) y, width, height);
		visible = false;
	}
}
