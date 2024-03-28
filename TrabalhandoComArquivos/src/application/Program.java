package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		/*File file = new File("c:\\temp\\in.txt.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			
		}*/
		
		//segunda forma de ler arquivos
		
	/*	String path = "c:\\temp\\in.txt.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}*/
		
		//terceira forma de ler arquivos
			String path = "c:\\temp\\in.txt.txt";
		

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
	
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		
		
	}

}
