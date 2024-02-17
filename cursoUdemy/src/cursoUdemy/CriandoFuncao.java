package cursoUdemy;

import java.util.Scanner;

public class CriandoFuncao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three nunbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	// funsão publica static siginifica que pode ser chamada independende de ser
	// criar um objeto dentro dela e int vai retornar um inteiro 
	
	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}

	// void significa que nao retorna nada so exibe o resultado nao tem nada que
	// possa ser reaproveitado como uma variavel
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}



