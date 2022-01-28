package br.com.atividade02;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite um valo:");
		int num1 = entrada.nextInt();
		
		System.out.println("digite outro valor:");
		int num2 = entrada.nextInt();
		
		System.out.println("digite outro valor:");
		int num3 = entrada.nextInt(); 
		
		
		
		
			if (num1 > num2 && num1 > num3 )
			{
				System.out.println("O maior valor é:" + num1);
		
			}
			if (num2 > num1 && num2 > num3 )
			{
				System.out.println("O maior valor é:" + num2);
		
			}
			if (num3 > num2 && num3 > num1 )
			{
				System.out.println("O maior valor é:" + num3);
		
		}

	
	}

}
