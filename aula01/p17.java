import java.util.*;
import java.io.*;

public class p17{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException{
		String copiar, colar;
		System.out.println("Copiar ficheiros");
		System.out.print("Ficheiro a copiar -> ");
		copiar = sc.nextLine();
		System.out.print("Ficheiro a passar -> ");
		colar = sc.nextLine();
		
		File fin = new File(copiar);
		File fout = new File(colar);
		PrintWriter pw = new PrintWriter(colar);
		Scanner fich = new Scanner(fin);
            while(fich.hasNextLine()) {
                pw.println(fich.nextLine());
            }
		fich.close();
		pw.close();
	}
}
		
