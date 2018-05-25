package com.example.seru.a25052018project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void press(View view)
    {
        Toast.makeText(MainActivity.this, "button has been preesed", Toast.LENGTH_SHORT).show();
    }
}
