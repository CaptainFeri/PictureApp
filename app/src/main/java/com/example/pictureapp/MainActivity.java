package com.example.pictureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean counter = false;

    ImageView picture_container;
    public void onclickBtn(View view){

        if(!counter) {
            picture_container.setImageResource(R.drawable.dog1);
            counter=true;
        }
        else if (counter){
            picture_container.setImageResource(R.drawable.dog2);
            counter=false;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        picture_container = findViewById(R.id.imageView);
    }
}
