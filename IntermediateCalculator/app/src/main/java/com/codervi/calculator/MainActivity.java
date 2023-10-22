package com.codervi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1txt;
    EditText number2txt;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number1txt = findViewById(R.id.number1txt);
        number2txt = findViewById(R.id.number2txt);
        result = findViewById(R.id.result);
    }
    
    public void toplama (View view)
    { //plus
        if(number1txt.getText().toString().matches("") || number2txt.getText().toString().matches("")) //Written in order not to get an error from the program when the if and else operations are left blank.
        {
            result.setText("Lütfen sayı giriniz");
        }
        else {
            int number1 = Integer.parseInt(number1txt.getText().toString());
            int number2 = Integer.parseInt(number2txt.getText().toString());

            int result1 = number1 + number2;

            result.setText("Sonuç : " + result1);
        }
    }

    public void cikarma (View view){
        // Minus
        if(number1txt.getText().toString().matches("") || number2txt.getText().toString().matches("")){
            result.setText("Lütfen sayı giriniz");
        }
        else {
            int number1 = Integer.parseInt(number1txt.getText().toString());
            int number2 = Integer.parseInt(number2txt.getText().toString());

            int result1 = number1 - number2;

            result.setText("Sonuç : " + result1);
        }

    }

    public void carpma (View view)
    {
        //Multiply
        if(number1txt.getText().toString().matches("") || number2txt.getText().toString().matches("")){
            result.setText("Lütfen sayı giriniz");
        }
        else {
            int number1 = Integer.parseInt(number1txt.getText().toString());
            int number2 = Integer.parseInt(number2txt.getText().toString());

            int result1 = number1 * number2;

            result.setText("Sonuç : " + result1);
        }

    }

    public void bolme (View view)
    {
        //Divided By
        if(number1txt.getText().toString().matches("") || number2txt.getText().toString().matches("")){
            result.setText("Lütfen sayı giriniz");
        }
        else {
            int number1 = Integer.parseInt(number1txt.getText().toString());
            int number2 = Integer.parseInt(number2txt.getText().toString());

            int result1 = number1 / number2;

            result.setText("Sonuç : " + result1);
        }
    }

    public void yuzde (View view){
        //percentage
        if(number1txt.getText().toString().matches("") || number2txt.getText().toString().matches("")){
            result.setText("Lütfen sayı giriniz");
        }
        else {
            int number1 = Integer.parseInt(number1txt.getText().toString());
            int number2 = Integer.parseInt(number2txt.getText().toString());

            double result1 = ((number1*number2)/100);

            result.setText("Sonuç : " + result1);
        }

    }

    public void kareKok(View view)
    {
        //square root
        if (number1txt.getText().toString().matches(""))
        {
            result.setText("Lütfen sayı giriniz");
        }
        else
        {
            double number1 = Double.parseDouble(number1txt.getText().toString());

            double result1 = Math.sqrt(number1);

            result.setText("Sonuç: " + result1);
        }

    }

}
