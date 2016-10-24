package com.example.ariadna.calculadora_android;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.ariadna.calculadora_android.R.id.b0;
import static com.example.ariadna.calculadora_android.R.id.b1;
import static com.example.ariadna.calculadora_android.R.id.b2;
import static com.example.ariadna.calculadora_android.R.id.b3;
import static com.example.ariadna.calculadora_android.R.id.b4;
import static com.example.ariadna.calculadora_android.R.id.b5;
import static com.example.ariadna.calculadora_android.R.id.b6;
import static com.example.ariadna.calculadora_android.R.id.b7;
import static com.example.ariadna.calculadora_android.R.id.b8;
import static com.example.ariadna.calculadora_android.R.id.b9;
import static com.example.ariadna.calculadora_android.R.id.clr;
import static com.example.ariadna.calculadora_android.R.id.coma;
import static com.example.ariadna.calculadora_android.R.id.div;
import static com.example.ariadna.calculadora_android.R.id.mult;
import static com.example.ariadna.calculadora_android.R.id.sum;
import static com.example.ariadna.calculadora_android.R.id.text;

public class CalculatorActivity extends AppCompatActivity {

        private  TextView text;
        private EditText operacion, mem; //mem memoritza els numeros escrits per poder fer els calculs posteriorment
        double num1, num2, resultado; //primer numero escrit, segon numero escrit, variable per emmagatzemar el resultat
        String operador;     //variable que llevará los signos operacionales
        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, res, sum, mult, div, igual, coma;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        text = (TextView) findViewById(R.id.text);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        sum = (Button) findViewById(sum);
        res = (Button) findViewById(R.id.res);
        mult = (Button) findViewById(mult);
        div = (Button) findViewById(R.id.div);
        clr = (Button) findViewById(clr);
        operacion = (EditText) findViewById(R.id.operacion);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion)); //memoritza
                operacion.setText(mem.getText().toString() "1"); //guarda el numero 1
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "2");
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "3");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "5");
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "7");
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "8");
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "9");
            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() "0");
            }
        });

        coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                operacion.setText(mem.getText().toString() ",");
            }
        });


        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mem = EditText (findViewById(R.id.operacion));
                num2 = Double.parseDouble(mem.getText().toString());

                if operador.equals("+"){ //compara el simbol seleccionat amb el del parentesis
                    operacion.setText();
                    resultado = num1 + num1;
                    }

                if operador.equals("-"){
                    operacion.setText();
                    resultado = num1 - num1;
                    }

                if operador.equals("*"){
                    operacion.setText();
                    resultado = num1 * num1;
                }

                if operador.equals("/"){
                    operacion.setText();
                    resultado = num1 / num1;
                }

                operacion.setText(String.valueOf(resultado)); //muestra resultado por pantalla




        });
    }
}
