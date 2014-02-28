package com.example.stone3putty;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Typeface tf = Typeface.createFromAsset(getAssets(),"data/fonts/CelticHand.ttf");
		((TextView) findViewById(R.id.start)).setTypeface(tf);
		((TextView) findViewById(R.id.customise)).setTypeface(tf);
		((TextView) findViewById(R.id.settings)).setTypeface(tf);
		((TextView) findViewById(R.id.about)).setTypeface(tf);
		((TextView) findViewById(R.id.exit)).setTypeface(tf);
		
	}


	/**
	 * This is called when the start label is clicked (as defined in activity_main.xml). 
	 * It is meant to start a new game activity.
	 * @param view The view that was clicked. 
	 */
	public void startGame(View view){
		Intent intent = new Intent(this, GameActivity.class);
		startActivity(intent);
	}
	
	public void startSettings(View view){
		System.out.println("settings");
		Intent intent = new Intent(this, SettingsActivity.class);
		startActivity(intent);
	}
	
	/** 
	 * This is called when the exit label is clicked  (as defined in activity_main.xml). 
	 * @param view The view that was clicked.
	 */
	public void exit (View view){
		finish();
	}
}
