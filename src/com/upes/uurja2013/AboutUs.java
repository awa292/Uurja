package com.upes.uurja2013;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockActivity;

public class AboutUs extends SherlockActivity {
	
	ImageView awanishfb,sidfb;
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock_Dialog);
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.about_us);
	    
	    awanishfb=(ImageView)findViewById(R.id.awanishfb);
	    sidfb=(ImageView)findViewById(R.id.sidfb);
	    awanishfb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			Intent intent=new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.setData(Uri.parse("http://www.facebook.com/awanish.nbd"));
			startActivity(intent);
				
			}
		});
	    
	    sidfb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("https://www.facebook.com/siddhant.er"));
				startActivity(intent);
				
			}
		});
	}

}
