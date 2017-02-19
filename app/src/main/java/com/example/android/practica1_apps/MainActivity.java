package com.example.android.practica1_apps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ePesos ,eDolares ;
    Button bConvertir;
    Double pesos,dolares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asi se muestra un texto con codigo en java y se deja comentado
        //setContentView(R.layout.activity_main);
        // TextView texto= new TextView(this);
        //texto.setText("hola mundo");
        //setContentView(texto);
        ePesos=(EditText) findViewById(R.id.pesos);
        eDolares=(EditText) findViewById(R.id.dolares);
        bConvertir=(Button) findViewById(R.id.bConvertir)   ;

        //pesos= Double.parseDouble(ePesos.getText().toString());
        //dolares= Double.parseDouble(eDolares.getText().toString());
        //Double.parseDouble(ePesos.getText().toString()); para convertir el texto que tenemos en
        //la app a double


        bConvertir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (ePesos.getText().toString().equals("")&&!eDolares.getText().toString().equals("")) {
                    dolares = Double.parseDouble(eDolares.getText().toString());
                    pesos = dolares * 3000;
                    ePesos.setText(pesos.toString());
                }
                if (eDolares.getText().toString().equals("")&&!ePesos.getText().toString().equals("")) {
                    pesos = Double.parseDouble(ePesos.getText().toString());
                    dolares = pesos / 3000;
                    eDolares.setText(dolares.toString());

                }

            }

        });

    }

}
