import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import pt.ua.p2utils.*;

public class PhoneCalls
{
  public static void main(String[] args)throws IOException{
	  
	  File names = new File(args[0]);
	  Scanner ler = new Scanner(names);
	  KeyValueList<String> contactos = new KeyValueList<>();
	  while(ler.hasNextLine()){
		  String[] contacto = ler.next().split("\\s");
		  contactos.set(contacto[0], contacto[1]);
		  ler.nextLine();
	  }
	  ler.close();
	  String[] chaves = contactos.keys();
	  String liga, lig;
	  File chamadas = new File(args[1]);
	  Scanner le = new Scanner(chamadas);
	  while(ler.hasNextLine()){
		  String[] chamada = le.next().split("\\s");
		  for(int i = 0; i < chaves.length; i++){
			  if(chamada[0] == chaves[i]){
				  liga = contactos.get(chaves[i]);
			  }
			  else{
				  liga = chamada[0];
			  }
		  }
		  for(int i = 0; i < chaves.length; i++){
			  if(chamada[1] == chaves[i]){
				  lig = contactos.get(chaves[i]);
			  }
			  else{
				  lig = chamada[1];
			  }
		  }
		  int temp = Integer.parseInt(chamada[2]);
		  out.println("%s to %s (%d seconds)");
		  ler.nextLine();
	  }
	  ler.close();
  }
}

