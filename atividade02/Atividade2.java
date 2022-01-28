package br.com.atividade02;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		

		System.out.print("Digite um valo:");
		int num1 = entrada.nextInt();
		
		System.out.print("digite outro valor:");
		int num2 = entrada.nextInt();
		
		System.out.print("digite outro valor:");
		int num3 = entrada.nextInt();
		
		if (num1 > num2 )
		{
			 if (num2 > num3)
			 {
				 System.out.print(num1 + "|1" + num2 + "|" + num3 );
			 } else if (num1 < num3) 
			 {
				 System.out.print("Resultado:" +num1 + "|" + num3 + "|" + num2 );
			 }
			   else 
			  {
				 System.out.print("Resultado:" +num3 + "|" + num1 + "|" + num2 );
			  }
				 
		} 
		
		else if (num2 > num3)
		{
			if (num1 < num3)
			{
				System.out.print("Resultado:"+ num2 + "|" + num1 + "|" + num3);
			} else 
			{
				System.out.print("Resultado:" +num2 + "|" + num3 + "|" + num1);
			}
			
		
		}
		 else
		 {
			System.out.print("Resultado:" +num3 + "|" + num2 + "|" + num1);	
		 }
		
		
		
	}

}
