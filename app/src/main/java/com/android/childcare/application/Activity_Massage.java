package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Activity_Massage extends Activity{

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_massage);
	        
	        TextView tummy = (TextView)findViewById(R.id.textTummy);
	        tummy.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i =new Intent(getApplicationContext(), TummyMassage.class);
					startActivity(i);
				}	
	        	
	        });
	        
	        TextView HeadFace = (TextView)findViewById(R.id.textHeadFace);
	        HeadFace.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i =new Intent(getApplicationContext(), MassageHeadFace.class);
					startActivity(i);
				}	
	        	
	        });
	        
	        TextView Chest = (TextView)findViewById(R.id.textChest);
	        Chest.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i =new Intent(getApplicationContext(), MassageChest.class);
					startActivity(i);
				}	
	        	
	        });
	        
	        TextView Arms = (TextView)findViewById(R.id.textArms);
	        Arms.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i =new Intent(getApplicationContext(), MasageArms.class);
					startActivity(i);
				}	
	        	
	        });
	        
	        TextView Back = (TextView)findViewById(R.id.textBack);
	        Back.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i =new Intent(getApplicationContext(), MassageBack.class);
					startActivity(i);
				}	
	        	
	        });
	        
	        TextView legs = (TextView)findViewById(R.id.textLegs);
	        legs.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i =new Intent(getApplicationContext(), MassageLeg.class);
					startActivity(i);
				}	
	        	
	        });

	 }
}
