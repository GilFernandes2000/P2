import static java.lang.System.*;
import java.lang.*;

public class Levenshtein
{
  public static void main(String[] args) {
    if (args.length != 2) {
      out.println("Uso: java -ea Levenshtein <palavra1> <palavra2>");
      exit(1);
    }
    int d = distancia(args[0], args[1]);
    out.printf("\"%s\" <-> \"%s\" = %d\n", args[0], args[1], d);
  }
  
  public static int distancia(String P1, String P2){
	  int[] op = new int[P2.length() + 1];
	  for (int i = 0; i < op.length; i++)
	  {
		  op[i] = i;
	  }
	  for (int j = 1; j <= P1.length(); j++)
	  {
		  op[0] = j;
		  int novo = j - 1;
		  for (int i = 1; i <= P2.length(); i++)
		  {
			  int opj = Math.min(1 + Math.min(op[i], op[i - 1]), P1.charAt(j - 1) == P2.charAt(i - 1) ? novo : novo + 1);
			  novo = op[i];
			  op[i] = opj;
		  }
		  
	  }
	  return op[P2.length()];
  }

}
