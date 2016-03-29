package com.example.samuel.pitscoutingapplication2016;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RobotBuild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot_build);
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
    }

    public void getBrokenStuffInBuildData () {
        CheckBox climberB = (CheckBox) findViewById(R.id.climberBroke);
        CheckBox driveTrainB = (CheckBox) findViewById(R.id.drivetrainBroke);
        CheckBox collectorB = (CheckBox) findViewById(R.id.collectorBroke);
        CheckBox wheelB = (CheckBox) findViewById(R.id.wheelBroke);
        CheckBox frameB = (CheckBox) findViewById(R.id.frameBroke);
        CheckBox shooterB = (CheckBox) findViewById(R.id.shooterBroke);

        PitScout.botPitData.brokenParts[0] = climberB.isChecked();
        PitScout.botPitData.brokenParts[1] = driveTrainB.isChecked();
        PitScout.botPitData.brokenParts[2] = collectorB.isChecked();
        PitScout.botPitData.brokenParts[3] = wheelB.isChecked();
        PitScout.botPitData.brokenParts[4] = frameB.isChecked();
        PitScout.botPitData.brokenParts[5] = shooterB.isChecked();
    }

    public void getFlawedStructureInBuildData () {
        CheckBox aluminum = (CheckBox) findViewById(R.id.aluminumFlaw);
        CheckBox direct = (CheckBox) findViewById(R.id.directDriveFlaw);
        CheckBox battery = (CheckBox) findViewById(R.id.batteryFlaw);
        CheckBox rivets = (CheckBox) findViewById(R.id.rivetsFlaw);
        CheckBox suspension = (CheckBox) findViewById(R.id.suspensionFlaw);

        PitScout.botPitData.structureFlaws[0] = aluminum.isChecked();
        PitScout.botPitData.structureFlaws[1] = direct.isChecked();
        PitScout.botPitData.structureFlaws[2] = battery.isChecked();
        PitScout.botPitData.structureFlaws[3] = rivets.isChecked();
        PitScout.botPitData.structureFlaws[4] = suspension.isChecked();
    }

    public void getNotes() {
        String notes = ((EditText) findViewById(R.id.notesEditText)).getText().toString();
        String reliability = ((EditText) findViewById(R.id.reliabilityEditText)).getText().toString();

        reliability.replace(",",";");
        reliability.replace("\"","-");

        notes.replace(",",";");
        notes.replace("\"","-");

        PitScout.botPitData.Notes = notes;
        PitScout.botPitData.reliability = reliability;
    }

    public static File getAlbumStorageDir(String albumName) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), albumName);
        if (!file.mkdirs()) {
            Log.e("ERROR", "Directory NOT Created");
        }
        return file;
    }

    public File CreateCSV (View view) {
        getBrokenStuffInBuildData();
        getFlawedStructureInBuildData();
        getNotes();
        long time = System.currentTimeMillis();
        String fileName = PitScout.botPitData.Event + "-" + PitScout.botPitData.Team + "-"+ time + "-" + "pit.csv";
        File directory = getAlbumStorageDir("/FRC2016");
        File file = new File(directory, fileName);
        try {
            FileWriter writer = new FileWriter(file);

            String lineOne = PitScout.botPitData.Scout + "," +
                    PitScout.botPitData.Event + ","+
                    PitScout.botPitData.Team + ","+

                    PitScout.botPitData.DriveTrainType + ","+
                    PitScout.botPitData.Climbing + ","
                    + PitScout.botPitData.ShootingStrategy + ","
                    + PitScout.botPitData.Focus1 + ","
                    + PitScout.botPitData.Focus2 + ","
                    + PitScout.botPitData.Focus3 + ","
                    + PitScout.botPitData.Focus4 + ","
                    + PitScout.botPitData.Defense1 + ","
                    + PitScout.botPitData.Defense2 + ","
                    + PitScout.botPitData.Defense3 + ","
                    + PitScout.botPitData.Defense4 + ","
                    + PitScout.botPitData.Defense5 + ","
                    + PitScout.botPitData.Defense6 + ","
                    + PitScout.botPitData.Defense7 + ","
                    + PitScout.botPitData.Defense8 + ","
                    + PitScout.botPitData.Defense9 + ","
                    + PitScout.botPitData.Position + ","
                    + PitScout.botPitData.AutoStrategy1 + ","
                    + PitScout.botPitData.AutoStrategy2 + ","
                    + PitScout.botPitData.AutoStrategy3 + ","
                    + PitScout.botPitData.AutoStrategy4 + ","
                    + PitScout.botPitData.AutoStrategy5 + ","
                    + PitScout.botPitData.AutoStrategy6 + ","
                    + PitScout.botPitData.Notes + ","

                    + PitScout.botPitData.Organization + ","
                    + PitScout.botPitData.CoOpInTeam + ","
                    + PitScout.botPitData.CoOpBtTeam + ","
                    + PitScout.botPitData.Problems + ","

                    + PitScout.botPitData.brokenParts[0] + ","
                    + PitScout.botPitData.brokenParts[1] + ","
                    + PitScout.botPitData.brokenParts[2] + ","
                    + PitScout.botPitData.brokenParts[3] + ","
                    + PitScout.botPitData.brokenParts[4] + ","
                    + PitScout.botPitData.brokenParts[5] + ","
                    + PitScout.botPitData.structureFlaws[0] + ","
                    + PitScout.botPitData.structureFlaws[1] + ","
                    + PitScout.botPitData.structureFlaws[2] + ","
                    + PitScout.botPitData.structureFlaws[3] + ","
                    + PitScout.botPitData.structureFlaws[4] + ","
                    + PitScout.botPitData.reliability + ","
                    + time;
            writer.write(lineOne + "\n");
            writer.close();

            return file;

        } catch (IOException e) {
            Log.e("ERROR", "File NOT Created", e);
        }
        return null;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Intent intent = new Intent(this, Pit_Scouting_GUI.class);
        String Scout = PitScout.botPitData.Scout;
        PitScout.botPitData.clear();
        PitScout.botPitData.Scout = Scout;
        startActivity(intent);
    }

    public void SendCSV (View view) {
        File file = CreateCSV (view);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
        this.startActivityForResult(intent, 0);
    }

}
