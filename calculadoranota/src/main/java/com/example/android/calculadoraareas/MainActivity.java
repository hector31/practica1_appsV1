package com.example.android.calculadoraareas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    Button ecalcular;
    EditText enota1,enota2,enota3,enota4,enota5,eresultado;
    double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enota1= (EditText) findViewById(R.id.nota1);
        enota2= (EditText) findViewById(R.id.nota2);
        enota3= (EditText) findViewById(R.id.nota3);
        enota4= (EditText) findViewById(R.id.nota4);
        enota5= (EditText) findViewById(R.id.nota5);
        eresultado= (EditText) findViewById(R.id.resultado);
        ecalcular=(Button) findViewById(R.id.calcular);



        ecalcular.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            CharSequence text = "Estas en el lugar equivocado";
            CharSequence text2 = "Remal";
            CharSequence text3 = "Es posible recuperarse";
            CharSequence text4 = "Normalito";
            CharSequence text5 = "Muy Bien";
            CharSequence text6 = "Excelente estudiante";

            int duration = Toast.LENGTH_SHORT;

            @Override


            public void onClick(View view) {
                resultado=Double.parseDouble(enota1.getText().toString())*0.6+Double.parseDouble(enota2.getText().toString())*0.05
                +Double.parseDouble(enota3.getText().toString())*0.07+Double.parseDouble(enota4.getText().toString())*0.08
                +Double.parseDouble(enota5.getText().toString())*0.2;
                eresultado.setText(String.valueOf(String.format("%.3g%n",resultado)));

                if(resultado>=0&&resultado<=1) {
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();}
                if(resultado>1&&resultado<=2) {
                    Toast toast = Toast.makeText(context, text2, duration);
                    toast.show();}
                if(resultado>2&&resultado<=3) {
                    Toast toast = Toast.makeText(context, text3, duration);
                    toast.show();}
                if(resultado>3&&resultado<=4) {
                    Toast toast = Toast.makeText(context, text4, duration);
                    toast.show();}
                if(resultado>4&&resultado<=4.5) {
                    Toast toast = Toast.makeText(context, text5, duration);
                    toast.show();}
                if(resultado>4.5&&resultado<=5) {
                    Toast toast = Toast.makeText(context, text6, duration);
                    toast.show();}
                if(resultado>5) {
                    Toast toast = Toast.makeText(context, "Error nota mayor a 5 ingrese datos nuevamente ", duration);
                    eresultado.setText("0.00");
                    toast.show();}

            }
        });



    }
}
