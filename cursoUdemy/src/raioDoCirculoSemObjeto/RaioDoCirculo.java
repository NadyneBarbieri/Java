package raioDoCirculoSemObjeto;

import java.util.Locale;
import java.util.Scanner;

public class RaioDoCirculo {
	//final é o mesmo que contante e em java as boa praticas é escrever nome de constante com capslock
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = circumferencia(radius);
		double v = volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
		
		
		sc.close();
	}
	//static é obrigatorio no metodo main
	public static double circumferencia(double radius){
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius){
		return 2.0 * PI * radius* radius* radius/3.0;
	}
}
