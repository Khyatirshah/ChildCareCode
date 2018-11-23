package com.android.childcare.application;

import java.util.ArrayList;



import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

public class ActivityVaccination extends TabActivity{
		
	// TabSpec Names
    private static final String INBOX_SPEC = "Birth";
    private static final String OUTBOX_SPEC = "6 WEEK";
    private static final String PROFILE_SPEC = "8 WEEK";
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vaccination);
 
        TabHost tabHost = getTabHost();
        
        tabHost.setHorizontalScrollBarEnabled(true);
        tabHost.setVerticalScrollBarEnabled(true);
        tabHost.setVerticalFadingEdgeEnabled(true);
       // tabHost.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        // Inbox Tab
        TabSpec inboxSpec = tabHost.newTabSpec(INBOX_SPEC);
        // Tab Icon
        inboxSpec.setIndicator("",getResources().getDrawable(R.drawable.birth));
    
        //inboxSpec.setIndicator("  Birth  ");
        Intent inboxIntent = new Intent(this, ActivityBirth.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);
        
 
        //Outbox Tab
        TabSpec outboxSpec = tabHost.newTabSpec(OUTBOX_SPEC);
        //outboxSpec.setIndicator("  6 Week  ");
        outboxSpec.setIndicator("",getResources().getDrawable(R.drawable.sixweeks));
        Intent outboxIntent = new Intent(this, Activity_sixWeek.class);
        outboxSpec.setContent(outboxIntent);
 
        // Profile Tab
        TabSpec profileSpec = tabHost.newTabSpec(PROFILE_SPEC);
        //profileSpec.setIndicator(PROFILE_SPEC, getResources().getDrawable(R.drawable.icon_profile));
        //profileSpec.setIndicator("  TenWeeks  ");
        profileSpec.setIndicator("",getResources().getDrawable(R.drawable.tenweeks));
        Intent profileIntent = new Intent(this, Activity_tenWeek.class);
        profileSpec.setContent(profileIntent);
        
        //forteen week
        TabSpec fortenWeek = tabHost.newTabSpec("Forten_Week");
        //profileSpec.setIndicator(PROFILE_SPEC, getResources().getDrawable(R.drawable.icon_profile));
        //fortenWeek.setIndicator("  Fourteen Week  ");
        fortenWeek.setIndicator("",getResources().getDrawable(R.drawable.fourteenweeks));
        Intent I = new Intent(this, Activity_forten_week.class);
        fortenWeek.setContent(I);
 
        //6 month
        TabSpec sixMonth = tabHost.newTabSpec("SixMonth");
        //sixMonth.setIndicator("  Six Month  ");
        sixMonth.setIndicator("",getResources().getDrawable(R.drawable.sixmonths));
        Intent sixMon = new Intent(this, Activity_sixMon.class);
        sixMonth.setContent(sixMon);
        
        //9 month
        TabSpec NineMonth = tabHost.newTabSpec("NineMonth");
        //NineMonth.setIndicator("  Nine Month  ");
        NineMonth.setIndicator("",getResources().getDrawable(R.drawable.ninemonths));
        Intent nineMon = new Intent(this, Activity_nineMonth.class);
        NineMonth.setContent(nineMon);
        
        //12 month
        TabSpec TwelveMonth = tabHost.newTabSpec("TwleveMonth");
        //TwelveMonth.setIndicator("  Twelve Month  ");
        TwelveMonth.setIndicator("",getResources().getDrawable(R.drawable.twelmonths));
        Intent twelveMon = new Intent(this, Activity_twelveMonth.class);
        TwelveMonth.setContent(twelveMon);
        
        //15 month
        TabSpec fiftenMonth = tabHost.newTabSpec("FifteenMonth");
        //fiftenMonth.setIndicator("  Fifteen Month  ");
        fiftenMonth.setIndicator("",getResources().getDrawable(R.drawable.fifteenmonths));
        Intent fiftenMon = new Intent(this, Activity_fiftenMonth.class);
        fiftenMonth.setContent(fiftenMon);
        
        //18 month
        TabSpec eightenMonth = tabHost.newTabSpec("eightteenMonth");
        //eightenMonth.setIndicator("  Egihtteen Month  ");
        eightenMonth.setIndicator("",getResources().getDrawable(R.drawable.eighteenmonths));
        Intent eightenMon = new Intent(this, Activity_eightenMonth.class);
        eightenMonth.setContent(eightenMon);
        
        //2 years
        TabSpec twoYears = tabHost.newTabSpec("TwoYears");
        //twoYears.setIndicator("  Two Years  ");
        twoYears.setIndicator("",getResources().getDrawable(R.drawable.twoyears));
        Intent twoyr = new Intent(this, Activity_twoYears.class);
        twoYears.setContent(twoyr);
        
        //4 years
        TabSpec fourYears = tabHost.newTabSpec("FourYears");
        //fourYears.setIndicator("  Four Years  ");
        fourYears.setIndicator("",getResources().getDrawable(R.drawable.fouryears));
        Intent fryr = new Intent(this, Activity_fourYear.class);
        fourYears.setContent(fryr);
        
        //5 year
        TabSpec fiveYears = tabHost.newTabSpec("FiveYears");
        //fiveYears.setIndicator("  Five Years  ");
        fiveYears.setIndicator("",getResources().getDrawable(R.drawable.fiveyears));
        Intent fiveyr = new Intent(this, Activity_fiveYear.class);
        fiveYears.setContent(fiveyr);
        
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(outboxSpec); // Adding Outbox tab
        tabHost.addTab(profileSpec); // Adding Profile tab
        tabHost.addTab(fortenWeek);
        tabHost.addTab(sixMonth);
        tabHost.addTab(NineMonth);
        tabHost.addTab(TwelveMonth);        
        tabHost.addTab(fiftenMonth);
        tabHost.addTab(eightenMonth);
        tabHost.addTab(twoYears);
        tabHost.addTab(fourYears);
        tabHost.addTab(fiveYears);
        
        
		  
        
        
        
        		 }
}
