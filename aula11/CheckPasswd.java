import p2utils.*;
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class CheckPasswd {
	
	public static void main(String[] args)throws IOException{
		if(args.length != 1){
			out.println("Password needed");
			exit(1);
		}
		File fin = new File(args[0]);
		Scanner sc = new Scanner(fin);
		KeyValueList<String> login = new KeyValueList<String>();
		while(sc.hasNext()){
			login.set(sc.next(), sc.next());
		}
		Scanner ler = new Scanner(in);
		do{
			out.print("Login:  ");
			String log = ler.nextLine();
			out.print("Password:  ");
			String password = ler.nextLine();
			if(login.contains(log) && login.get(log).equals(password)){
				out.println("Login successful");
			}
			else{
				out.println("Failed to Login");
				out.println();
			}
		}while(true);
	}
}
