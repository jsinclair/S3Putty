package com.example.stone3putty.customcomponents;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class PugPiece {
	private int drawableTarget;

	private int xOffset = 0;
	private int yOffset = 0;

	private int x = 0;
	private int y = 0;

	private int width = 0;
	private int height = 0;

	private Drawable drawable;

	public PugPiece(Context context, int drawableTarget, int xOffset,
			int yOffset, int x, int y, int width, int height) {
		this.drawableTarget = drawableTarget;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		Resources res = context.getResources();
		drawable = res.getDrawable(drawableTarget);
		drawable.setBounds(x + xOffset, y + yOffset, width, height);
	}
	
	public void draw(Canvas canvas) {
		drawable.draw(canvas);
	}
}
