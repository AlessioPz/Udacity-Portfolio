package com.bussolalabs.portfolio;

import android.support.v7.app.ActionBar;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.lbl_title_actionbar);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);

        Button btnSpotify = (Button) findViewById(R.id.btn_spotify);
        btnSpotify.setOnClickListener(this);
        Button btnScores = (Button) findViewById(R.id.btn_scores);
        btnScores.setOnClickListener(this);
        Button btnLibrary = (Button) findViewById(R.id.btn_library);
        btnLibrary.setOnClickListener(this);
        Button btnBigger = (Button) findViewById(R.id.btn_bigger);
        btnBigger.setOnClickListener(this);
        Button btnReader = (Button) findViewById(R.id.btn_reader);
        btnReader.setOnClickListener(this);
        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(this);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        String string = getString(R.string.msg_label_toast);
        switch (id) {
            case R.id.btn_spotify:
                string += " spotify app!";
                break;
            case R.id.btn_scores:
                string += " scores app!";
                break;
            case R.id.btn_library:
                string += " library app!";
                break;
            case R.id.btn_bigger:
                string += " bigger app!";
                break;
            case R.id.btn_reader:
                string += " reader app!";
                break;
            case R.id.btn_capstone:
                string += " capstone app!";
        }

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
