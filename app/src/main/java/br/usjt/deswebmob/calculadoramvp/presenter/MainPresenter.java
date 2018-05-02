package br.usjt.deswebmob.calculadoramvp.presenter;


import br.usjt.deswebmob.calculadoramvp.view.MainActivity;
import br.usjt.deswebmob.calculadoramvp.model.Calculadora;
import br.usjt.deswebmob.calculadoramvp.view.MainView;

public class MainPresenter implements Presenter {
    private Calculadora model;
    MainView view;

    public MainPresenter(MainView view){
        this.view = view;
        model = new Calculadora();//para funcionar nos testes;
    }

    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void calculo(String valor1, String valor2, String operador){
        model.setValor1(valor1);
        model.setValor2(valor2);
        model.setOperador(operador);
        model.calculo();
        this.configurarView();
    }

    public void configurarView(){
        view.configurarView(model.getValor1(), model.getValor2(),
                model.getOperador(), model.getResultado());
    }
}
