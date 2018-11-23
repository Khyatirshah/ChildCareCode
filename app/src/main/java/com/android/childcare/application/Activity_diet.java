package com.android.childcare.application;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_diet extends Activity{
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_diet);
	        ArrayList<String> listItems=new ArrayList<String>();
	        listItems.add("Birth to 4 Month");
	        listItems.add("4 to 6 Months");
	        listItems.add("6 to 8 Months");
	        listItems.add("8 to 10 Months");
	        listItems.add("10 to 12 Months");
	        
	        //DEFINING STRING ADAPTER WHICH WILL HANDLE DATA OF LISTVIEW
	        ArrayAdapter<String> adapter;

	        adapter=new ArrayAdapter<String>(this,
	                android.R.layout.simple_list_item_1,
	                listItems);
	        final ListView lv = (ListView)findViewById(R.id.listView1);
	        lv.setAdapter(adapter);
	        lv.setOnItemClickListener(new OnItemClickListener()
	        {

				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					//Toast.makeText(getApplicationContext(),lv.getItemAtPosition(arg2).toString() , Toast.LENGTH_LONG).show();
					String selected = lv.getItemAtPosition(arg2).toString();
					if(selected.equals("Birth to 4 Month"))
					{
						Intent i = new Intent(getApplicationContext(), DietBirth.class);
						startActivity(i);
						
					}
					if(selected.equals("4 to 6 Months"))
					{
						Intent i = new Intent(getApplicationContext(), Diet_Four_Six.class);
						startActivity(i);
						
					}
					if(selected.equals("6 to 8 Months"))
					{
						Intent i = new Intent(getApplicationContext(), Diet_Six_Eight.class);
						startActivity(i);
						
					}
					if(selected.equals("8 to 10 Months"))
					{
						Intent i = new Intent(getApplicationContext(), Diet_Eight_Ten.class);
						startActivity(i);
						
					}
					if(selected.equals("10 to 12 Months"))
					{
						Intent i = new Intent(getApplicationContext(), Diet_Ten_Tweleve.class);
						startActivity(i);
						
					}
					
				}
	        	
	        });
	        
	 }     

}
