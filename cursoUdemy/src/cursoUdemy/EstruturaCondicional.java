package cursoUdemy;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int minutos = sc.nextInt();
//		double conta = 50.0;
//		// operador de atribuicao acumulativa
//		if(minutos  > 100) {
//			//conta esta recebendo conta
//			conta += (minutos -100)*2;
//		}
//		System.out.printf("Valor da conta = %.2f%n ",conta);

		int x = sc.nextInt();
		String dia;
		
		switch(x){
		case 1: 
			dia = "domingo";
			break;
		case 2: 
			dia = "segunda";
			break;
		case 3: 
			dia = "terca";
			break;
		case 4: 
			dia = "quarta";
			break;
		case 5: 
			dia = "quinta";
			break;
		case 6: 
			dia = "sexta";
			break;
		case 7: 
			dia = "sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
	}
		System.out.println("Dia da semana " + dia);

		// expressao condicional ternaria

//		double preco = sc.nextDouble();
//		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
//		System.out.println(desconto);

		// estutura while
//		int senha = sc.nextInt();
//
//		while (senha != 2002) {
//			System.out.println("Senha Invalida");
//			senha = sc.nextInt();
//		}
//
//		System.out.println("Acesso Permitido");

		// estrutura for
//		int x = sc.nextInt();
//
//		for (int i = 1; i <= x; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		char resp;
	do {
		System.out.println("Digite a temperatura em celsius: ");
		double C = sc.nextDouble();
		double F = sc.nextDouble();
		System.out.printf("Equilavente em Fahrenheit: %.1f%n", F);
		System.out.println("Deseja repetir (s/n)");
		resp = sc.next().charAt(0);
		
	}while(resp != 'n');
		
		sc.close();

	}

}
