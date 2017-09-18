package com.hsarme.teya.teya121taskmnqr2017;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnDate;
    private Button btnTime;
    private TextView tvshowDate;
    private TextView tvshowTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDate= (Button) findViewById(R.id.btnDate);
        btnTime=(Button)findViewById(R.id.btnTime);
        tvshowDate= (TextView) findViewById(R.id.tvshowDate);
        tvshowTime=(TextView)findViewById(R.id.tvshowTime);
        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.mnItemScreen1:
                Toast.makeText(getBaseContext(), "Hi...Screen1", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this,Screen.class);
                startActivity(intent);
                break;

            case R.id.mnItemScreen2:
            Toast.makeText(getBaseContext(), "Hi...Screen2", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this,Screen.class);
                startActivity(i);
            break;
            case R.id.mnItemScreen3:
            Toast.makeText(getBaseContext(), "Hi...Screen3", Toast.LENGTH_LONG).show();
                Intent in = new Intent(this,Screen.class);
                startActivity(in);
            break;
            case R.id.mnItemScreen4:
            Toast.makeText(getBaseContext(), "Hi...Screen4", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(this,Screen.class);
                startActivity(intent1);
            break;
        }
        return true;
        }

    @Override
    public void onClick(View view)
    {
     if (view==btnDate)
     {
         Calendar c= Calendar.getInstance();
     }

    }
}

