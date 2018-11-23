package com.android.childcare.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_Categorized extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorized);
        
        Button boy = (Button)findViewById(R.id.btn_boy);
        boy.setOnClickListener(new OnClickListener()
        {

			public void onClick(View arg0) {
			Intent i =new Intent(getApplicationContext(), Categorized_Boy.class);
			startActivity(i);
				
			}
        	
        });
        
        Button twins = (Button)findViewById(R.id.btn_twins);
        twins.setOnClickListener(new OnClickListener()
        {

			public void onClick(View arg0) {
			Intent i =new Intent(getApplicationContext(), Categorized_Twins.class);
			startActivity(i);
				
			}
        	
        });
        
        Button Girls = (Button)findViewById(R.id.Btn_girl);
        Girls.setOnClickListener(new OnClickListener()
        {

			public void onClick(View arg0) {
			Intent i =new Intent(getApplicationContext(), Categorized_Girl.class);
			startActivity(i);
				
			}
        	
        });

        
        
        
        
	}

}
