package com.example.stone3putty;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.stone3putty.customcomponents.CustomisePugView;
import com.example.stone3putty.customcomponents.PugPiece;
import com.example.stone3putty.util.MusicManager;

public class CustomiseActivity extends Activity {
	
	boolean continueMusic = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		PugPiece body = new PugPiece(this, R.drawable.stolenpug, 0, 0, 0, 0, 436, 386);
		PugPiece hat = new PugPiece(this, R.drawable.wizardhat, 0, 0, 280, 0, 400, 138);
		CustomisePugView pugView = new CustomisePugView(this, body, hat);
		
		setContentView(R.layout.activity_customise);
		
		((LinearLayout) findViewById(R.id.customiseLayout)).addView(pugView);
		
		Typeface tf = Typeface.createFromAsset(getAssets(),
				"data/fonts/CelticHand.ttf");
		((TextView) findViewById(R.id.customiseHeader)).setTypeface(tf);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		if (!continueMusic) {
			MusicManager.pause();
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		continueMusic = false;
		MusicManager.start(this, MusicManager.MUSIC_MENU);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_BACK:
			continueMusic = false;
			break;
		}

		return super.onKeyDown(keyCode, event);
	}
}
