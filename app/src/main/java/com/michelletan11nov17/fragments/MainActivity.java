package com.michelletan11nov17.fragments;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //Attached the instance of the home page fragment to the main activity
//        HomePageFrag homePageFrag = new HomePageFrag();
//        //Getting the fragment manager to begin the transaction to the fragment from the main activity
//        getFragmentManager().beginTransaction().add(R.id.MyContainer, homePageFrag).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //To go to the fragments according to their id.
        Fragment frag = null;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_homepage) {
            frag = new HomePageFrag();
            //return true;
        }
        else if (id == R.id.action_facebook) {
            return true;
        }
        else if (id == R.id.action_announcement) {
            return true;
        }

        getFragmentManager().beginTransaction().add(R.id.MyContainer, frag).commit();

        return super.onOptionsItemSelected(item);
    }
}
