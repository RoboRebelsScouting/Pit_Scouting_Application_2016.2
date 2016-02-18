package com.example.samuel.pitscoutingapplication2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class NextPage extends AppCompatActivity {

    public void LastPage (View view) {

        Spinner drivetrainEdit = (Spinner) findViewById(R.id.drivetrain_spinner);
        String drivetrainString = drivetrainEdit.getSelectedItem().toString();
        PitScout.botPitData.DriveTrainType = drivetrainString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        Spinner shootingEdit = (Spinner) findViewById(R.id.shootingstrategy_spinner);
        String shootingString = shootingEdit.getSelectedItem().toString();
        PitScout.botPitData.ShootingStrategy = shootingString;

        //Checkboxes for Area of Focus
        CheckBox focus6Edit = (CheckBox) findViewById(R.id.checkBox6);
        String focus6String = null;
        if(focus6Edit.isChecked()){
            focus6String = "true";
        } else {
            focus6String = "false";
        }
        PitScout.botPitData.Focus = focus6String;

        CheckBox focus7Edit = (CheckBox) findViewById(R.id.checkBox7);
        String focus7String = null;
        if(focus7Edit.isChecked()){
            focus7String = "true";
        } else {
            focus7String = "false";
        }
        PitScout.botPitData.Focus = focus7String;

       /* CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        //Checkboxes for Defenses Desired to Cross
        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        //Autonomous Strategy
        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;

        CheckBox climbingEdit = (CheckBox) findViewById(R.id.Climbing_checkbox);
        String climbingString = null;
        if(climbingEdit.isChecked()){
            climbingString = "true";
        } else {
            climbingString = "false";
        }
        PitScout.botPitData.Climbing = climbingString;*/

        //Back to norma|

        Spinner positionEdit = (Spinner) findViewById(R.id.desiredposition_spinner);
        String positionString = drivetrainEdit.getSelectedItem().toString();
        PitScout.botPitData.Position = positionString;

        EditText faults1Edit = (EditText) findViewById(R.id.Faults1Text);
        String faults1String = faults1Edit.getText().toString();
        PitScout.botPitData.Faults1 = faults1String;


        Intent intent = new Intent(this, LastPage.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner spinner = (Spinner) findViewById(R.id.drivetrain_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.drivetrain_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
//REMEMBER TO SET ALL "spinner" TO "spinner(#)" AND DO THE SAME FOR "adapter" FOR ^CODE, EDIT SPINNER, AND STRINGS

        Spinner spinner1 = (Spinner) findViewById(R.id.shootingstrategy_spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.shootingstrategy_array, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) findViewById(R.id.desiredposition_spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.desiredposition_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

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

}
