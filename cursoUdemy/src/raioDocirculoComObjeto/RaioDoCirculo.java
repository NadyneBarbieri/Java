package raioDocirculoComObjeto;

import java.util.Locale;
import java.util.Scanner;

import raioDoCirculoComObjetoUtil.Calculator;

public class RaioDoCirculo {
	//final é o mesmo que contante e em java as boa praticas é escrever nome de constante com capslock
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = calc.circumferencia(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI);
		
		
		sc.close();
	}
	
}
