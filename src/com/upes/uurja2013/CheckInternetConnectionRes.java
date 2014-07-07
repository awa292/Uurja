package com.upes.uurja2013;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;

public class CheckInternetConnectionRes extends SherlockActivity {

	@Override
	  protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		boolean result=isConnectedToNetwork();
		if(result)
			setResult(1);
		else
			setResult(0);
		
		finish();
		
		
	}
	
	public boolean isConnectedToNetwork()
	{
		boolean wificonnect=false,mobileconnected=false;
		ConnectivityManager cvm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo network[]=cvm.getAllNetworkInfo();
		for(NetworkInfo ni :network)
		{
		if(ni.getTypeName().equalsIgnoreCase("WIFI"))
			if(ni.isConnected())
			wificonnect=true;
		if(ni.getTypeName().equalsIgnoreCase("MOBILE"))
			if(ni.isConnected())
			mobileconnected=true;
		}
		return wificonnect||mobileconnected;
	}


}
