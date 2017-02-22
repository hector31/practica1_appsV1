package com.example.android.calculadoradeareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ecalcular;
    TextView text1,text2,text3,text4,text5;
    EditText lado1,lado2,lado3,earea,PeriVolumen;
    RadioButton cuadro,triangulo,circulo,cubo;
    double area=0,Perimetro=0,Volumen=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1= (TextView) findViewById(R.id.etext);
        text2= (TextView) findViewById(R.id.etext2);
        text3= (TextView) findViewById(R.id.etext3);
        text4= (TextView) findViewById(R.id.etext4);
        text5= (TextView) findViewById(R.id.etext5);

        lado1=(EditText) findViewById(R.id.elado1);
        lado2=(EditText) findViewById(R.id.elado2);
        lado3=(EditText) findViewById(R.id.elado3);
        earea=(EditText) findViewById(R.id.res1);
        PeriVolumen=(EditText) findViewById(R.id.res2);


        cuadro= (RadioButton) findViewById(R.id.ecuadro);
        triangulo= (RadioButton) findViewById(R.id.etriangulo);
        circulo= (RadioButton) findViewById(R.id.ecirculo);
        cubo= (RadioButton) findViewById(R.id.ecubo);
        ecalcular=(Button) findViewById(R.id.calcular);

        text1.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.INVISIBLE);
        text4.setVisibility(View.INVISIBLE);
        text5.setVisibility(View.INVISIBLE);


        lado1.setVisibility(View.INVISIBLE);
        lado2.setVisibility(View.INVISIBLE);
        lado3.setVisibility(View.INVISIBLE);
        PeriVolumen.setVisibility(View.INVISIBLE);
        earea.setVisibility(View.INVISIBLE);
        ecalcular.setVisibility(View.INVISIBLE);

        cuadro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lado1.setText("");
                lado2.setText("");
                lado3.setText("");
                earea.setText("");
                PeriVolumen.setText("");
                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.INVISIBLE);
                text4.setVisibility(View.VISIBLE);
                text5.setVisibility(View.VISIBLE);
                lado1.setVisibility(View.VISIBLE);
                lado2.setVisibility(View.VISIBLE);
                lado3.setVisibility(View.INVISIBLE);
                PeriVolumen.setVisibility(View.VISIBLE);
                earea.setVisibility(View.VISIBLE);
                ecalcular.setVisibility(View.VISIBLE);

                text1.setText("Lado A");
                text2.setText("Lado B");
                text5.setText("PERIMETRO");

                ecalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        area=Double.parseDouble(lado1.getText().toString())*Double.parseDouble(lado2.getText().toString());
                        earea.setText(String.valueOf(area));
                        Perimetro=Double.parseDouble(lado1.getText().toString())*2+Double.parseDouble(lado2.getText().toString())*2;
                        PeriVolumen.setText(String.valueOf(Perimetro));
                    }
                });

            }

        });
        circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lado1.setText("");
                lado2.setText("");
                lado3.setText("");
                earea.setText("");
                PeriVolumen.setText("");

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.INVISIBLE);
                text3.setVisibility(View.INVISIBLE);
                text4.setVisibility(View.VISIBLE);
                text5.setVisibility(View.VISIBLE);
                lado1.setVisibility(View.VISIBLE);
                lado2.setVisibility(View.INVISIBLE);
                lado3.setVisibility(View.INVISIBLE);
                PeriVolumen.setVisibility(View.VISIBLE);
                earea.setVisibility(View.VISIBLE);
                ecalcular.setVisibility(View.VISIBLE);

                text1.setText("Radio");
                text5.setText("PERIMETRO");

                ecalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        area=Double.parseDouble(lado1.getText().toString())*Double.parseDouble(lado1.getText().toString())*3.14159263;
                        earea.setText(String.valueOf(area));
                        Perimetro=Double.parseDouble(lado1.getText().toString())*2*3.14159263;
                        PeriVolumen.setText(String.valueOf(Perimetro));
                    }
                });

            }
        });

        triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lado1.setText("");
                lado2.setText("");
                lado3.setText("");
                earea.setText("");
                PeriVolumen.setText("");

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
                text5.setVisibility(View.VISIBLE);
                lado1.setVisibility(View.VISIBLE);
                lado2.setVisibility(View.VISIBLE);
                lado3.setVisibility(View.VISIBLE);
                PeriVolumen.setVisibility(View.VISIBLE);
                earea.setVisibility(View.VISIBLE);
                ecalcular.setVisibility(View.VISIBLE);


                text1.setText("Lado A");
                text2.setText("Lado B");
                text3.setText("Lado C");
                text5.setText("PERIMETRO");

                ecalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double a,b,c,p;
                        a=Double.parseDouble(lado1.getText().toString());
                        b=Double.parseDouble(lado2.getText().toString());
                        c=Double.parseDouble(lado3.getText().toString());
                        p=(a+b+c)/2;
                        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
                        earea.setText(String.valueOf(area));
                        Perimetro=a+b+c;
                        PeriVolumen.setText(String.valueOf(Perimetro));
                    }
                });

            }
        });
        cubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lado1.setText("");
                lado2.setText("");
                lado3.setText("");
                earea.setText("");
                PeriVolumen.setText("");

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.INVISIBLE);
                text3.setVisibility(View.INVISIBLE);
                text4.setVisibility(View.VISIBLE);
                text5.setVisibility(View.VISIBLE);
                lado1.setVisibility(View.VISIBLE);
                lado2.setVisibility(View.INVISIBLE);
                lado3.setVisibility(View.INVISIBLE);
                PeriVolumen.setVisibility(View.VISIBLE);
                earea.setVisibility(View.VISIBLE);
                ecalcular.setVisibility(View.VISIBLE);

                text1.setText("Lado A");
                text5.setText("VOLUMEN");

                ecalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double a;
                        a=Double.parseDouble(lado1.getText().toString());
                        area=6*a*a;
                        earea.setText(String.valueOf(area));
                        Volumen=Math.pow(a,3);
                        PeriVolumen.setText(String.valueOf(Volumen));
                    }
                });

            }
        });




    }
}
