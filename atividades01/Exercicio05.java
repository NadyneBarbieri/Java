package br.com.generation.aula01;

import java.util.Scanner;

//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int not1, not2, not3, soma;
		
		System.out.println("Digite o valor sua primeira nota:");
		not1 = leia.nextInt();
		
		System.out.println("Digite o valor da sua segunda nota:");
		not2 = leia.nextInt(); 
		System.out.println("Digite o valor da sua terceira nota:");
		not3 = leia.nextInt();
		
		soma = 2*not1 + 3*not2 + 5*not3/2+3+5; 
		
		System.out.println("Sua media é de:" + soma);
		
		
	
		
		leia.close(); 


	}

}
