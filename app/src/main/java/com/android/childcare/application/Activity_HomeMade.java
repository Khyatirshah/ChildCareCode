package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_HomeMade extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_homemade);
	        Button avocado = (Button) findViewById(R.id.btn_avocado);
	        avocado.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_avocado.class);
					startActivity(i);
					
					
				}
	        	
	        });
	        
	        Button banana = (Button) findViewById(R.id.btn_banana);
	        banana.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_banana.class);
					startActivity(i);
					
					
				}
	        	
	        });
	        
	        Button apple = (Button) findViewById(R.id.btn_apple);
	        apple.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_apple.class);
					startActivity(i);
					
					
				}
	        	
	        });
	        Button puree = (Button) findViewById(R.id.btn_puree);
	        puree.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_puree.class);
					startActivity(i);
					
					
				}
	        	
	        });
	        
	        
	        
	        
	 }
}
