package com.example.zianfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name;
    EditText myName;
    TextView display;
    Button click;
    Button clear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.txtName);
        myName = findViewById(R.id.txtMyName);
        display = findViewById(R.id.txtDisplay);
        click = findViewById(R.id.btnClick);
        clear = findViewById(R.id.btnClear);

       //display.setText("Hello "+ myName);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue =  myName.getText().toString();
                display.setText("Hello "+ myValue +"!");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("Hello!");
                myName.setText(" ");

            }
        });

    }
}