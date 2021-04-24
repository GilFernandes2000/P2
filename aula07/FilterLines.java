import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
// import java.util.*;   // => "error: reference to LinkedList is ambiguous"
// java.util.LinkedList colide com p2utils.LinkedList!
import p2utils.*;

public class FilterLines
{
  public static void main(String[] args) throws IOException
  {
    if (args.length != 1) {
      err.printf("Usage: java -ea FilterLines text-file\n");
      exit(1);
    }
    File fil = new File(args[0]);

    // Criar listas para as linhas curtas, médias e longas.
    LinkedList<String> small = new LinkedList<String>();
    LinkedList<String> med = new LinkedList<String>();
    LinkedList<String> big = new LinkedList<String>();

    Scanner sf = new Scanner(fil);
    // exceções poderiam ser intercetadas e mostrar mensagem de erro.
    while (sf.hasNextLine()) {
      String line = sf.nextLine();
      // Guardar linha na lista apropriada, consoante o tamanho.
      if(line.length() < 20){
		  small.addLast(line);
	  }
	  if(line.length() > 40){
		  big.addLast(line);
	  }
	  else{
		  med.addLast(line);
	  }

    }
    sf.close();

    // Escrever conteúdo das listas...
    out.println("Curtas---|---------|---------|---------|---------");
    assert !small.isEmpty();
    while(!small.isEmpty()){
		System.out.println(small.first());
		small.removeFirst();
	}
	assert small.isEmpty();
	
	assert !med.isEmpty();
    out.println("Médias---|---------|---------|---------|---------");
    while(!med.isEmpty()){
		System.out.println(med.first());
		med.removeFirst();
	}
	assert med.isEmpty();
	
	assert !big.isEmpty();
    out.println("Longas---|---------|---------|---------|---------");
    while(!big.isEmpty()){
		System.out.println(big.first());
		big.removeFirst();
	}
	assert big.isEmpty();
  }

}
