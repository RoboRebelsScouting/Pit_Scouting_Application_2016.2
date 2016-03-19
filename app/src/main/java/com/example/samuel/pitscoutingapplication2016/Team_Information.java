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
    public File getAlbumStorageDir(String albumName) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), albumName);
        if (!file.mkdirs()) {
            Log.e("ERROR", "Directory NOT Created");
        }
        return file;
    }

    public void SendCSV (View view) {
        File file = CreateCSV (view);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
        this.startActivityForResult(intent, 0);
    }

    public File CreateCSV (View view) {

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

        EditText faults2Edit = (EditText) findViewById(R.id.Faults2Text);
        String faults2String = faults2Edit.getText().toString();

        // don't allow faults to be empty
        if (faults2String.equals("")) {
            faults2String = "no faults noted";
        }
        PitScout.botPitData.Faults2 = faults2String;

        EditText notes2Edit = (EditText) findViewById(R.id.Notes2);
        String notes2String = notes2Edit.getText().toString();

        // don't allow notes2String to be empty
        if (notes2String.equals("")) {
            notes2String = "no notes";
        }
        PitScout.botPitData.Notes2 = notes2String;


        String fileName = PitScout.botPitData.Event + "-" + PitScout.botPitData.Team + "-" + "pit.csv";
        File directory = getAlbumStorageDir("/FRC2016");
        File file = new File(directory, fileName);
        try {
            FileWriter writer = new FileWriter(file);

            //remove commas from any text strings
            String newString = PitScout.botPitData.Scout.replace(",", ";");
            PitScout.botPitData.Scout = newString;
            System.out.println(PitScout.botPitData.Scout);

            String newString1 = PitScout.botPitData.Event.replace(",", ";");
            PitScout.botPitData.Event = newString1;
            System.out.println(PitScout.botPitData.Event);

            String newString2 = PitScout.botPitData.Notes1.replace(",", ";");
            PitScout.botPitData.Notes1 = newString2;
            System.out.println(PitScout.botPitData.Notes1);

            String newString3 = PitScout.botPitData.Faults1.replace(",", ";");
            PitScout.botPitData.Faults1 = newString3;
            System.out.println(PitScout.botPitData.Faults1);

            String newString4 = PitScout.botPitData.Notes2.replace(",", ";");
            PitScout.botPitData.Notes2 = newString4;
            System.out.println(PitScout.botPitData.Notes2);

            String newString5 = PitScout.botPitData.Faults2.replace(",", ";");
            PitScout.botPitData.Faults2 = newString5;
            System.out.println(PitScout.botPitData.Faults2);

            //replace quotation marks with dashes
            String newStringq = PitScout.botPitData.Scout.replace("\"", "-");
            PitScout.botPitData.Scout = newStringq;
            System.out.println(PitScout.botPitData.Scout);

            String newString1q = PitScout.botPitData.Event.replace("\"", "-");
            PitScout.botPitData.Event = newString1q;
            System.out.println(PitScout.botPitData.Event);

            String newString2q = PitScout.botPitData.Notes1.replace("\"", "-");
            PitScout.botPitData.Notes1 = newString2q;
            System.out.println(PitScout.botPitData.Notes1);

            String newString3q = PitScout.botPitData.Faults1.replace("\"", "-");
            PitScout.botPitData.Faults1 = newString3q;
            System.out.println(PitScout.botPitData.Faults1);

            String newString4q = PitScout.botPitData.Notes2.replace("\"", "-");
            PitScout.botPitData.Notes2 = newString4q;
            System.out.println(PitScout.botPitData.Notes2);

            String newString5q = PitScout.botPitData.Faults2.replace("\"", "-");
            PitScout.botPitData.Faults2 = newString5q;
            System.out.println(PitScout.botPitData.Faults2);

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
                    + PitScout.botPitData.Faults1 + ","
                    + PitScout.botPitData.Notes1 + ","

                    + PitScout.botPitData.Organization + ","
                    + PitScout.botPitData.CoOpInTeam + ","
                    + PitScout.botPitData.CoOpBtTeam + ","
                    + PitScout.botPitData.Problems + ","
                    + PitScout.botPitData.Faults2 + ","
                    + PitScout.botPitData.Notes2 ;
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
}
