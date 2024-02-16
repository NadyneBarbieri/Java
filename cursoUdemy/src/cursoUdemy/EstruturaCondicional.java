package cursoUdemy;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int minutos = sc.nextInt();
//		double conta = 50.0;
//		// operador de atribuicao acumulativa
//		if(minutos  > 100) {
//			//conta esta recebendo conta 
//			conta += (minutos -100)*2;
//		}
//		System.out.printf("Valor da conta = %.2f%n ",conta);
//		
//		int x = sc.nextInt();
//		String dia;
//		
//		switch(x){
//		case 1: 
//			dia = "domingo";
//			break;
//		case 2: 
//			dia = "segunda";
//			break;
//		case 3: 
//			dia = "terca";
//			break;
//		case 4: 
//			dia = "quarta";
//			break;
//		case 5: 
//			dia = "quinta";
//			break;
//		case 6: 
//			dia = "sexta";
//			break;
//		case 7: 
//			dia = "sabado";
//			break;
//		default:
//			dia = "Valor invalido";
//			break;
//	}
//		System.out.println("Dia da semana " + dia);
		
		// expressao condicional ternaria
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		sc.close();
		
	}

}
