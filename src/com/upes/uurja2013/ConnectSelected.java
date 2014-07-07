package com.upes.uurja2013;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.actionbarsherlock.app.SherlockFragment;

public class ConnectSelected extends SherlockFragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v=inflater.inflate(R.layout.connect_selected, container, false);
		ImageButton imgbut1=(ImageButton)v.findViewById(R.id.fb);
		ImageButton imgbut2=(ImageButton)v.findViewById(R.id.tweet);
		ImageButton imgbut3=(ImageButton)v.findViewById(R.id.youtube);
		ImageButton imgbut4=(ImageButton)v.findViewById(R.id.site);
		
		imgbut1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try
				{
					Intent intent=new Intent();
					intent.setAction(Intent.ACTION_VIEW);
					intent.setData(Uri.parse("http://www.facebook.com/upes.uurja"));
					startActivity(intent);
				}catch(Exception e){}
				
			}
		});
		
imgbut2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try
				{
					Intent intent=new Intent();
					intent.setAction(Intent.ACTION_VIEW);
					intent.setData(Uri.parse("http://www.twitter.com/upes_uurja"));
					startActivity(intent);
				}catch(Exception e){}
				
			}
		});
imgbut3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		try
		{
			Intent intent=new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.setData(Uri.parse("http://www.youtube.com/uurjaupes"));
			startActivity(intent);
		}catch(Exception e){}
		
	}
});

imgbut4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		try
		{
			Intent intent=new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.setData(Uri.parse("http://www.uurja.upes.ac.in"));
			startActivity(intent);
		}catch(Exception e){}
		
	}
});

		
		return v;
	
	}
	

}
