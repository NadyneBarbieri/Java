package br.com.nadyne.patterns.model;
//Sabe aquela funcão que chamamos no main é essa aqui.
//Éla é uma interface por que interface Sao os batisdores esta calculando por "de baixo dos panos" saca ;).
public interface Imposto {
// Floate é um tipo de tipagem para dizer que o computador vai receber numeros e não letras. E digo mais não
// é um numero inteiro é um numero que tem casas depois da virgula.
    void calcularImposto(float valor);
}
// agora ve lá o Pis meu bem.