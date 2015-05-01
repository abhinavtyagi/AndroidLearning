package com.chronos.myfirstapp;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by abhinavt on 4/25/2015.
 */
public class DisplayMessageActivity extends ActionBarActivity {

 //   private static final boolean createDynamicView = true;
    private static final boolean createDynamicView = false;
    private void openSearch(){}
    private void openSettings() {}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())   {
            case R.id.action_search :
                openSearch();
                return true;
            case R.id.action_settings :
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)  {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // get message from intent of current activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.m_EXTRA_MESSAGE);

        TextView view;
        if(createDynamicView) {
            // Create a view, set the attributes
            view = new TextView(this);
            view.setText(message);
            view.setTextSize(40);
            setContentView(view);
        }
        else {
            view = (TextView) findViewById(R.id.id_textView);
            view.setText(message);
            view.setTextSize(80);
        }

        // set the text view as the activity layout
    }

    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStated) {
            View rootView = inflater.inflate(R.layout.activity_display_message, container, false);
            return rootView;
        }

    }
}