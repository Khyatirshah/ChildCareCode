package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_Growth extends Activity{

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_growth);
	        
	        Button btnBoy = (Button)findViewById(R.id.btn_boy);
	        btnBoy.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					
					Intent i = new Intent(getApplicationContext(),Growth_Boy.class);
					startActivity(i);
				}
	        	
	        });
	        
	        Button btnGirl = (Button)findViewById(R.id.btn_girl);
	        btnGirl.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					
					Intent i = new Intent(getApplicationContext(),Growth_Girl.class);
					startActivity(i);
				}
	        	
	        });
	 }
}
