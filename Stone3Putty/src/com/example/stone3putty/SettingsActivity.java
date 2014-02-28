package com.example.stone3putty;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class SettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		Typeface tf = Typeface.createFromAsset(getAssets(),"data/fonts/CelticHand.ttf");
		((TextView) findViewById(R.id.settingsHeader)).setTypeface(tf);
		((TextView) findViewById(R.id.soundLabel)).setTypeface(tf);
		((TextView) findViewById(R.id.musicLabel)).setTypeface(tf);
		((TextView) findViewById(R.id.vibrateLabel)).setTypeface(tf);
	}
}
