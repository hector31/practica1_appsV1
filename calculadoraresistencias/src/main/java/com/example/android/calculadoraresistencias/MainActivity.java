package com.example.android.calculadoraresistencias;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.android.calculadoraresistencias.R.id.B1;
import static com.example.android.calculadoraresistencias.R.id.b1n2;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    TextView valor;
    private TextView texto;
    Button[] b1 = new Button[9];
    Button[] b2 = new Button[9];
    Button[] b3 = new Button[9];
    Button[] b4 = new Button[9];
    Button[] b5 = new Button[9];
    Button[] b6 = new Button[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.b2n1).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int color = 0,color2=0;
        View contenedor = view.getRootView();

        switch (view.getId()) {
            case R.id.b2n1:
                color = Color.parseColor("#80CBC4");
                break;
            case R.id.check1:
                color2 =Color.parseColor("#ff7f50");
        }
        contenedor.setBackgroundColor(color);
        findViewById(R.id.B1).setBackgroundColor(color);
        findViewById(R.id.b5n1).setBackgroundColor(color2);
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

