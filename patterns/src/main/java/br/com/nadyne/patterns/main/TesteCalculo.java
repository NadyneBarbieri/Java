package br.com.nadyne.patterns.main;

import br.com.nadyne.patterns.controller.ImpostoController;
import br.com.nadyne.patterns.model.Pis;
import br.com.nadyne.patterns.view.CalculaPis;

public class TesteCalculo {

    public static void main(String[] args){
        Pis model = new Pis();
        CalculaPis tela = new CalculaPis();

        model.addObserver(tela);

        ImpostoController controller = new ImpostoController(model ,tela);
        tela.addController(controller);
    }
}
