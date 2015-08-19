package com.dima.findway;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.dima.findway.entity.Login;

/**
 * Created by Dimon on 20.03.2015.
 */
public class SystemApp extends Login {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.system_app);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_find:

            return true;
            case R.id.action_settings:
                Intent intent = new Intent(Settings.ACTION_SETTINGS);
                startActivity(intent);
                return true;
            case R.id.action_exit:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}