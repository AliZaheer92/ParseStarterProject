package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "6mRtGmarERnpiHYbJ4wauD9njQngZnKyku2CLGKX", "fJhFV4JqjGQc2uapAWWBRVmol3hTfdhrfRqcVzS2");


		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		ParseObject obj=new ParseObject("example");
		obj.put("name","Zaheer");
		obj.put("month","December");
		obj.saveInBackground();
		ParseACL.setDefaultACL(defaultACL, true);
	}

}
