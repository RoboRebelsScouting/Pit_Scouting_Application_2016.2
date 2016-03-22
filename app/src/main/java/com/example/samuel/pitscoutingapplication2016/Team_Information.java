package com.example.samuel.pitscoutingapplication2016;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import android.util.Log;

public class Team_Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Team Information");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner spinner3 = (Spinner) findViewById(R.id.CoOpBtTeam_spinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.quality_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) findViewById(R.id.CoOpInTeam_spinner);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.quality_array, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        Spinner spinner5 = (Spinner) findViewById(R.id.organization_spinner);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.quality_array, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        Spinner spinner6 = (Spinner) findViewById(R.id.Problems_spinner);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.problemssolved_array, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    public void ToRobotBuild (View view) {

        Spinner organizationEdit = (Spinner) findViewById(R.id.organization_spinner);
        String organizationString = organizationEdit.getSelectedItem().toString();
        PitScout.botPitData.Organization = organizationString;

        Spinner CoOpInTeamEdit = (Spinner) findViewById(R.id.CoOpInTeam_spinner);
        String CoOpInTeamString = CoOpInTeamEdit.getSelectedItem().toString();
        PitScout.botPitData.CoOpInTeam = CoOpInTeamString;

        Spinner CoOpBtTeamEdit = (Spinner) findViewById(R.id.CoOpBtTeam_spinner);
        String CoOpBtTeamString = CoOpBtTeamEdit.getSelectedItem().toString();
        PitScout.botPitData.CoOpBtTeam = CoOpBtTeamString;

        Spinner ProblemsEdit = (Spinner) findViewById(R.id.Problems_spinner);
        String ProblemsString = ProblemsEdit.getSelectedItem().toString();
        PitScout.botPitData.Problems = ProblemsString;

        //remove commas from any text strings
        String newString = PitScout.botPitData.Scout.replace(",", ";");
        PitScout.botPitData.Scout = newString;
        System.out.println(PitScout.botPitData.Scout);

        String newString1 = PitScout.botPitData.Event.replace(",", ";");
        PitScout.botPitData.Event = newString1;
        System.out.println(PitScout.botPitData.Event);

        //replace quotation marks with dashes
        String newStringq = PitScout.botPitData.Scout.replace("\"", "-");
        PitScout.botPitData.Scout = newStringq;
        System.out.println(PitScout.botPitData.Scout);

        String newString1q = PitScout.botPitData.Event.replace("\"", "-");
        PitScout.botPitData.Event = newString1q;
        System.out.println(PitScout.botPitData.Event);

        Intent intent = new Intent(this, RobotBuild.class);
        startActivity(intent);
    }
}
