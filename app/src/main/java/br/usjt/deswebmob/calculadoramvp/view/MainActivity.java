package br.usjt.deswebmob.calculadoramvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.usjt.deswebmob.calculadoramvp.R;
import br.usjt.deswebmob.calculadoramvp.presenter.MainPresenter;

public class MainActivity extends Activity implements MainView {
    EditText valor1, valor2, operador, resultado;
    MainPresenter presenter = new MainPresenter(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText)findViewById(R.id.valor1);
        valor2 = (EditText)findViewById(R.id.valor1);
        operador = (EditText)findViewById(R.id.operador);
        resultado = (EditText)findViewById(R.id.resultado);
        presenter.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        presenter.onRestart();
    }


    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public void calcular(View view){
        presenter.calculo(valor1.getText().toString(), valor2.getText().toString(),
                operador.getText().toString());
    }

    public void configurarView(String v1, String v2, String op, String res){
        valor1.setText(v1);
        valor2.setText(v2);
        operador.setText(op);
        resultado.setText(res);
    }

    @Override
    public String getResultado(){
        return resultado.getText().toString();
    }
}
