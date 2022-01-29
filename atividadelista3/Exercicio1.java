package br.com.atividadelista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double[] x = new double[5];
		double maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite as 5 pontuaçãoes obtidas:");
		
		for(int i = 0; i < x.length; i++) {
			
			x[i] = entrada.nextDouble();
			
			System.out.println((i+1) + "° pontuação: " + x[i]);
			
			if(x[i] > maior) {
				
				maior = x[i];
				
			}
		}
		
		for(int i = 0; i < x.length; i++) {
			
			
		}
		
		System.out.println("A maior pontuçãoo foi: " + maior);
		
		entrada.close();

	}

}
