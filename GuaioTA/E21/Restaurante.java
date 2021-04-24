import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import pt.ua.p2utils.*;

public class Restaurante {
	
  private static HashTable<Integer> stock = new HashTable<>(100);
  private static Queue<HashTable<Integer>> queue = new Queue<HashTable<Integer>>();
  public static void main(String[] args) {
    //...

  }

  public static void processOrders(String file) throws IOException{
	  Scanner ler = new Scanner(new File(file));
	  while(ler.hasNextLine()){
		  String[] line = ler.nextLine().split(" ");
		  if(line[0].equals("entrada:")){
			  if(!stock.contains(line[1])) {
				 stock.set(line[1], 1);
			}
			else{
				stock.set(line[1], stock.get(line[1]) + 1);
			}
		}
		else if(line[0].equals("saida:")){
			HashTable<Integer> stockIn = new HashTable<>(1000);
			for (int i = 1; i < line.length; i++)
			{
				String[] pedido = line[i].spli(":");
				stockIn.set(pedido[0], Integer.parseInt(pedido[1]));
			}
			queue.in(stockIn);
		}
	}
	ler.close();
	HashTable<Integer> nextOrder = queue.peek();
	while(canBeServed(nextOrder)){
		if(!queue.isEmpty()){
			serveOrder(nextOrder);
			out.printf("Refeiçao servida: %s\n", orderToString(nextOrder));
		}
		nextOrder = queue.peek();
	}
 }	
}

