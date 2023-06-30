package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        imageButton = findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(listener);
        imageButton2 = findViewById(R.id.imageButton3);
        imageButton2.setOnClickListener(listener2);
        imageButton3 = findViewById(R.id.imageButton4);
        imageButton3.setOnClickListener(listener3);

    }
    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplicationContext(),SeActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener listener2 = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplicationContext(),EcActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener listener3 = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplicationContext(),ScActivity.class);
            startActivity(intent);
        }
    };
}