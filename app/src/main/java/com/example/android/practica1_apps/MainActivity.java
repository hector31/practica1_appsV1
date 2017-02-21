package com.example.android.practica1_apps;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                CharSequence text = "Colocar una cantidad en pesos o dolares a convertir";
                CharSequence text2 = "Colocar solo una cantidad en pesos o en dolares intentar nuevamente ";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                if (eDolares.getText().toString().equals("")&&ePesos.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();}

                if (!eDolares.getText().toString().equals("")&&!ePesos.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(context, text2, duration);
                    toast.show();
                    eDolares.setText("");
                    ePesos.setText("");
                }

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
