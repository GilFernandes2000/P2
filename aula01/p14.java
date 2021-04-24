import java.util.*;
import java.lang.*;

public class p14{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		String frase;
		System.out.println("Dialeto do Alexandre");
		do{
			System.out.print("Frase a traduzir -> ");
			frase = sc.nextLine();
			String frasel = dialeto(frase);
			System.out.printf("Traduzido -> %s\n", frasel);
		}while(frase.length() != 0);
	}
	public static String dialeto (String frase) {
		String frasel = "";
		for(int i  = 0; i < frase.length(); i++){
			char letra = frase.charAt(i);
			if( letra == 'r' ){
				continue;
			}
			if( letra == 'l'){
				letra = 'u';
			}
			frasel += letra;
		}
		return frasel;
	}
}
		

