package com.chronos.myfirstapp;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by abhinavt on 4/25/2015.
 */
public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // get message from intent of current activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        // Create a view, set the attributes
        TextView view = new TextView(this);
        view.setText(message);
        view.setTextSize(40);

        // set the text view as the activity layout
        setContentView(view);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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