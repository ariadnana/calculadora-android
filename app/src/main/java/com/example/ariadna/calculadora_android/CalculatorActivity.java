package com.example.ariadna.calculadora_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    float num=0;
    char op='n';
    private TextView res;

    public void display(View v){
        Button b = (Button)v;
        String text=res.getText().toString();
        text=text+b.getText();
        res.setText(text);
    }

    public void operacio(View s){
        String text=res.getText().toString();
        num = Float.parseFloat(text);
        text="";
        res.setText(text);
    }

    public void resol(){

    }

    public void clear(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        res = (TextView) findViewById(R.id.text);

    }
}
