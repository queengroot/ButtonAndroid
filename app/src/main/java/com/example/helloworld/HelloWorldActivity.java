package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

//import necessary libraries for Toast and Log

import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;
import android.view.View;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);



        }

    //Code for topClick
    public void topClick(View v){
        Toast.makeText(this, "Top button clicked.",Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the top button. Testing");


    }

    public void bottomClick(View v){
        Toast.makeText(this, "Bottom button clicked.",Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the bottom button.");

    }


}

