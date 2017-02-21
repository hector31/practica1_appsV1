package com.example.android.calculadora;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eNum;
    Button eUno,eDos,eTres,eCuatro,eCinco,eSeis,eSiete,eOcho,eNueve,ePunto,eCero,eBorrar,eDivision,eMas,eMenos,ePor,
            eIgual;
    double entrada,resultado=0;
    double opMas=0,opMenos=0,opPor=0,opDivision=0 ;
    int cont=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNum = (EditText) findViewById(R.id.eNumero);
        eUno=(Button) findViewById(R.id.b1)   ;
        eDos=(Button) findViewById(R.id.b2)   ;
        eTres=(Button) findViewById(R.id.b3)   ;
        eCuatro=(Button) findViewById(R.id.b4)   ;
        eCinco=(Button) findViewById(R.id.b5)   ;
        eSeis=(Button) findViewById(R.id.b6)   ;
        eSiete=(Button) findViewById(R.id.b7)   ;
        eOcho=(Button) findViewById(R.id.b8)   ;
        eNueve=(Button) findViewById(R.id.b9)   ;
        eMas=(Button) findViewById(R.id.bMas)   ;
        eMenos=(Button) findViewById(R.id.bMenos)   ;
        eIgual=(Button) findViewById(R.id.bIgual)   ;
        ePunto=(Button) findViewById(R.id.bPunto)   ;
        ePor=(Button) findViewById(R.id.bPor)   ;
        eDivision=(Button) findViewById(R.id.bDivision)   ;
        eCero=(Button) findViewById(R.id.b0)   ;
        eIgual=(Button) findViewById(R.id.bIgual)   ;
        eBorrar=(Button) findViewById(R.id.bBorrar);



    }
    public void click (View view){

        int id = view.getId();
        switch (id){

            case R.id.b1:if(cont==0||cont==1){eNum.setText(eNum.getText()+"1");
            }
                if(cont>1){eNum.setText("");eNum.setText("1");cont=1;
                }
                break;
            case R.id.b2:if(cont==0||cont==1){eNum.setText(eNum.getText()+"2");
            }
                if(cont>1){eNum.setText("");eNum.setText("2");cont=1;
                }                break;
            case R.id.b3:if(cont==0||cont==1){eNum.setText(eNum.getText()+"3");
            }
                if(cont>1){eNum.setText("");eNum.setText("3");cont=1;
                }
                break;
            case R.id.b4: if(cont==0||cont==1){eNum.setText(eNum.getText()+"4");
            }
                if(cont>1){eNum.setText("");eNum.setText("4");cont=1;
                }
                break;
            case R.id.b5: if(cont==0||cont==1){eNum.setText(eNum.getText()+"5");
            }
                if(cont>1){eNum.setText("");eNum.setText("6");cont=1;
                }
                break;
            case R.id.b6: if(cont==0||cont==1){eNum.setText(eNum.getText()+"6");
            }
                if(cont>1){eNum.setText("");eNum.setText("6");cont=1;
                }
                break;
            case R.id.b7: if(cont==0||cont==1){eNum.setText(eNum.getText()+"7");
            }
                if(cont>1){eNum.setText("");eNum.setText("7");cont=1;
                }
                break;
            case R.id.b8: if(cont==0||cont==1){eNum.setText(eNum.getText()+"8");
            }
                if(cont>1){eNum.setText("");eNum.setText("8");cont=1;
                }
                break;
            case R.id.b9:if(cont==0||cont==1){eNum.setText(eNum.getText()+"9");
            }
                if(cont>1){eNum.setText("");eNum.setText("9");cont=1;
                }
                break;
            case R.id.b0: if(cont==0||cont==1){eNum.setText(eNum.getText()+"0");
            }
                if(cont>1){eNum.setText("");eNum.setText("0");cont=1;
                }
                break;

            case R.id.bMas:opMas=Double.parseDouble( eNum.getText().toString());
                if(cont!=0){resultado=resultado+Double.parseDouble( eNum.getText().toString());
                    eNum.setText(String.valueOf(resultado ));
                }
                if(cont==0){resultado=Double.parseDouble( eNum.getText().toString());
                    eNum.setText("");}cont++;

                break;

            case R.id.bMenos:

                opMenos=Double.parseDouble( eNum.getText().toString());

                if(cont!=0){resultado=resultado-Double.parseDouble( eNum.getText().toString());
                    eNum.setText(String.valueOf(resultado ));
                }
                if(cont==0){ resultado=Double.parseDouble( eNum.getText().toString());
                    eNum.setText("");}cont++;

                break;

            case R.id.bPor: opPor=Double.parseDouble( eNum.getText().toString());
                if(cont!=0){resultado=resultado*Double.parseDouble( eNum.getText().toString());
                    eNum.setText(String.valueOf(resultado ));
                }
                if(cont==0){resultado=Double.parseDouble( eNum.getText().toString());
                    eNum.setText("");} cont++;
                break;

            case R.id.bDivision:opDivision=Double.parseDouble( eNum.getText().toString());
                if(cont!=0){resultado=resultado/Double.parseDouble( eNum.getText().toString());
                    eNum.setText(String.valueOf(resultado ));
                }
                if(cont==0){resultado=Double.parseDouble( eNum.getText().toString());
                    eNum.setText("");} cont++;
                break;

            case R.id.bPunto: eNum.setText(eNum.getText()+".");
                break;
            case R.id.bBorrar: eNum.setText("");
                cont=0;
                break;
            case R.id.bIgual:
                cont=0;
                if(opMas!=0) {
                    eNum.setText(String.valueOf(resultado + Double.parseDouble(eNum.getText().toString())));
                    resultado=Double.parseDouble( eNum.getText().toString());
                    opMas=0;
                }
                if(opMenos!=0){
                    eNum.setText(String.valueOf(resultado - Double.parseDouble(eNum.getText().toString())));
                    resultado=Double.parseDouble( eNum.getText().toString());

                    opMenos=0;
                }
                if(opDivision!=0) {
                    eNum.setText(String.valueOf(resultado / Double.parseDouble(eNum.getText().toString())));
                    resultado=Double.parseDouble( eNum.getText().toString());
                    opDivision=0;
                }
                if(opPor!=0) {eNum.setText(String.valueOf(resultado * Double.parseDouble(eNum.getText().toString())));
                    resultado=Double.parseDouble( eNum.getText().toString());
                    opPor=0;
                }
                break;

        }

    }

}
