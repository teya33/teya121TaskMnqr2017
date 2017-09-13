package com.hsarme.teya.teya121taskmnqr2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.mnItemScreen1:
                Toast.makeText(getBaseContext(), "Hi...Screen1", Toast.LENGTH_LONG).show();
                break;

            case R.id.mnItemScreen2:
            Toast.makeText(getBaseContext(), "Hi...Screen2", Toast.LENGTH_LONG).show();
            break;
            case R.id.mnItemScreen3:
            Toast.makeText(getBaseContext(), "Hi...Screen3", Toast.LENGTH_LONG).show();
            break;
            case R.id.mnItemScreen4:
            Toast.makeText(getBaseContext(), "Hi...Screen4", Toast.LENGTH_LONG).show();
            break;
        }
        return true;
        }
    }

