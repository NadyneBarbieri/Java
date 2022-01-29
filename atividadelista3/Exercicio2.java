package br.com.atividadelista2;

import java.util.Random;

public class Exercicio2 {



		public static void main(String[] args) {
			Random ref = new Random();

			int[] entDado = new int[10];
			int maiorNum = 0, media = 0, Jogador = 0;

				for (int i = 0; i < 10; i++) {
				entDado[i] = ref.nextInt(5) + 1;
				media = media + entDado[i];
				if (entDado[i] > maiorNum) {
					maiorNum = entDado[i];
				}
				System.out.println();
				System.out.println(i + 1 + "O numero sorteado foi: " + entDado[i]);
			}
			for (int i = 0; i < 10; i++) {
				if (entDado[i] == maiorNum) {
					Jogador++;
				}
			}
				
				System.out.println("A média aritmética de todos os lançamentos foi de: " + media / 10);
					System.out.println("O maior numero foi: " + maiorNum + " e ele foi jogado " + Jogador + " vezes!");
			
		}

	}