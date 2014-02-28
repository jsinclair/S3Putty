package com.example.stone3putty;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

/**
 * This is the game activity. Its still very incomplete! To load and view
 * textures, see what has been done for mBackgroundTextureRegion. The tutorial
 * can be found at
 * http://www.raywenderlich.com/12065/how-to-create-a-simple-android-game
 * 
 */
public class GameActivity extends Activity {

	/** Camera width. */
	private static int CAMERA_WIDTH = 800;

	/** Camera height. */
	private static int CAMERA_HEIGHT = 480;

	/** The loaded background texture. */
	private ITextureRegion mBackgroundTextureRegion;

	/**
	 * We need to suppress this warning. The IF STATEMENT makes provision for
	 * the use of the correct API
	 */
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		// Show the Up button in the action bar.
//		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//			getActionBar().setDisplayHomeAsUpEnabled(true);
//		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// TODO
//		getMenuInflater().inflate(R.menu.activity_game, menu);
		return true;
	}


//	/**
//	 * This function is where you create an instance of the engine. Every
//	 * activity that the game uses will have its own instance of the engine that
//	 * will run within the activity life cycle.
//	 */
//	@Override
//	public EngineOptions onCreateEngineOptions() {
//
//		final Camera camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
//
//		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED,
//				new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), camera);
//	}
//
//	/**
//	 * This is the function where you’ll load all the resources that the
//	 * activity requires into the the VRAM.
//	 */
//	@Override
//	protected void onCreateResources() {
//		// TODO Auto-generated method stub
//
////		try {
////
////			// The background texture.
////			ITexture backgroundTexture = new BitmapTexture(
////					this.getTextureManager(), new IInputStreamOpener() {
////						@Override
////						public InputStream open() throws IOException {
////							return getAssets().open("raceGround.png");
////						}
////					});
////
////			backgroundTexture.load();
////
////			// Once the texture has been defined, we load them into memory
////			this.mBackgroundTextureRegion = TextureRegionFactory
////					.extractFromTexture(backgroundTexture);
////		} catch (IOException e) {
////			Debug.e(e);
////		}
//
//	}
//
//	/**
//	 * This function is called after the above two callbacks are executed. This
//	 * is where you create the scene for your game and use all the textures that
//	 * you previously loaded into memory.
//	 */
//	@Override
//	protected Scene onCreateScene() {
//
////		final Scene scene = new Scene();
////		Sprite backgroundSprite = new Sprite(0, 0,
////				this.mBackgroundTextureRegion, getVertexBufferObjectManager());
////		scene.attachChild(backgroundSprite);
//		return null;
//	}

}
