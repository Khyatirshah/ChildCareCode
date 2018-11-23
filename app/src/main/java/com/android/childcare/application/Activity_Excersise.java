package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Activity_Excersise extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_excersise);
	        
	        TextView txt_link = (TextView) findViewById(R.id.text_link);
	        txt_link.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
				Intent i = new Intent(getApplicationContext(),excersise_list.class);
				startActivity(i);
					
				}
	        	
	        });
	        
	 }
}
