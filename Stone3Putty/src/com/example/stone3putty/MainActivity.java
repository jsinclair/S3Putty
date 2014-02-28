package com.example.stone3putty;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.stone3putty.util.SystemUiHider;

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
		((TextView) findViewById(R.id.exit)).setTypeface(tf);
		
		((TextView) findViewById(R.id.settings)).setTypeface(tf);
		((TextView) findViewById(R.id.about)).setTypeface(tf);
		
	}


	/**
	 * This is called when the start label is clicked (as defined in activity_main.xml). 
	 * It is meant to start a new game activity.
	 * @param view The view that was clicked. 
	 */
	public void startGame(View view){
		System.out.println("printing");
	}
	
}
