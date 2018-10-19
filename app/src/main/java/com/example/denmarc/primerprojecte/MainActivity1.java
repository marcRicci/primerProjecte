package com.example.denmarc.primerprojecte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Log.i("etiqueta", "a onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("etiqueta", "a onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("etiqueta", "a onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("etiqueta", "a onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("etiqueta", "a onRestart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("etiqueta", "a onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("etiqueta", "a onDestroy");
    }
}
