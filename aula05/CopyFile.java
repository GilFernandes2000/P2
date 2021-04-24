import java.util.*;
import java.lang.*;
import java.io.*;


public class CopyFile{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		File fin = new File(args[0]);
		assert fin.isFile() && fin.canRead() && fin.exists();
		Scanner ler = new Scanner(fin);
		
		File fout = new File(args[1]);
		if(fout.exists()){
			assert fout.canWrite();
			System.out.print("Quer reescrever o seu conteúdo? -> ");
			String op = sc.nextLine();
		}
		 
		PrintWriter pw = new PrintWriter(fout);
		
		while(ler.hasNextLine()){
			pw.println(ler.nextLine());
		}
		ler.close();
		pw.close();
	}
}
