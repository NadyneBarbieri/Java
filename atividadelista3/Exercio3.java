package br.com.atividadelista2;

import java.util.Scanner;

public class Exercio3 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int somaMatriz = 0, soma = 0;

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Posi��o [" + l + "][" + c + "]:");
				matriz[l][c] = leia.nextInt();
				somaMatriz += matriz[l][c];
				
			} System.out.println();
		}
		System.out.println("A soma dos valores na matriz �: " + somaMatriz);
			for(int l=0; l<3; l++) {
				for(int c=0; c<3; c++) {
					if(l==c) {
						soma = soma + matriz[l][c];
				}
					
			}
		}
			System.out.println("A soma principal desta Matriz � de: " + soma);
	}



	
	

}