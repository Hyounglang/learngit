package com.thacctestdemosec;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;

public class SecActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		ViewCompat.setTransitionName(findViewById(R.id.img), "img");
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}
}
