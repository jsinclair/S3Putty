package com.example.stone3putty;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

import com.example.stone3putty.util.MusicManager;

public class CustomiseActivity extends Activity {
	
	boolean continueMusic = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customise);

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
