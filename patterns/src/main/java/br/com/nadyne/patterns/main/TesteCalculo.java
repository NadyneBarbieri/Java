package br.com.nadyne.patterns.main;

import br.com.nadyne.patterns.controller.ImpostoController;
import br.com.nadyne.patterns.model.Pis;
import br.com.nadyne.patterns.view.CalculaPis;
// Aqui é onde roda o sistema é como se fosse o index do Front-and.
//Aqui é uma classe publica, ta bem obvio isso significa que pode ser acessada por todo o sistema.
public class TesteCalculo {
    //Perceba que nessa classe estamos chamando a função pis e armazena os dados no Pis model o mesmo
    // raciocinio  cerve para o calculo.
    public static void main(String[] args){
        Pis model = new Pis();
        CalculaPis tela = new CalculaPis();
        // Essa função vem da biblioteca java que foi importada
        // lá em cima nos imports ela cerve para observar se ouve mudança na variavel tela;
        model.addObserver(tela);
       // Imposto controlle trocou de nome para controle  e esta recebendo as informações do model e tela.
        ImpostoController controller = new ImpostoController(model ,tela);
        //tela esta recebendo as informaçoes do controller da linha de cima.
        tela.addController(controller);
    }
}
//Agora vai para a pasta model para entender melhor.