package p2utils;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class TranslateNumbers{
	public static void main(String[] args)throws IOException{
		if(args.length == 0){
			out.print("More MORE");
			exit(1);
		}
		File fin = new File("numbers.txt");
		Scanner ler = new Scanner(fin);
		KeyValueList<String> trans = new KeyValueList<>();
		while(ler.hasNextLine()){
			String[] check = ler.nextLine().split("\\ s");
			trans.set(check[2], check[0]);
		}
		for (int i = 0; i < args.length; i++)
		{
			out.print(trans.get(args[i]));
		}
		
	}
}
