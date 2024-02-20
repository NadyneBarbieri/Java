package dadosFuncionario.entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double taxa;
	
	public double Desconto() {
		return salario - taxa;
	}
	public void Aumento(double percentualAumento) {
		salario += salario * percentualAumento / 100.0;
    }
	public String toString() { 
		return nome 
				+ ", $ " 
				+ String.format("%.2f", Desconto());	
	}
}
