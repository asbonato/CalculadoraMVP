package br.usjt.deswebmob.calculadoramvp.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.usjt.deswebmob.calculadoramvp.view.MainView;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestMainPresenter {
    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setup() {
        presenter = new MainPresenter(view);
    }

    @Test
    public void testeCalculo(){
        presenter.calculo("1","2","+");
        when(view.getResultado()).thenReturn("3");
        assertEquals("3",view.getResultado());

        presenter.calculo("1","2","*");
        when(view.getResultado()).thenReturn("2");
        assertEquals("2",view.getResultado());
    }
}
