package br.com.nadyne.patterns.model;

import java.util.Observable;

// O Model é um Observable
// A Classe Pis da camada Model não possui referência a View ou ao // Controller
// Ao implementar Imposto, teremos maior flexibilidade no Controller
public class Pis extends Observable implements Imposto {

    final float ALIQUOTA = 0.65f;
    float valorDoPis = 0;

    public Pis() {
        System.out.println("Construtor do Model chamado");
    }

    public float getALIQUOTA() {
        return ALIQUOTA;
    }

    public float getValorDoPis() {
        return valorDoPis;
    }

    public void calcularImposto(float valor) {
        valorDoPis = valor * ALIQUOTA;
        setChanged();
        notifyObservers(valorDoPis);
    }

    @Override
    public String toString() {
        return "Pis [ALIQUOTA=" + ALIQUOTA
                + ", valorDoPis=" + valorDoPis + "]";
    }
}