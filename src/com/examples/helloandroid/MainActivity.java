package com.examples.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private final String TAG = "AghyadMainActivity"; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button b1 = (Button) findViewById(R.id.love_button);
		b1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				toastyToast();				
			}
		});
	}

    public void exitOnClick(View v){
        finish();
    }

	private void toastyToast(){
		Toast t1 = Toast.makeText(getApplicationContext(), "Baheeja ...", Toast.LENGTH_SHORT);
		Toast t2 = Toast.makeText(getApplicationContext(), "Do", Toast.LENGTH_SHORT);
		Toast t3 = Toast.makeText(getApplicationContext(), "YOU", Toast.LENGTH_SHORT);
		Toast t4 = Toast.makeText(getApplicationContext(), "yes .. YOU", Toast.LENGTH_SHORT);
		Toast t5 = Toast.makeText(getApplicationContext(), "Know", Toast.LENGTH_SHORT);
		Toast t6 = Toast.makeText(getApplicationContext(), "that", Toast.LENGTH_SHORT);
		Toast t7 = Toast.makeText(getApplicationContext(), "<3   I LOVE U   <3", Toast.LENGTH_SHORT);
		Toast t8 = Toast.makeText(getApplicationContext(), "Mwwwwaaaaahhhh!!!", Toast.LENGTH_LONG);
		t1.show();
		t2.show();
		t3.show();
		t4.show();
		t5.show();
		t6.show();
		t7.show();
		t8.show();
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		Log.i(TAG, "Activity is visible and about to be started");
	}

	@Override
	protected void onResume(){
		super.onResume();
		Log.i(TAG, "Activity is visible & responsive and it's resumed - ENJOY!");
	}

	@Override
	protected void onPause(){
		super.onPause();
		Log.i(TAG, "Activity is about to become out of focus and about to be paused");
	}

	@Override
	protected void onRestart(){
		super.onRestart();
		Log.i(TAG, "Activity is visible and about to be restarted after being paused");
	}

	@Override
	protected void onStop(){
		super.onStop();
		Log.i(TAG, "Activity is about to be stopped and no longer visible");
	}

	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.i(TAG, "Activity is about to be destroyed and instances freed in the outer space - Yes, the outer space ;)");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
