import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import pt.ua.p2utils.*;

public class CityTraveler
{
  public static void main(String[] args)throws IOException{
	  
	  HashTable<String> travel = new HashTable<>(20);
	  File Aveiro = new File("Aveiro");
	  Scanner lerAv = new Scanner(Aveiro);
	  while(lerAv.hasNextLine()){
		  travel.set(lerAv.next(),"Aveiro ");
		  lerAv.nextLine();
	  }
	  lerAv.close();
	  
	  File Porto = new File("Porto");
	  Scanner lerPo = new Scanner(Porto);
	  while(lerPo.hasNextLine()){
		  travel.set(lerPo.next(), travel.get(lerPo.next()) + "Porto ");
		  lerPo.nextLine();
	  }
	  lerPo.close();
	  
	  File Lisboa = new File("Lisboa");
	  Scanner lerL = new Scanner(Lisboa);
	  while(lerL.hasNextLine()){
		  travel.set(lerL.next(),travel.get(lerPo.next()) + "Lisboa");
		  lerL.nextLine();
	  }
	  lerL.close();
	  
	  String[] chaves = travel.keys();
	  for (int i = 0; i < chaves.length; i++)
	  {
		  out.printf("%s : %s\n", chaves[i], travel.get(chaves[i]));
	  }
  }
}

