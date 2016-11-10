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

    public void display(View v) {
        Button b = (Button)v;
        String text=res.getText().toString();
        text=text+b.getText();
        res.setText(text);
    }

    public void operacio(View s) {
        Button b = (Button)s;
        String text=res.getText().toString();
        num = Float.parseFloat(text);
        text="";
        res.setText(text);
        op=b.getText().charAt(0);
    }

    public void resol(View v) {
        float n;
        float r;
        String text;
        switch(op) {
            case '/':
                n=Float.parseFloat(res.getText().toString());
                r=num/n;
                text = String.format("%f", r);
                res.setText(text);
                break;
            case'x':
                n=Float.parseFloat(res.getText().toString());
                r=num*n;
                text = String.format("%f", r);
                res.setText(text);
                break;
            case'-':
                n=Float.parseFloat(res.getText().toString());
                r=num-n;
                text = String.format("%f", r);
                res.setText(text);
                break;
            case'+':
                n=Float.parseFloat(res.getText().toString());
                r=num+n;
                text = String.format("%f", r);
                res.setText(text);
                break;
        }
    }

    public void clear(View v) {
        String text="";
        res.setText(text);
        num=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        res = (TextView) findViewById(R.id.text);
    }
}
