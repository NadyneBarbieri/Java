package cotacaoDollarApp;

import java.util.Locale;
import java.util.Scanner;

import cotacaoDollarUtil.CurrencyConverter;

public class CotacaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de dollar:");
		double valor = sc.nextDouble();

		double valorConvertido = CurrencyConverter.conversor(valor);
		System.out.printf("Valor convertido em reais: %.2f" , valorConvertido);

		sc.close();
	}

}
