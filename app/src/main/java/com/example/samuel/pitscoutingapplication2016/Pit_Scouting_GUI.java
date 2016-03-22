package com.example.samuel.pitscoutingapplication2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class Pit_Scouting_GUI extends AppCompatActivity {

    public void NextPage (View view) {
        EditText scoutEdit = (EditText) findViewById(R.id.ScoutName);
        String scoutString = scoutEdit.getText().toString();
        PitScout.botPitData.Scout = scoutString;

        EditText eventEdit = (EditText) findViewById(R.id.EventName);
        String eventString = eventEdit.getText().toString();
        PitScout.botPitData.Event = eventString;

        EditText teamEdit = (EditText) findViewById(R.id.TeamNumber);
        String teamString = teamEdit.getText().toString();
        PitScout.botPitData.Team = teamString;

        // check that all data has been entered
        Boolean allDataIn = true;
        if (scoutString.equals("")) {
            Toast.makeText(getApplicationContext(), "Type Your Name In", Toast.LENGTH_LONG).show();
            allDataIn = false;
        }
        if (eventString.equals("")) {
            Toast.makeText(getApplicationContext(), "Type Your Event In", Toast.LENGTH_LONG).show();
            allDataIn = false;
        }
        if (teamString.equals("")) {
            Toast.makeText(getApplicationContext(), "Type Your Team Number In", Toast.LENGTH_LONG).show();
            allDataIn = false;
        }

        if (allDataIn) {
            if (view == findViewById(R.id.goToPage4)) {
                Intent intent = new Intent(this, RobotBuild.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(this, Robot_Information.class);
                startActivity(intent);
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pit__scouting__gui);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        if (!PitScout.botPitData.Scout.equals("")){
            EditText scoutTxt = (EditText) findViewById(R.id.ScoutName);
            scoutTxt.setHint(PitScout.botPitData.Scout);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pit__scouting__gui, menu);
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
}
