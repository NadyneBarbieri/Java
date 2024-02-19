package cursoUdemy;

import java.util.Scanner;
public class Tutorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
			case 1:
				dia = "curte";
				break;
			case 2:
				dia = "Comenta";
				break;
			case 3:
				dia = "Compartilha";
				break;
		}
		System.out.println("Dia da semana " + dia);
		sc.close();
	}
}
