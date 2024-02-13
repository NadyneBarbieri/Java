package cursoUdemy;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// formatacões
		double x = 10.35784;
		String nome = "Nadyne";
		int idade = 25;
		double renda = 4000.0;
		// exercicio 
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//com ln no final quebra uma linha
		System.out.println(x);
		//com f no final formata e os "%.2f%n" diz com quantas casas depois da virgula
		System.out.printf("%.2f%n",x);
		//com f no final formata "%.4f%n" nesse caso com 4 casas
		System.out.printf("%.4f%n",x);
		
		//formato do computador com ponto ou virgula dependendo do pais.
//		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		//concatenação em java
		System.out.printf("Resultado = "+ x + "Metros");
		//Concatenaçao com formatacao de duas casas depois da virgula e quabra de linha 
		System.out.printf("Resultado = %.2f metros%n", x );
		// totod os casos acima juntos em uma linha 
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
		// exercicio
		System.out.println("Produtos:");
		System.out.printf("%s which price is $ %.2f %n", product1, price1);
		System.out.printf("%s which price is $ %.2f %n", product2, price2);
		System.out.printf("Record: %s years old, code %d and gender: %c %n", age, code, gender);
		System.out.printf("Measure with eight decimal place:",measure);
		System.out.printf("Rouded (three decimal places): %.3f %n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rouded (three decimal places): %.3f %n ",measure);
		
		

	} 

}
