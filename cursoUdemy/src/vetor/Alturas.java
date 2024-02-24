package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double[] vect = new double [x];
		for(int n=0; n < x; n++) {
			vect[n]= sc.nextDouble();
		}
		System.out.println(vect);
		sc.close();
	}

}
