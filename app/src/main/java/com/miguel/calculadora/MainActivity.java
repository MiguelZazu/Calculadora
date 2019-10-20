package com.miguel.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textoarriba,textoabajo;
    Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0,botonigual,botonborrar,botonmultiplicar,botondividir,botonsumar,botonrestar,botonseno,botoncoseno,botontangente,botonderecha;
    private boolean operando=false;
    private int tipoOperacion, op1, op2, resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        if(getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            accionesPortrait();
        }
        if(getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            accionesLand();
        }

    }

    private void accionesPortrait() {
        botonderecha.setOnClickListener(this);
    }

    private void acciones() {
        boton0.setOnClickListener(this);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        botonigual.setOnClickListener(this);
        botonborrar.setOnClickListener(this);
        botonmultiplicar.setOnClickListener(this);
        botondividir.setOnClickListener(this);
        botonsumar.setOnClickListener(this);
        botonrestar.setOnClickListener(this);
    }

    private void accionesLand()
    {
        botonseno.setOnClickListener(this);
        botoncoseno.setOnClickListener(this);
        botontangente.setOnClickListener(this);
    }

    private void instancias() {
        textoarriba = this.findViewById(R.id.textoarriba);
        textoabajo = this.findViewById(R.id.textoabajo);
        boton0 = this.findViewById(R.id.boton0);
        boton1 = this.findViewById(R.id.boton1);
        boton2 = this.findViewById(R.id.boton2);
        boton3 = this.findViewById(R.id.boton3);
        boton4 = this.findViewById(R.id.boton4);
        boton5 = this.findViewById(R.id.boton5);
        boton6 = this.findViewById(R.id.boton6);
        boton7 = this.findViewById(R.id.boton7);
        boton8 = this.findViewById(R.id.boton8);
        boton9 = this.findViewById(R.id.boton9);
        botonigual = this.findViewById(R.id.botonigual);
        botonborrar = this.findViewById(R.id.botonborrar);
        botonmultiplicar = this.findViewById(R.id.botonmultiplicar);
        botondividir = this.findViewById(R.id.botondividir);
        botonsumar = this.findViewById(R.id.botonsumar);
        botonrestar = this.findViewById(R.id.botonrestar);
        botonderecha = this.findViewById(R.id.botonderecha);
        botonseno = this.findViewById(R.id.botonseno);
        botoncoseno = this.findViewById(R.id.botoncoseno);
        botontangente = this.findViewById(R.id.botontangente);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

        case R.id.boton0:
            if (!operando) {
                textoabajo.setText(textoabajo.getText() + "0");
            }
            else
                textoabajo.setText("0");
            break;
            case R.id.boton1:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "1");
                }
                else
                    textoabajo.setText("1");
                break;
            case R.id.boton2:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "2");
                }
                else
                    textoabajo.setText("2");
                break;
            case R.id.boton3:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "3");
                }
                else
                    textoabajo.setText("3");
                break;
            case R.id.boton4:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "4");
                }
                else
                    textoabajo.setText("4");
                break;
            case R.id.boton5:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "5");
                }
                else
                    textoabajo.setText("5");
                break;
            case R.id.boton6:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "6");
                }
                else
                    textoabajo.setText("6");
                break;
            case R.id.boton7:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "7");
                }
                else
                    textoabajo.setText("7");
                break;
            case R.id.boton8:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "8");
                }
                else
                    textoabajo.setText("8");
                break;
            case R.id.boton9:
                if (!operando) {
                    textoabajo.setText(textoabajo.getText() + "9");
                }
                else
                    textoabajo.setText("9");
                break;
            case R.id.botonborrar:
                textoabajo.setText("");
                textoarriba.setText("");
                break;
            case R.id.botonsumar:
                if (!operando)
                {
                    textoarriba.setText(textoabajo.getText().toString());
                    textoabajo.setText("");
                    tipoOperacion = 1;
                    operando = true;
                }
                break;
            case R.id.botonrestar:
                if (!operando)
                {
                    textoarriba.setText(textoabajo.getText().toString());
                    textoabajo.setText("");
                    tipoOperacion = 2;
                    operando = true;
                }
                break;
            case R.id.botonmultiplicar:
                if (!operando)
                {
                    textoarriba.setText(textoabajo.getText().toString());
                    textoabajo.setText("");
                    tipoOperacion = 3;
                    operando = true;
                }
                break;
            case R.id.botondividir:
                if (!operando)
                {
                    textoarriba.setText(textoabajo.getText().toString());
                    textoabajo.setText("");
                    tipoOperacion = 4;
                    operando = true;
                }
                break;
            case R.id.botonseno:
                textoarriba.setText(String.valueOf(Math.sin(Double.parseDouble(textoabajo.getText().toString()))));

                break;
            case R.id.botoncoseno:
                textoarriba.setText(String.valueOf(Math.cos(Double.parseDouble(textoabajo.getText().toString()))));
                break;
            case R.id.botontangente:
                textoarriba.setText(String.valueOf(Math.tan(Double.parseDouble(textoabajo.getText().toString()))));
                break;
            case R.id.botonigual:
                op1 = Integer.valueOf(textoarriba.getText().toString());
                op2 = Integer.valueOf(textoabajo.getText().toString());

                switch (tipoOperacion)
                {
                    case 1:
                        resultado = op1 + op2;

                        break;
                    case 2:
                        resultado = op1 - op2;
                        break;
                    case 3:
                        resultado = op1 * op2;
                        break;
                    case 4:
                        resultado = op1 / op2;
                        break;

                }
                textoarriba.setText(Integer.toString(resultado));
                textoabajo.setText("");
                break;

        }
    }
}
