package com.example.stone3putty.customcomponents;

import android.content.Context;
import android.view.View;

public class CustomisePugView extends View {
	private PugPiece body = null;
	private PugPiece hat = null;
	
	public CustomisePugView(Context context) {
		super(context);
	}
	
	public CustomisePugView(Context context, PugPiece body, PugPiece hat) {
		super(context);
		
		this.body = body;
		this.hat = hat;
	}
	
	@Override
	protected void onDraw(android.graphics.Canvas canvas) {
		super.onDraw(canvas);
		
		if (body != null)
			body.draw(canvas);
		
		if (hat != null)
			hat.draw(canvas);
	}
}
