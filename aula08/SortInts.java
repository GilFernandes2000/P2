import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class SortInts
{
  public static void main(String[] args) throws IOException {
	  if(args.length == 0){
		  out.println("Usage: java -ea SortInts fileName ...");
		  exit(1);
	  }
	  SortedListInt sor = new SortedListInt();
      File fin;
      
      for(String s : args){
		  fin = new File(s);
		  assert fin.isFile();
		  sor = insertNum(sor, new Scanner(fin));
		  assert sor.isSorted();
	  }
	  sor.print();
     
	 }
	public static SortedListInt insertNum(SortedListInt numbers, Scanner read){
		if(!read.hasNext()){
			return numbers;
		}
		try{
			int elem = Integer.parseInt(read.nextLine());
			numbers.insert(elem);
		}
		catch(NumberFormatException e){}
		return insertNum(numbers, read);
  }

}


