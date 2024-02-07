package br.com.nadyne.patterns.model;

import java.util.Observable;
// O Model é um Observable
// A Classe Pis da camada Model não possui referência a View ou ao // Controller
// Ao implementar Imposto, teremos maior flexibilidade no Controller
//Calma que vou traduzir.
// Essa classe Pis está estendendo um metodo (que na realidade está desatualizado.) que Observa se existe
// mudanças no arquivo Imposto que vc viu no arquivo acima desse que armazena o valor do imposto.
public class Pis extends Observable implements Imposto {
//Aqui está setando o valor para fazer o calculo em baixo
    final float ALIQUOTA = 0.65f;
    float valorDoPis = 0;
// aqui etá criando uma funcão que imprime uma mensagem para o usuario saber que está funcionando o sistema.
    public Pis() {
        System.out.println("Construtor do Model chamado");
    }
    // aqui esta pegando o valor usando o get que é uma funcão do java chamada construtor.
    public float getALIQUOTA() {
        return ALIQUOTA;
    }
    // o mesmo aqui se ver get já sabe e o retorn ta bem obvio se nao for obvio pra vc saia dessa area e va estudar logica primeiro.
    public float getValorDoPis() {
        return valorDoPis;
    }
    // aqui entra a formula para calcular os valores que estão nas variaveis.
    public void calcularImposto(float valor) {
        valorDoPis = valor * ALIQUOTA;
        setChanged();
        notifyObservers(valorDoPis);
    }
// aqui ta obvio ta retornando todo o calculo la de cima.
    @Override
    public String toString() {
        return "Pis [ALIQUOTA=" + ALIQUOTA
                + ", valorDoPis=" + valorDoPis + "]";
    }
    //Agora vai la na View.
}