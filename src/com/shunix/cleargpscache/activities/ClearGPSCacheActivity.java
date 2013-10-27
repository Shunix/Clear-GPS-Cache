package com.shunix.cleargpscache.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ClearGPSCacheActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		TextView textView = new TextView(getApplicationContext());
		textView.setText("Hello world");
		setContentView(textView);
		super.onCreate(savedInstanceState);
	}

}
