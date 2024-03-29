package br.com.nadyne.patterns.controller;

import br.com.nadyne.patterns.model.Imposto;
import br.com.nadyne.patterns.view.TelaDeImposto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ImpostoController implementa ActionListener para capturar
// o evento do botão da View.
//Calma vou traduzir
//Vamos do inicio Volta na pasta main.
public class ImpostoController implements ActionListener {

    // O Controller possui referências a Imposto e a Tela
    // É reutilizável para Telas que calculem Impostos
    // Ou seja, classes que implementem estas interfaces
    private Imposto model;
    private TelaDeImposto view;

    // O construtor recebe as referências das demais camadas
    public ImpostoController(Imposto model, TelaDeImposto view) {
        System.out.println("Construtor do Controller chamado");
        this.model = model;
        this.view = view;
    }

    // Método invocado quando o botão da View é invocado
    public void actionPerformed(ActionEvent e) {
        model.calcularImposto(view.getValor());
    }
}