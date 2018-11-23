package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MotherDashboard  extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.mother_dashboard);
	        
	        //working mother
	        Button Working = (Button) findViewById(R.id.btn_working);
	        Working.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_working.class);
					startActivity(i);
					
				}
	        	
	        });
	        
	      //excersise mother
	        Button excersise = (Button) findViewById(R.id.btn_excersise);
	        excersise.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_Excersise.class);
					startActivity(i);
					
				}
	        	
	        });
	        		
	        //after pragnancy kit

	        Button postpartum = (Button) findViewById(R.id.btn_Postpartum);
	        postpartum.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_Postpartum.class);
					startActivity(i);
					
				}
	        	
	        });
	        
	      //diet

	        Button diet = (Button) findViewById(R.id.btn_diet);
	        diet.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_MomDiet.class);
					startActivity(i);
					
				}
	        	
	        });

	        //home made baby food
	        Button HomeMade = (Button) findViewById(R.id.btn_HomeMade);
	        HomeMade.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_HomeMade.class);
					startActivity(i);
					
				}
	        	
	        });
	        
	 }

}
