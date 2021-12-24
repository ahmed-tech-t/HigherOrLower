package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    int ornum;
    public void GenrateRandomNumber(){
        Random rand =new Random();
        ornum =rand.nextInt(20)+1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GenrateRandomNumber();
    }
    public void butry(View view) {
        EditText etguess =(EditText) findViewById(R.id.etguess);
        int num = Integer.parseInt(etguess.getText().toString());
        String message = null;
        etguess.getText().clear();
        if (num == ornum) {
            message = "You Got it! Try Again!" ;
            GenrateRandomNumber();
        }
        else if(num>ornum)
        {
            message = "Lower!";
        }
        else if(num<ornum)
        {
            message ="Higher!" ;
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}