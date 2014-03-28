package com.example.stone3putty;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.stone3putty.util.MusicManager;

public class SettingsActivity extends Activity {

	private SharedPreferences.Editor editor;

	boolean continueMusic = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);

		Typeface tf = Typeface.createFromAsset(getAssets(),
				"data/fonts/CelticHand.ttf");
		((TextView) findViewById(R.id.settingsHeader)).setTypeface(tf);
		((TextView) findViewById(R.id.soundLabel)).setTypeface(tf);
		((TextView) findViewById(R.id.musicLabel)).setTypeface(tf);
		((TextView) findViewById(R.id.vibrateLabel)).setTypeface(tf);

		// Restore preferences
		SharedPreferences settings = getSharedPreferences(
				this.getString(R.string.settings_storage), 0);
		((ToggleButton) findViewById(R.id.soundToggleButton))
				.setChecked(settings.getBoolean(
						this.getString(R.string.key_sound_on), true));
		((ToggleButton) findViewById(R.id.musicToggleButton))
				.setChecked(settings.getBoolean(
						this.getString(R.string.key_music_on), true));
		((ToggleButton) findViewById(R.id.vibrateToggleButton))
				.setChecked(settings.getBoolean(
						this.getString(R.string.key_vibrate_on), true));

		// Initialize the editor
		editor = settings.edit();
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

	public void toggleSound(View view) {
		editor.putBoolean(this.getString(R.string.key_sound_on),
				((ToggleButton) findViewById(R.id.soundToggleButton))
						.isChecked());

		editor.commit();
	}

	public void toggleMusic(View view) {
		editor.putBoolean(this.getString(R.string.key_music_on),
				((ToggleButton) findViewById(R.id.musicToggleButton))
						.isChecked());

		editor.commit();

		MusicManager.toggleMusic(this,
				((ToggleButton) findViewById(R.id.musicToggleButton))
						.isChecked(), MusicManager.MUSIC_MENU);
	}

	public void toggleVibrate(View view) {
		editor.putBoolean(this.getString(R.string.key_vibrate_on),
				((ToggleButton) findViewById(R.id.vibrateToggleButton))
						.isChecked());

		if (((ToggleButton) findViewById(R.id.vibrateToggleButton)).isChecked()) {
			Vibrator v = (Vibrator) this
					.getSystemService(Context.VIBRATOR_SERVICE);
			// Vibrate for 250 milliseconds
			v.vibrate(250);
		}

		editor.commit();
	}
}
