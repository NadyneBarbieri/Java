package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiies.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File souceFile = new File(sourceFileStr);
		String souceFolderStr = souceFile.getParent();
		
		boolean success = new File(souceFolderStr + "\\out").mkdir();
		
		String targetFileStr= souceFolderStr + "\\out\\sumer.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			
			while(itemCsv != null) {
				System.out.println(itemCsv);
				itemCsv = br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
