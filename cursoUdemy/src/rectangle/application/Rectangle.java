package rectangle.application;

import java.util.Locale;
import java.util.Scanner;

import rectangle.entities.ORectangle;

public class Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ORectangle rectangle;
		
		rectangle = new ORectangle();
		rectangle = new ORectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		double area = rectangle.Area();
		double perimeter = rectangle.Perimeter();
		double diagonal = rectangle.Diagonal();
		
		System.out.println("AREA ="+ area);
		System.out.println("PERIMETER ="+ perimeter);
		System.out.println("DIAGONAL ="+ diagonal);
		sc.close();
	
	}
	
}
