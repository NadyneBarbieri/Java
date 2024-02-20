package cotacaoDollarUtil;

public class CurrencyConverter {

	public static final double DOLLAR = 3.10;
	public static final double IOF = 6.0;
	
	public static double conversor(double valor){
		 return DOLLAR * valor * (1 + IOF / 100); // Ajustando o cálculo do IOF
	}
	
	
	
}
