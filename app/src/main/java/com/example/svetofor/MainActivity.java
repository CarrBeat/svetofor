package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void red(View view) {
        getWindow().setBackgroundDrawableResource(R.drawable.red);
    }


    public void yellow(View view) {
        getWindow().setBackgroundDrawableResource(R.drawable.yellow);
    }

    public void green(View view) {
        getWindow().setBackgroundDrawableResource(R.drawable.green);
    }
}
