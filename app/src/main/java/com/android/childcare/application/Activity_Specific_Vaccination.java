package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Activity_Specific_Vaccination extends Activity{

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specific_vaccination);
        
        TextView txtSelected = (TextView) findViewById(R.id.txtAll);
        txtSelected.setOnClickListener(new OnClickListener()
        {

			public void onClick(View arg0) {
				Intent i = new Intent(getApplicationContext(),ActivityVaccination.class);
				startActivity(i);
				
			}
        	
        }
        );
        
        final Spinner spin = (Spinner) findViewById(R.id.spinner1);
        spin.setOnItemSelectedListener(new OnItemSelectedListener()
        {

			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				String selected = (String) spin.getItemAtPosition(arg2);
				//Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_LONG).show();
				
				if(selected.equals("BIRTH"))
				{
					Intent inboxIntent = new Intent(getApplicationContext(), ActivityBirth.class);
					startActivity(inboxIntent);
				}
				if(selected.equals("6 WEEKS"))
				{
					Intent outboxIntent = new Intent(getApplicationContext(), Activity_sixWeek.class);
					startActivity(outboxIntent);
				}
				if(selected.equals("10 WEEKS"))
				{
					Intent profileIntent = new Intent(getApplicationContext(), Activity_tenWeek.class);
					startActivity(profileIntent);
				}
				if(selected.equals("14 WEEKS"))
				{
					Intent I = new Intent(getApplicationContext(), Activity_forten_week.class);
					startActivity(I);
				}
				if(selected.equals("6 MONTHS"))
				{
					Intent sixMon = new Intent(getApplicationContext(), Activity_sixMon.class);
					startActivity(sixMon);
				}
				if(selected.equals("9 MONTHS"))
				{
					Intent nineMon = new Intent(getApplicationContext(), Activity_nineMonth.class);
					startActivity(nineMon);
				}
				if(selected.equals("12 MONTHS"))
				{
					Intent twelveMon = new Intent(getApplicationContext(), Activity_twelveMonth.class);
					startActivity(twelveMon);
				}
				if(selected.equals("15 MONTHS"))
				{
					Intent fiftenMon = new Intent(getApplicationContext(), Activity_fiftenMonth.class);
					startActivity(fiftenMon);
				}
				if(selected.equals("18 MONTHS"))
				{
					Intent eightenMon = new Intent(getApplicationContext(), Activity_eightenMonth.class);
					startActivity(eightenMon);
				}
				if(selected.equals("2 YEARS"))
				{
					Intent twoyr = new Intent(getApplicationContext(), Activity_twoYears.class);
					startActivity(twoyr);
				}
				if(selected.equals("4 YEARS"))
				{
					Intent fryr = new Intent(getApplicationContext(), Activity_fourYear.class);
					startActivity(fryr);
				}
				if(selected.equals("5 YEARS"))
				{
					Intent fiveyr = new Intent(getApplicationContext(), Activity_fiveYear.class);
					startActivity(fiveyr);
				}
				
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
        });
	}
}
