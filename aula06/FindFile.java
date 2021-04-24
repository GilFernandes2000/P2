import java.io.*;
import java.lang.*;

public class FindFile{
	public static void main(String[] args){
		
		String path;
		if(args.length == 0 || args.length > 2)
		{
			System.out.println("Tem de ter dois argumentos");
			System.exit(1);
		}
		if(args.length == 1)
		{
			path = ".";
		}
		else
		{
			path = args[1];
		}
		File dir = new File(path);
		showPathFile(dir, args[0]);
	}
		
	public static void showPathFile(File f, String pattern){
		
		if (f.isFile() && f.getName().indexOf(pattern) != -1)
		{
			System.out.println(f.getPath());
		}
		if (f.isDirectory())
		{
			File[] dir = f.listFiles();
			for(File fin : dir)
			{
				showPathFile(fin, pattern);
			}
		}
	}
}
