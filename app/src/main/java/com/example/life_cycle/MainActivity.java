package com.example.life_cycle;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
String tag="LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"in the on create event");
    }
    public void onStart()
    {
        super.onStart();
        Log.d(tag,"on start event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag,"on restart event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag,"on resume event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag,"on Pause event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag,"on stop event");
    }
}