package dadosFuncionario.application;

import java.util.Locale;
import java.util.Scanner;

import dadosFuncionario.entities.Funcionario;

public class DadosFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new  Funcionario();
		
		System.out.print("Name: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.print("Desconto: ");
		funcionario.taxa = sc.nextDouble();
		
	
		System.out.println("Employee:" + funcionario);
		
		System.out.print("Aumento:  ");
		double salario = sc.nextDouble();
		funcionario.Aumento(salario);
		System.out.println("Updated data: " + funcionario);
		
	
		sc.close();
	
	}
	

}
