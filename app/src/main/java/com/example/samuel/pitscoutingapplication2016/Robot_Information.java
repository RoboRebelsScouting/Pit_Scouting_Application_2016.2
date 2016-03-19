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

public class Robot_Information extends AppCompatActivity {

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
        CheckBox focus2Edit = (CheckBox) findViewById(R.id.checkBox2);
        String focus2String = null;
        if(focus2Edit.isChecked()){
            focus2String = "true";
        } else {
            focus2String = "false";
        }
        PitScout.botPitData.Focus1 = focus2String;

        CheckBox focus3Edit = (CheckBox) findViewById(R.id.checkBox3);
        String focus3String = null;
        if(focus3Edit.isChecked()){
            focus3String = "true";
        } else {
            focus3String = "false";
        }
        PitScout.botPitData.Focus2 = focus3String;

        CheckBox focus4Edit = (CheckBox) findViewById(R.id.checkBox4);
        String focus4String = null;
        if(focus4Edit.isChecked()){
            focus4String = "true";
        } else {
            focus4String = "false";
        }
        PitScout.botPitData.Focus3 = focus4String;

        CheckBox focus5Edit = (CheckBox) findViewById(R.id.checkBox5);
        String focus5String = null;
        if(focus5Edit.isChecked()){
            focus5String = "true";
        } else {
            focus5String = "false";
        }
        PitScout.botPitData.Focus4 = focus5String;

        //Checkboxes for Defenses Desired to Cross
        CheckBox focus6Edit = (CheckBox) findViewById(R.id.checkBox6);
        String focus6String = null;
        if(focus6Edit.isChecked()){
            focus6String = "true";
        } else {
            focus6String = "false";
        }
        PitScout.botPitData.Defense1 = focus6String;

        CheckBox focus7Edit = (CheckBox) findViewById(R.id.checkBox7);
        String focus7String = null;
        if(focus7Edit.isChecked()){
            focus7String = "true";
        } else {
            focus7String = "false";
        }
        PitScout.botPitData.Defense2 = focus7String;

        CheckBox focus8Edit = (CheckBox) findViewById(R.id.checkBox8);
        String focus8String = null;
        if(focus8Edit.isChecked()){
            focus8String = "true";
        } else {
            focus8String = "false";
        }
        PitScout.botPitData.Defense3 = focus8String;

        CheckBox focus9Edit = (CheckBox) findViewById(R.id.checkBox9);
        String focus9String = null;
        if(focus9Edit.isChecked()){
            focus9String = "true";
        } else {
            focus9String = "false";
        }
        PitScout.botPitData.Defense4 = focus9String;

        CheckBox focus10Edit = (CheckBox) findViewById(R.id.checkBox10);
        String focus10String = null;
        if(focus10Edit.isChecked()){
            focus10String = "true";
        } else {
            focus10String = "false";
        }
        PitScout.botPitData.Defense5 = focus10String;

        CheckBox focus11Edit = (CheckBox) findViewById(R.id.checkBox11);
        String focus11String = null;
        if(focus11Edit.isChecked()){
            focus11String = "true";
        } else {
            focus11String = "false";
        }
        PitScout.botPitData.Defense6 = focus11String;

        CheckBox focus12Edit = (CheckBox) findViewById(R.id.checkBox12);
        String focus12String = null;
        if(focus12Edit.isChecked()){
            focus12String = "true";
        } else {
            focus12String = "false";
        }
        PitScout.botPitData.Defense7 = focus12String;

        CheckBox focus13Edit = (CheckBox) findViewById(R.id.checkBox13);
        String focus13String = null;
        if(focus10Edit.isChecked()){
            focus13String = "true";
        } else {
            focus13String = "false";
        }
        PitScout.botPitData.Defense8 = focus13String;

        CheckBox focus14Edit = (CheckBox) findViewById(R.id.checkBox14);
        String focus14String = null;
        if(focus14Edit.isChecked()){
            focus14String = "true";
        } else {
            focus14String = "false";
        }
        PitScout.botPitData.Defense9 = focus14String;

        //Autonomous Strategy
        CheckBox focus15Edit = (CheckBox) findViewById(R.id.checkBox15);
        String focus15String = null;
        if(focus15Edit.isChecked()){
            focus15String = "true";
        } else {
            focus15String = "false";
        }
        PitScout.botPitData.AutoStrategy1 = focus15String;

        CheckBox focus16Edit = (CheckBox) findViewById(R.id.checkBox16);
        String focus16String = null;
        if(focus16Edit.isChecked()){
            focus16String = "true";
        } else {
            focus16String = "false";
        }
        PitScout.botPitData.AutoStrategy2 = focus16String;

        CheckBox focus17Edit = (CheckBox) findViewById(R.id.checkBox17);
        String focus17String = null;
        if(focus17Edit.isChecked()){
            focus17String = "true";
        } else {
            focus17String = "false";
        }
        PitScout.botPitData.AutoStrategy3 = focus17String;

        CheckBox focus18Edit = (CheckBox) findViewById(R.id.checkBox18);
        String focus18String = null;
        if(focus18Edit.isChecked()){
            focus18String = "true";
        } else {
            focus18String = "false";
        }
        PitScout.botPitData.AutoStrategy4 = focus18String;

        CheckBox focus19Edit = (CheckBox) findViewById(R.id.checkBox19);
        String focus19String = null;
        if(focus19Edit.isChecked()){
            focus19String = "true";
        } else {
            focus19String = "false";
        }
        PitScout.botPitData.AutoStrategy5 = focus19String;

        CheckBox focus20Edit = (CheckBox) findViewById(R.id.checkBox20);
        String focus20String = null;
        if(focus20Edit.isChecked()){
            focus20String = "true";
        } else {
            focus20String = "false";
        }
        PitScout.botPitData.AutoStrategy6 = focus20String;

        //Back to norma|

        Spinner positionEdit = (Spinner) findViewById(R.id.desiredposition_spinner);
        String positionString = drivetrainEdit.getSelectedItem().toString();
        PitScout.botPitData.Position = positionString;

        Intent intent = new Intent(this, Team_Information.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Robot Information");

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
