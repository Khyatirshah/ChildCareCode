package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_MomDiet extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_mom_diet);
	        final Spinner spin = (Spinner) findViewById(R.id.spinner1);
	        spin.setOnItemSelectedListener(new OnItemSelectedListener()
	        {

				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					String selected = (String) spin.getItemAtPosition(arg2);
					//Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_LONG).show();
					TextView txt = (TextView)findViewById(R.id.textAns);
					if(selected.equals("Underweight"))
					{
						txt.setText("28 to 40 pounds");
					}
					if(selected.equals("Normal weight"))
					{
						txt.setText("25 to 35 pounds");
					}
					if(selected.equals("Overweight"))
					{
						txt.setText("15 to 25 pounds");
					}
					if(selected.equals("Obese"))
					{
						txt.setText("11 to 20 pounds");
					}
					
				}

				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub
					
				}
	        	
	        });
	       TextView txtClick = (TextView)findViewById(R.id.txtClick);
	        txtClick.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
					Intent i = new Intent(getApplicationContext(), SamplePlan.class);
					startActivity(i);
					
				}
	        	
	        });
	 }

}
