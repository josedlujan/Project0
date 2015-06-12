package com.portfolio.app.my.josedlujan.nanodegree.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button spotify,scores,lybrary,build,xyz,capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify = (Button) findViewById(R.id.spotify);
        scores = (Button) findViewById(R.id.scores);
        lybrary = (Button) findViewById(R.id.lybrary);
        build = (Button) findViewById(R.id.build);
        xyz = (Button) findViewById(R.id.xyz);
        capstone = (Button) findViewById(R.id.capstone);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        lybrary.setOnClickListener(this);
        build.setOnClickListener(this);
        xyz.setOnClickListener(this);
        capstone.setOnClickListener(this);
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
    /*    switch (v.getId()){
            case R.id.spotify:
                Toast.makeText(MainActivity.this,"This button will launch my Spotify Streamer App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(MainActivity.this,"This button will launch my Scores App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lybrary:
                Toast.makeText(MainActivity.this,"This button will launch my Lybrary App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.build:
                Toast.makeText(MainActivity.this,"This button will launch my Build it Bigger App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz:
                Toast.makeText(MainActivity.this,"This button will launch my XYZ App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this,"This button will launch my Capstone App!",Toast.LENGTH_SHORT).show();
                break;

        }*/
        displayToast(v);

    }

    public void displayToast(View view) {

        Button button = (Button) view;

        String buttonText = (String) button.getText();

        Context context = getApplicationContext();

        CharSequence text = getString(R.string.open_app)
                + buttonText;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
