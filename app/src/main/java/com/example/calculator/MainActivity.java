package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText display;
    String expression="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addition = findViewById(R.id.add);
        Button sub = findViewById(R.id.subtract);
        Button multi = findViewById(R.id.multiply);
        Button div   = findViewById(R.id.divide);
        Button calculate = findViewById(R.id.calculate);
        Button decimal = findViewById(R.id.decimal);
        Button del = findViewById(R.id.del);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);

        display = findViewById(R.id.display);
        findViewById(R.id.num0).setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        addition.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        multi.setOnClickListener(this);
        decimal.setOnClickListener(this);
        del.setOnClickListener(this);

        calculate.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.del:
                expression = expression.substring(0,expression.length()-1);
                break;
            case R.id.calculate:
                expression = "Calculating...";

            default:
                Button temp = findViewById(view.getId());
                expression += temp.getText();


        }
        display.setText(expression);
    }

    public String calculate(){

    }
}