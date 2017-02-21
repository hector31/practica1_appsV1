package com.example.android.calculadoraresistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.calculadoraresistencias.R.id.B1;
import static com.example.android.calculadoraresistencias.R.id.b1n2;
import static com.example.android.calculadoraresistencias.R.id.res;
import static com.example.android.calculadoraresistencias.R.id.text;
import static com.example.android.calculadoraresistencias.R.id.text2;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    double valor,valor2;
    TextView texto,texto2,texto3;
    int  cont1=0;
    double [] fila1 = new double[9];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=(TextView) findViewById(R.id.res);
        texto2=(TextView) findViewById(R.id.res2);
        texto3=(TextView) findViewById(R.id.res3);


        findViewById(R.id.check1).setOnClickListener(this);
        findViewById(R.id.check2).setOnClickListener(this);
        findViewById(R.id.check3).setOnClickListener(this);
        findViewById(R.id.b1n2).setOnClickListener(this);
        findViewById(R.id.b1n3).setOnClickListener(this);
        findViewById(R.id.b1n4).setOnClickListener(this);
        findViewById(R.id.b1n5).setOnClickListener(this);
        findViewById(R.id.b1n6).setOnClickListener(this);
        findViewById(R.id.b1n7).setOnClickListener(this);
        findViewById(R.id.b1n8).setOnClickListener(this);
        findViewById(R.id.b1n9).setOnClickListener(this);
        findViewById(R.id.b1n10).setOnClickListener(this);

        findViewById(R.id.b2n1).setOnClickListener(this);
        findViewById(R.id.b2n2).setOnClickListener(this);
        findViewById(R.id.b2n3).setOnClickListener(this);
        findViewById(R.id.b2n4).setOnClickListener(this);
        findViewById(R.id.b2n5).setOnClickListener(this);
        findViewById(R.id.b2n6).setOnClickListener(this);
        findViewById(R.id.b2n7).setOnClickListener(this);
        findViewById(R.id.b2n8).setOnClickListener(this);
        findViewById(R.id.b2n9).setOnClickListener(this);
        findViewById(R.id.b2n10).setOnClickListener(this);

        findViewById(R.id.b3n1).setOnClickListener(this);
        findViewById(R.id.b3n2).setOnClickListener(this);
        findViewById(R.id.b3n3).setOnClickListener(this);
        findViewById(R.id.b3n4).setOnClickListener(this);
        findViewById(R.id.b3n5).setOnClickListener(this);
        findViewById(R.id.b3n6).setOnClickListener(this);
        findViewById(R.id.b3n7).setOnClickListener(this);
        findViewById(R.id.b3n8).setOnClickListener(this);
        findViewById(R.id.b3n9).setOnClickListener(this);
        findViewById(R.id.b3n10).setOnClickListener(this);

        findViewById(R.id.b4n1).setOnClickListener(this);
        findViewById(R.id.b4n2).setOnClickListener(this);
        findViewById(R.id.b4n3).setOnClickListener(this);
        findViewById(R.id.b4n4).setOnClickListener(this);
        findViewById(R.id.b4n5).setOnClickListener(this);
        findViewById(R.id.b4n6).setOnClickListener(this);
        findViewById(R.id.b4n7).setOnClickListener(this);

        findViewById(R.id.b5n1).setOnClickListener(this);
        findViewById(R.id.b5n2).setOnClickListener(this);
        findViewById(R.id.b5n3).setOnClickListener(this);
        findViewById(R.id.b5n4).setOnClickListener(this);
        findViewById(R.id.b5n5).setOnClickListener(this);
        findViewById(R.id.b5n6).setOnClickListener(this);
        findViewById(R.id.b5n7).setOnClickListener(this);

        findViewById(R.id.b6n1).setOnClickListener(this);
        findViewById(R.id.b6n2).setOnClickListener(this);
        findViewById(R.id.b6n3).setOnClickListener(this);
        findViewById(R.id.b6n4).setOnClickListener(this);
        findViewById(R.id.b6n5).setOnClickListener(this);
        findViewById(R.id.b6n6).setOnClickListener(this);
        findViewById(R.id.b6n7).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int color = 0,coral = Color.parseColor("#ff7f50"),
        Rojo=Color.parseColor("#ff0000"),
        AzulClaro=Color.parseColor("#00ced1"),
        Marron=Color.parseColor("#a0522d"),
        CafeClaro=Color.parseColor("#deb887"),
        Morado=Color.parseColor("#800080"),
        Gris=Color.parseColor("#808080"),
        White=Color.parseColor("#ffffff"),
        Black=Color.parseColor("#000000"),
        Naranja=Color.parseColor("#ffa500"),
        Yellow=Color.parseColor("#ffff00"),
        Azul=Color.parseColor("#3F51B5"),
        Verde=Color.parseColor("#008000"),
        gris=Color.parseColor("#d3d3d3");

        ;


        switch (view.getId()) {
                case R.id.check1:
                    fila1[0]=0;
                    fila1[1]=0;
                    fila1[2]=0;
                    fila1[3]=0;
                    fila1[4]=0;
                    fila1[5]=0;
                    findViewById(R.id.B1).setBackgroundColor(gris);
                    findViewById(R.id.B2).setBackgroundColor(gris);
                    findViewById(R.id.B3).setBackgroundColor(gris);


                    findViewById(R.id.B4).setBackgroundColor(gris);
                findViewById(R.id.B5).setBackgroundColor(gris);
                findViewById(R.id.B6).setBackgroundColor(gris);

                findViewById(R.id.b5n1).setBackgroundColor(coral);
                findViewById(R.id.b5n2).setBackgroundColor(coral);
                findViewById(R.id.b5n3).setBackgroundColor(coral);
                findViewById(R.id.b5n4).setBackgroundColor(coral);
                findViewById(R.id.b5n5).setBackgroundColor(coral);
                findViewById(R.id.b5n7).setBackgroundColor(coral);
                findViewById(R.id.b5n6).setBackgroundColor(coral);

                findViewById(R.id.b6n1).setBackgroundColor(coral);
                findViewById(R.id.b6n2).setBackgroundColor(coral);
                findViewById(R.id.b6n3).setBackgroundColor(coral);
                findViewById(R.id.b6n4).setBackgroundColor(coral);
                findViewById(R.id.b6n5).setBackgroundColor(coral);
                findViewById(R.id.b6n6).setBackgroundColor(coral);
                findViewById(R.id.b6n7).setBackgroundColor(coral);

                findViewById(R.id.b3n8).setBackgroundColor(CafeClaro);
                findViewById(R.id.b3n9).setBackgroundColor(AzulClaro);
                findViewById(R.id.b3n10).setBackgroundColor(coral);

                findViewById(R.id.b4n1).setBackgroundColor(Marron);
                findViewById(R.id.b4n2).setBackgroundColor(Rojo);
                findViewById(R.id.b4n3).setBackgroundColor(CafeClaro);
                findViewById(R.id.b4n4).setBackgroundColor(AzulClaro);
                findViewById(R.id.b4n5).setBackgroundColor(coral);
                findViewById(R.id.b4n6).setBackgroundColor(coral);
                findViewById(R.id.b4n7).setBackgroundColor(coral);

                findViewById(R.id.B5).setVisibility(View.INVISIBLE);
                findViewById(R.id.B6).setVisibility(View.INVISIBLE);

                cont1=1;

                break;
            case R.id.check2:
                cont1=2;
                fila1[0]=0;
                fila1[1]=0;
                fila1[2]=0;
                fila1[3]=0;
                fila1[4]=0;
                fila1[5]=0;
                findViewById(R.id.B1).setBackgroundColor(gris);
                findViewById(R.id.B2).setBackgroundColor(gris);
                findViewById(R.id.B3).setBackgroundColor(gris);

                findViewById(R.id.B4).setBackgroundColor(gris);
                findViewById(R.id.B5).setBackgroundColor(gris);
                findViewById(R.id.B6).setBackgroundColor(gris);


                findViewById(R.id.b6n1).setBackgroundColor(coral);
                findViewById(R.id.b6n2).setBackgroundColor(coral);
                findViewById(R.id.b6n3).setBackgroundColor(coral);
                findViewById(R.id.b6n4).setBackgroundColor(coral);
                findViewById(R.id.b6n5).setBackgroundColor(coral);
                findViewById(R.id.b6n6).setBackgroundColor(coral);
                findViewById(R.id.b6n7).setBackgroundColor(coral);

                findViewById(R.id.b5n1).setBackgroundColor(Marron);
                findViewById(R.id.b5n2).setBackgroundColor(Rojo);
                findViewById(R.id.b5n3).setBackgroundColor(CafeClaro);
                findViewById(R.id.b5n4).setBackgroundColor(AzulClaro);
                findViewById(R.id.b5n5).setBackgroundColor(coral);
                findViewById(R.id.b5n7).setBackgroundColor(coral);
                findViewById(R.id.b5n6).setBackgroundColor(coral);

                findViewById(R.id.b3n8).setBackgroundColor(Morado);
                findViewById(R.id.b3n9).setBackgroundColor(Gris);
                findViewById(R.id.b3n10).setBackgroundColor(White);

                findViewById(R.id.b4n1).setBackgroundColor(Black);
                findViewById(R.id.b4n2).setBackgroundColor(Marron);
                findViewById(R.id.b4n3).setBackgroundColor(Rojo);
                findViewById(R.id.b4n4).setBackgroundColor(Naranja);
                findViewById(R.id.b4n5).setBackgroundColor(Yellow);
                findViewById(R.id.b4n6).setBackgroundColor(CafeClaro);
                findViewById(R.id.b4n7).setBackgroundColor(AzulClaro);

                findViewById(R.id.B6).setVisibility(View.INVISIBLE);
                findViewById(R.id.B5).setVisibility(View.VISIBLE);

                break;

            case R.id.check3:
            cont1=3;
                fila1[0]=0;
                fila1[1]=0;
                fila1[2]=0;
                fila1[3]=0;
                fila1[4]=0;
                fila1[5]=0;
                findViewById(R.id.B1).setBackgroundColor(gris);
                findViewById(R.id.B2).setBackgroundColor(gris);
                findViewById(R.id.B3).setBackgroundColor(gris);
                findViewById(R.id.B4).setBackgroundColor(gris);
                findViewById(R.id.B5).setBackgroundColor(gris);
                findViewById(R.id.B6).setBackgroundColor(gris);

                findViewById(R.id.b6n1).setBackgroundColor(White);
            findViewById(R.id.b6n2).setBackgroundColor(Azul);
            findViewById(R.id.b6n3).setBackgroundColor(Yellow);
            findViewById(R.id.b6n4).setBackgroundColor(Marron);
            findViewById(R.id.b6n5).setBackgroundColor(Morado);
            findViewById(R.id.b6n6).setBackgroundColor(Naranja);
            findViewById(R.id.b6n7).setBackgroundColor(Rojo);

                findViewById(R.id.b4n1).setBackgroundColor(Black);
                findViewById(R.id.b4n2).setBackgroundColor(Marron);
                findViewById(R.id.b4n3).setBackgroundColor(Rojo);
                findViewById(R.id.b4n4).setBackgroundColor(Naranja);
                findViewById(R.id.b4n5).setBackgroundColor(Yellow);
                findViewById(R.id.b4n6).setBackgroundColor(CafeClaro);
                findViewById(R.id.b4n7).setBackgroundColor(AzulClaro);

                findViewById(R.id.b5n1).setBackgroundColor(Marron);
                findViewById(R.id.b5n2).setBackgroundColor(Rojo);
                findViewById(R.id.b5n3).setBackgroundColor(CafeClaro);
                findViewById(R.id.b5n4).setBackgroundColor(AzulClaro);
                findViewById(R.id.b5n5).setBackgroundColor(coral);
                findViewById(R.id.b5n7).setBackgroundColor(coral);
                findViewById(R.id.b5n6).setBackgroundColor(coral);

                findViewById(R.id.b3n8).setBackgroundColor(Morado);
                findViewById(R.id.b3n9).setBackgroundColor(Gris);
                findViewById(R.id.b3n10).setBackgroundColor(White);

                findViewById(R.id.B5).setVisibility(View.VISIBLE);
                findViewById(R.id.B6).setVisibility(View.VISIBLE);

                break;
            case R.id.b1n2:findViewById(R.id.B1).setBackgroundColor(Marron);
                fila1[0]=1;break;
             case R.id.b1n3:findViewById(R.id.B1).setBackgroundColor(Rojo);
                fila1[0]=2;break;
            case R.id.b1n4:findViewById(R.id.B1).setBackgroundColor(Naranja);
                fila1[0]=3;break;
            case R.id.b1n5:findViewById(R.id.B1).setBackgroundColor(Yellow);
                fila1[0]=4;break;
            case R.id.b1n6:findViewById(R.id.B1).setBackgroundColor(Verde);
                fila1[0]=5;break;
            case R.id.b1n7:findViewById(R.id.B1).setBackgroundColor(Azul);
                fila1[0]=6;break;
            case R.id.b1n8:findViewById(R.id.B1).setBackgroundColor(Morado);
                fila1[0]=7;break;
            case R.id.b1n9:findViewById(R.id.B1).setBackgroundColor(Gris);
                fila1[0]=8;break;
            case R.id.b1n10:findViewById(R.id.B1).setBackgroundColor(White);
                fila1[0]=9;break;

            case R.id.b2n1:findViewById(R.id.B2).setBackgroundColor(Black);
                fila1[1]=0;break;
            case R.id.b2n2:findViewById(R.id.B2).setBackgroundColor(Marron);
                fila1[1]=1;break;
            case R.id.b2n3:findViewById(R.id.B2).setBackgroundColor(Rojo);
                fila1[1]=2;break;
            case R.id.b2n4:findViewById(R.id.B2).setBackgroundColor(Naranja);
                fila1[1]=3;break;
            case R.id.b2n5:findViewById(R.id.B2).setBackgroundColor(Yellow);
                fila1[1]=4;break;
            case R.id.b2n6:findViewById(R.id.B2).setBackgroundColor(Verde);
                fila1[1]=5;break;
            case R.id.b2n7:findViewById(R.id.B2).setBackgroundColor(Azul);
                fila1[1]=6;break;
            case R.id.b2n8:findViewById(R.id.B2).setBackgroundColor(Morado);
                fila1[1]=7;break;
            case R.id.b2n9:findViewById(R.id.B2).setBackgroundColor(Gris);
                fila1[1]=8;break;
            case R.id.b2n10:findViewById(R.id.B2).setBackgroundColor(White);
                fila1[1]=9;break;

            case R.id.b3n1:findViewById(R.id.B3).setBackgroundColor(Black);
                if(cont1==1) {fila1[2] = 1;                }
                if(cont1==2||cont1==3){fila1[2]=0;
                }break;
            case R.id.b3n2:findViewById(R.id.B3).setBackgroundColor(Marron);
                if(cont1==1) {fila1[2] = 10;                }
                if(cont1==2||cont1==3){fila1[2]=1;
                }break;
            case R.id.b3n3:findViewById(R.id.B3).setBackgroundColor(Rojo);
                if(cont1==1) {fila1[2] = 100;                }
                if(cont1==2||cont1==3){fila1[2]=2;
                }break;
            case R.id.b3n4:findViewById(R.id.B3).setBackgroundColor(Naranja);
                if(cont1==1) {fila1[2] = 1000;                }
                if(cont1==2||cont1==3){fila1[2]=3;
                }break;
            case R.id.b3n5:findViewById(R.id.B3).setBackgroundColor(Yellow);
                if(cont1==1) {fila1[2] = 10000;                }
                if(cont1==2||cont1==3){fila1[2]=4;
                }break;
            case R.id.b3n6:findViewById(R.id.B3).setBackgroundColor(Verde);
                if(cont1==1) {fila1[2] = 100000;                }
                if(cont1==2||cont1==3){fila1[2]=5;
                }break;
            case R.id.b3n7:findViewById(R.id.B3).setBackgroundColor(Azul);
                if(cont1==1) {fila1[2] = 1000000;                }
                if(cont1==2||cont1==3){fila1[2]=6;
                }break;
            case R.id.b3n8:
                if(cont1==1) {findViewById(R.id.B3).setBackgroundColor(CafeClaro);
                    fila1[2] = 0.1;                }
                if(cont1==2||cont1==3){findViewById(R.id.B3).setBackgroundColor(Morado);
                    fila1[2]=7;
                }break;
            case R.id.b3n9:
                if(cont1==1) {findViewById(R.id.B3).setBackgroundColor(AzulClaro);
                    fila1[2] = 0.01;                }
                if(cont1==2||cont1==3){findViewById(R.id.B3).setBackgroundColor(Gris);
                    fila1[2]=8;
                }break;
            case R.id.b3n10:
                     if(cont1==2||cont1==3){findViewById(R.id.B3).setBackgroundColor(White);
                    fila1[2]=9;
                }break;


            case R.id.b4n1:
                if(cont1==1) {findViewById(R.id.B4).setBackgroundColor(Marron);fila1[3] = 1;                }
                if(cont1==2||cont1==3){findViewById(R.id.B4).setBackgroundColor(Black);fila1[3]=1;
                }break;
            case R.id.b4n2:
                if(cont1==1) {findViewById(R.id.B4).setBackgroundColor(Rojo);fila1[3] = 2;                }
                if(cont1==2||cont1==3){findViewById(R.id.B4).setBackgroundColor(Marron);fila1[3]=10;
                }break;
            case R.id.b4n3:
                if(cont1==1) {findViewById(R.id.B4).setBackgroundColor(CafeClaro);fila1[3] = 5;                }
                if(cont1==2||cont1==3){findViewById(R.id.B4).setBackgroundColor(Rojo);fila1[3]=100;
                }break;
            case R.id.b4n4:
                if(cont1==1) {findViewById(R.id.B4).setBackgroundColor(AzulClaro);fila1[3] = 10;                }
                if(cont1==2||cont1==3){findViewById(R.id.B4).setBackgroundColor(Naranja);fila1[3]=1000;
                }break;
            case R.id.b4n5:
                if(cont1==2||cont1==3){findViewById(R.id.B4).setBackgroundColor(Yellow);fila1[3]=10000;
                }break;
            case R.id.b4n6:
                if(cont1==2||cont1==3){findViewById(R.id.B4).setBackgroundColor(CafeClaro);fila1[3]=0.1;
                }break;
            case R.id.b4n7:
                if(cont1==2||cont1==3){findViewById(R.id.B4).setBackgroundColor(AzulClaro);fila1[3]=0.01;
                }break;


            case R.id.b5n1:
                if(cont1==2||cont1==3){findViewById(R.id.B5).setBackgroundColor(Marron);fila1[4]=1;
                }break;
            case R.id.b5n2:
                if(cont1==2||cont1==3){findViewById(R.id.B5).setBackgroundColor(Rojo);fila1[4]=2;
                }break;
            case R.id.b5n3:
                if(cont1==2||cont1==3){findViewById(R.id.B5).setBackgroundColor(CafeClaro);fila1[4]=5;
                }break;
            case R.id.b5n4:
                if(cont1==2||cont1==3){findViewById(R.id.B5).setBackgroundColor(AzulClaro);fila1[4]=10;
                }break;



            case R.id.b6n1:
                if(cont1==3){findViewById(R.id.B6).setBackgroundColor(White);fila1[5]=1;
                }break;
            case R.id.b6n2:
                if(cont1==3){findViewById(R.id.B6).setBackgroundColor(Azul);fila1[5]=10;
                }break;
            case R.id.b6n3:
                if(cont1==3){findViewById(R.id.B6).setBackgroundColor(Yellow);fila1[5]=25;
                }break;
            case R.id.b6n4:
                if(cont1==3){findViewById(R.id.B6).setBackgroundColor(Marron);fila1[5]=100;
                }break;
            case R.id.b6n5:
                if(cont1==3){findViewById(R.id.B6).setBackgroundColor(Morado);fila1[5]=5;
                }break;
            case R.id.b6n6:
                if(cont1==3){findViewById(R.id.B6).setBackgroundColor(Naranja);fila1[5]=15;
                }break;
            case R.id.b6n7:
                if(cont1==3){findViewById(R.id.B6).setBackgroundColor(Rojo);fila1[5]=50;
                }break;


        }


        if(cont1==1){
            valor=(10*fila1[0]+fila1[1])*fila1[2];

        }
        if(cont1==2){
            valor=(100*fila1[0]+10*fila1[1]+fila1[2])*fila1[3];


        }
        if(cont1==3){
            valor=(100*fila1[0]+10*fila1[1]+fila1[2])*fila1[3];

        }

        texto.setText(String.valueOf(valor)+" ohms");
        if(cont1==1){
        texto2.setText("Tol "+String.valueOf((int)fila1[3])+" %");
        texto3.setText( " "+String.valueOf((int) fila1[5])+" PPM"  );}
       if(cont1==2){
        texto2.setText("Tol "+String.valueOf((int)fila1[4])+" %");
        texto3.setText( " "+String.valueOf((int) fila1[5])+" PPM"  );}
        if(cont1==3) {
            texto2.setText("Tol " + String.valueOf((int) fila1[4]) + " %");
            texto3.setText( " "+String.valueOf((int) fila1[5])+" PPM"  );
        }
        }

  /*  public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.check1:
                if (checked) {
                    findViewById(R.id.b5n1).setBackgroundColor(Integer.parseInt("#ff7f50"));
                }
                break;
        }
    }*/
}

