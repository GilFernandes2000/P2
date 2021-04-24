import java.io.*;
import java.lang.System.*;

public class ListRec{
	
	public static void main(String[] args){
		
		if (args.length !=1)
		{
			System.out.println("tem de ter um argumento");
			System.exit(1);
		}
		File dir = new File(args[0]);
		printDirList(dir);
	}
	
	public static void printDirList(File f){
		
		System.out.println(f.getPath());
		if (f.isDirectory())
		{
			File[] dir = f.listFiles();
			for(File fin : dir){
				printDirList(fin);
			}
		}
	}
}
