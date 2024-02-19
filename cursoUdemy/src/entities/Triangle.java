package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	//funsao para calcular a area do triangulo
	public double area() {
		double p = (a + b + c) / 2.0;
		//sqrt raiz quadrada
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}