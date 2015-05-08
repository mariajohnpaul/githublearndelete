package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String [] As = { "I","Love","You","Tinie"};
        
       final TextView tv = (TextView) findViewById(R.id.Button1);
       while(true)
       for(final String each : As)
       {
    	   

    	    // Execute some code after 2 seconds have passed
    	    Handler handler = new Handler(); 
    	    handler.postDelayed(new Runnable() { 
    	         public void run() { 
    	        	 tv.setText(each);
    	      	   tv.setTextSize(50); 
    	         } 
    	    }, 2000); 
       }
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
