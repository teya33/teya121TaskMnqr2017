package com.hsarme.teya.teya121taskmnqr2017;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnDate;
    private Button btnTime;
    private TextView tvshowDate;
    private TextView tvshowTime;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDate = (Button) findViewById(R.id.btnDate);
        btnTime = (Button) findViewById(R.id.btnTime);
        tvshowDate = (TextView) findViewById(R.id.tvshowDate);
        tvshowTime = (TextView) findViewById(R.id.tvshowTime);
        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mnItemScreen1:
                Toast.makeText(getBaseContext(), "Hi...Screen1", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, Screen.class);
                startActivity(intent);
                break;

            case R.id.mnItemScreen2:
                Toast.makeText(getBaseContext(), "Hi...Screen2", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, Screen.class);
                startActivity(i);
                break;
            case R.id.mnItemScreen3:
                Toast.makeText(getBaseContext(), "Hi...Screen3", Toast.LENGTH_LONG).show();
                Intent in = new Intent(this, Screen.class);
                startActivity(in);
                break;
            case R.id.mnItemScreen4:
                Toast.makeText(getBaseContext(), "Hi...Screen4", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(this, Screen.class);
                startActivity(intent1);
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view == btnDate) {
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);
            //
            final DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                    tvshowDate.setText(year + "/" + month + "/" + dayOfMonth);
                }
            };
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, dateListener, year, month, day);
            datePickerDialog.show();


        }
        if (view == btnTime)
        {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);
            final TimePickerDialog.OnTimeSetListener timeListener = new TimePickerDialog.OnTimeSetListener()
            {
                @Override
                public void onTimeSet(TimePicker timePicker, int hour, int minute)
                {
                    tvshowTime.setText(hour + "" + minute);
                }

            };
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,timeListener, hour,minute,true);
            timePickerDialog.show();



        }

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.hsarme.teya.teya121taskmnqr2017/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.hsarme.teya.teya121taskmnqr2017/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

