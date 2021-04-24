import java.io.*;
import java.util.*;


public class WordCounter {
	
	public static void main(String[] args) throws IOException{
		
		//Input e output
		String inputFileName = "JackJill.txt";
		String outputFileName = "output.txt";
		
		//Scanner e PrintWrtiter
		File fin = new File(inputFileName);
		Scanner ler = new Scanner(fin);
		File fout = new File(outputFileName);
		PrintWriter pw = new PrintWriter(fout);
		
		// ler e escrever no ficheiro
		
      do{
			int count;
			String frase = ler.nextLine();
			String[] palavras = frase.split("\\s+");
			
			if(frase.isEmpty() || frase.trim().equals("") || frase.trim().equals("\n")){
				count = 0;
			}
			else{
				count = palavras.length;
			}
			
			pw.printf("%d %s\n",count, frase );
		}while(ler.hasNextLine());

      // Close all files

		ler.close();
		pw.close();
	}
}
