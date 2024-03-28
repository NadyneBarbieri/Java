package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * File file = new File("c:\\temp\\in.txt.txt"); Scanner sc = null; try { sc =
		 * new Scanner(file); while(sc.hasNextLine()) {
		 * System.out.println(sc.nextLine()); }
		 * 
		 * }catch(IOException e ) { System.out.println("Error: " + e.getMessage()); }
		 * finally { if(sc != null) { sc.close(); }
		 * 
		 * }
		 */

		// segunda forma de ler arquivos

		/*
		 * String path = "c:\\temp\\in.txt.txt"; FileReader fr = null; BufferedReader br
		 * = null;
		 * 
		 * try { fr = new FileReader(path); br = new BufferedReader(fr);
		 * 
		 * String line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); } }
		 * catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
		 * finally { try { if (br != null) { br.close(); } if (fr != null) { fr.close();
		 * }
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 * 
		 * }
		 */

		// terceira forma de ler arquivos
		/*
		 * String path = "c:\\temp\\in.txt.txt";
		 * 
		 * 
		 * try(BufferedReader br = new BufferedReader(new FileReader(path))) {
		 * 
		 * String line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); } }
		 * catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
		 */
		
		//escrever Arquivos 
		/*String[] lines = new String[] { "Você é inteligente", "Você é linda ", "Você vai conseguir" };
		
		String path = "c:\\temp\\out.txt"; 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		//listando pastas 
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		//listando arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
		for(File file : files ) {
			System.out.println(file);
		}
		//criando pastas 
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretory created successfully: "+ success);
		
		sc.close();
		*/
		//informaçoes do caminho do arquivo
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getPath: " + path.getAbsolutePath());
		
		sc.close();
	}

}
