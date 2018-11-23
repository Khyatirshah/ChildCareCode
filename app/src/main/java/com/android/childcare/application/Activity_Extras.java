package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Extras extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_extras);
	        
	        Button videos = (Button) findViewById(R.id.btn_videos);
	        videos.setOnClickListener(new View.OnClickListener() { 
	            public void onClick(View v) { 
	            	Intent i =new Intent(getApplicationContext(),Activity_Videos.class);
	            	startActivity(i);
	            }
	        });
	        
	       Button faq = (Button) findViewById(R.id.btn_faq);
	       faq.setOnClickListener(new View.OnClickListener() { 
	            public void onClick(View v) { 
	            	Intent i =new Intent(getApplicationContext(),Activity_FAQ.class);
	            	startActivity(i);
	            }
	        });
	        
	 }
}
