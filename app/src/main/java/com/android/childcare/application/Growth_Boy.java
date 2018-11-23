package com.android.childcare.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Growth_Boy extends Activity{
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.growth_boy);
	  
	        Button btn = (Button)findViewById(R.id.button1);
	        btn.setOnClickListener(new OnClickListener()
	        {

				public void onClick(View arg0) {
				EditText edt = (EditText)findViewById(R.id.editText1);
				
				String selected = edt.getText().toString();
				TextView txtheigh = (TextView)findViewById(R.id.textHeight);
				TextView txtWeight = (TextView)findViewById(R.id.textWeight);
				TextView txtHeading = (TextView)findViewById(R.id.textHeading);
				txtHeading.setText("Standard Height and weight of Baby Boy of " + selected + " Month is :");
				//Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_LONG).show();
				if(selected.equals("0") || selected.equals("1") || selected.equals("2"))
				{
					txtheigh.setText("50.5");
					txtWeight.setText("3.3");
				}
				else if(selected.equals("3") || selected.equals("4") || selected.equals("5"))
				{
					txtheigh.setText("61.1");
					txtWeight.setText("6.0");
				}
				else if(selected.equals("6")|| selected.equals("7") || selected.equals("8"))
				{
					txtheigh.setText("67.8");
					txtWeight.setText("7.8");
				}
				else if(selected.equals("9")|| selected.equals("7"))
				{
					txtheigh.setText("72.3");
					txtWeight.setText("9.2");
				}
				else if(selected.equals("12") || selected.equals("13") || selected.equals("14") || selected.equals("15") || selected.equals("16") || selected.equals("17") || selected.equals("18") || selected.equals("19") || selected.equals("20") || selected.equals("21") || selected.equals("22") || selected.equals("23")  ) 
				{
					txtheigh.setText("76.1");
					txtWeight.setText("10.2");
				}
				
				else if(selected.equals("24")  || selected.equals("25") || selected.equals("26") || selected.equals("27") || selected.equals("28") || selected.equals("29") || selected.equals("30") || selected.equals("31") || selected.equals("32") || selected.equals("33") || selected.equals("34") || selected.equals("35") )
				{
					txtheigh.setText("85.6");
					txtWeight.setText("12.3");
				}
				else if(selected.equals("36") || selected.equals("37") || selected.equals("38") || selected.equals("39") || selected.equals("40") || selected.equals("41") || selected.equals("42") || selected.equals("43") || selected.equals("44") || selected.equals("45") || selected.equals("46") || selected.equals("47") )
				{
					txtheigh.setText("94.9");
					txtWeight.setText("14.6");
				}
				else if(selected.equals("48") || selected.equals("49") || selected.equals("50") || selected.equals("51") || selected.equals("52") || selected.equals("53") || selected.equals("54") || selected.equals("55") || selected.equals("56") || selected.equals("57") || selected.equals("58") || selected.equals("59"))
				{
					txtheigh.setText("102.9");
					txtWeight.setText("16.7");
				}
				else if(selected.equals("60")|| selected.equals("61") || selected.equals("62") || selected.equals("63") || selected.equals("64") || selected.equals("65") || selected.equals("66") || selected.equals("67") || selected.equals("68") || selected.equals("69") || selected.equals("70") || selected.equals("71"))
				{
					txtheigh.setText("109.9");
					txtWeight.setText("18.7");
				}
				else if(selected.equals("72")|| selected.equals("83") || selected.equals("73") || selected.equals("74") || selected.equals("75") || selected.equals("76") || selected.equals("77") || selected.equals("78") || selected.equals("79") || selected.equals("80") || selected.equals("81") || selected.equals("82"))
				{
					txtheigh.setText("116.1");
					txtWeight.setText("20.7");
				}
				else if(selected.equals("84")|| selected.equals("85") || selected.equals("86") || selected.equals("87") || selected.equals("88") || selected.equals("89") || selected.equals("90") || selected.equals("91") || selected.equals("92") || selected.equals("93") || selected.equals("94") || selected.equals("95"))
				{
					txtheigh.setText("121.7");
					txtWeight.setText("22.9");
				}
				else if(selected.equals("96")|| selected.equals("97") || selected.equals("98") || selected.equals("99") || selected.equals("100") || selected.equals("101") || selected.equals("102") || selected.equals("103") || selected.equals("104") || selected.equals("105") || selected.equals("106") || selected.equals("107"))
				{
					txtheigh.setText("127.0");
					txtWeight.setText("25.3");
				}
				
				else if(selected.equals("108")|| selected.equals("109") || selected.equals("110") || selected.equals("111") || selected.equals("112") || selected.equals("113") || selected.equals("114") || selected.equals("115") || selected.equals("116") || selected.equals("117") || selected.equals("118") || selected.equals("119"))
				{
					txtheigh.setText("132.2");
					txtWeight.setText("28.1");
				}	
				else if(selected.equals("120"))
				{
					txtheigh.setText("137.5");
					txtWeight.setText("31.4");
				}
				else
				{
					txtHeading.setText("Invalid Selection");
					txtheigh.setText(" ");
					txtWeight.setText(" ");
					
					
				}
				txtheigh.append(" cm ");
				txtWeight.append(" Kg ");
				}
	        	
	        });
	 }
}
