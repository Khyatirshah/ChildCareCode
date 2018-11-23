package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_Videos extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_videos);
	        
	        Button cleanness = (Button)findViewById(R.id.btn_cleanness);
	        cleanness.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Uri uri = Uri.parse("http://www.youtube.com/watch?v=zxlQn7KaCNU");
		            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

		            startActivity(intent);

					
				}
	        	
	        });
	        
	        
	        Button diper = (Button)findViewById(R.id.btn_dipwe);
	        diper.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Uri uri = Uri.parse("http://www.youtube.com/watch?v=Jv86z9Jkj0o");
		            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

		            startActivity(intent);

					
				}
	        	
	        });
	        
	        
	        Button diet = (Button)findViewById(R.id.btn_diet);
	        diet.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Uri uri = Uri.parse("http://www.youtube.com/watch?v=i7ikrxvC1q0");
		            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

		            startActivity(intent);

					
				}
	        	
	        });
	        
	        Button general = (Button)findViewById(R.id.btn_general);
	        general.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Uri uri = Uri.parse("http://www.youtube.com/watch?v=BSEM8WvBSDY");
		            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

		            startActivity(intent);

					
				}
	        	
	        });

	        
	        Button yoga = (Button)findViewById(R.id.btn_yoga);
	        yoga.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Uri uri = Uri.parse("http://www.youtube.com/watch?v=6dNS5tPF4V4");
		            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

		            startActivity(intent);

					
				}
	        	
	        });

	        
	        
	        

	        
	        
	        	 }

}
