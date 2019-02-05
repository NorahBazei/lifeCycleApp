package com.example.norahalbazzai.lifecycleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = " tst";


    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate()");

        b = (Button) findViewById(R.id.btnShow);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"The toast msg   is  being shown",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }

    public void showToast(View v)
    {
        Toast.makeText(getApplicationContext(),"The toast msg   is  being shown",Toast.LENGTH_SHORT).show();
        //t.show(); 

    }

}
