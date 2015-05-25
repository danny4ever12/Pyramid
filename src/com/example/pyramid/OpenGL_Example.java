package com.example.pyramid;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
public class OpenGL_Example extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_open_gl__example);
		mGLSurfaceView = new GLSurfaceView(this);
		mGLSurfaceView.setRenderer(new PyramidRenderer(true));
		setContentView(mGLSurfaceView);
		
		
	}
	@Override
	protected void onResume() {
	super.onResume();
	mGLSurfaceView.onResume();
	}
	@Override
	protected void onPause() {
	super.onPause();
	mGLSurfaceView.onPause();
	}
	private GLSurfaceView mGLSurfaceView;
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.open_gl__example, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
}
