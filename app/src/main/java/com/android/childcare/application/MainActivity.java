package com.android.childcare.application;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //child care textbox
        TextView txtChild = (TextView)findViewById(R.id.txt_child);
        txtChild.setText("Get useful childcare information from Childcare.");
        
        //mother care textbox
        TextView txtMother = (TextView)findViewById(R.id.txtMother);
        txtMother.setText("Here you can see All the information for Mothers or Pragent womens.");
        //extras
        TextView txtExtras = (TextView)findViewById(R.id.txtExtras);
        txtExtras.setText("You will see some extra features for child or mother care.");
        
        
        ImageView myAnimation = (ImageView)findViewById(R.id.myanim);
        final AnimationDrawable myAnimationDrawabl = (AnimationDrawable)myAnimation.getDrawable();
        
       myAnimation.post(
    		   
        new Runnable(){

          public void run() {
        	  myAnimationDrawabl.start();
        	  
          }
        });
    
    
    
    //child care button
    Button childcare = (Button)findViewById(R.id.btn_childcare);
    childcare.setOnClickListener(new View.OnClickListener() { 
        public void onClick(View v) { 
        	Intent i =new Intent(getApplicationContext(),ChildCareDashboard.class);
        	startActivity(i);
        }
    });
    
  //mother care button
    Button motherCare = (Button)findViewById(R.id.btn_motherCare);
    motherCare.setOnClickListener(new View.OnClickListener() { 
        public void onClick(View v) { 
        	Intent i =new Intent(getApplicationContext(),MotherDashboard.class);
        	startActivity(i);
        }
    });
  //mother care button
    Button extras = (Button)findViewById(R.id.btn_Extras);
    extras.setOnClickListener(new View.OnClickListener() { 
        public void onClick(View v) { 
        	Intent i =new Intent(getApplicationContext(),Activity_Extras.class);
        	startActivity(i);
        }
    });
    
   
    
    
 }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
