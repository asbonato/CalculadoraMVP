package br.usjt.deswebmob.calculadoramvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.usjt.deswebmob.calculadoramvp.model.Calculadora;

public class MainActivity extends Activity {
    EditText valor1, valor2, operador, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText)findViewById(R.id.valor1);
        valor2 = (EditText)findViewById(R.id.valor2);
        operador = (EditText)findViewById(R.id.operador);
        resultado = (EditText)findViewById(R.id.resultado);
    }

    public void calcular(View view){
        resultado.setText(Calculadora.calculo(valor1.getText().toString(),
                valor2.getText().toString(), operador.getText().toString()).toString());
    }
}
