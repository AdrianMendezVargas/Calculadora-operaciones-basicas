package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_res;
    private EditText et_valor1;
    private EditText et_valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_res = (TextView)findViewById(R.id.tv_r);
        et_valor1 = (EditText)findViewById(R.id.txt_num1);
        et_valor2 = (EditText)findViewById(R.id.txt_num2);
    }

    public void Sumar(View component){

        String valor1 = et_valor1.getText().toString();
        String valor2 = et_valor2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        long suma = numero1 + numero2;

        String resultado = String.valueOf(suma);

        tv_res.setText(resultado);

    }

    public void Restar(View component){

        String valor1 = et_valor1.getText().toString();
        String valor2 = et_valor2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        long resta = numero1 - numero2;

        String resultado = String.valueOf(resta);

        tv_res.setText(resultado);

    }

    public void Dividir(View component){

        String valor1 = et_valor1.getText().toString();
        String valor2 = et_valor2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        long divicion = numero1 / numero2;

        String resultado = String.valueOf(divicion);

        tv_res.setText(resultado);

    }

    public void Multiplicar(View component){

        String valor1 = et_valor1.getText().toString();
        String valor2 = et_valor2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        long multiplicacion = numero1 * numero2;

        String resultado = String.valueOf(multiplicacion);

        tv_res.setText(resultado);

    }

}
