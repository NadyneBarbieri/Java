package cursoUdemy;

import java.util.Scanner;
public class Tutorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String opcao;
		switch (x) {
		case 1:
			opcao = "Curte";
			break;
		case 2:
			opcao = "Comenta";
			break;
		case 3:
			opcao = "Compartilha";
			break;
		default:
			opcao = "Salva para testar depois.";
			break;
		}
		System.out.println("Opção: " + opcao);
	}
}
