package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ChildCareDashboard extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.dashboard);
	        
       Button vaccination = (Button)findViewById(R.id.btn_vactin);
	        vaccination.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_Specific_Vaccination.class);
					startActivity(i);
					
				}
	        	
	        }
	        );
	        
	        Button Diet = (Button)findViewById(R.id.btn_diet);
	        Diet.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_diet.class);
					startActivity(i);
					
				}
	        	
	        }
	        );
	        
	        Button Growth = (Button)findViewById(R.id.btn_growth);
	        Growth.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_Growth.class);
					startActivity(i);
					
				}
	        	
	        }
	        );
	        
	        Button Massage = (Button)findViewById(R.id.btn_massage);
	        Massage.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_Massage.class);
					startActivity(i);
					
				}
	        	
	        }
	        );

	        Button categorized = (Button)findViewById(R.id.btn_Categorized);
	        categorized.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_Categorized.class);
					startActivity(i);
					
				}
	        	
	        }
	        );
	        
	        Button Clean = (Button)findViewById(R.id.btn_clean);
	        Clean.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_Clean.class);
					startActivity(i);
					
				}
	        	
	        }
	        );
	        
	        
	        Button FirstAid = (Button)findViewById(R.id.btn_fstAid);
	        FirstAid.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(),Activity_FirstAid.class);
					startActivity(i);
					
				}
	        	
	        }
	        );
	        
	        
	 }
}
