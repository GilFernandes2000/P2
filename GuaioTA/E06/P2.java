import static java.lang.System.*;

public class P2
{
  public static void main(String[] args)
  {
	  for(int i = 0; i< args.length; i++){
		  out.printf("%s contains %d pairs of consecutive equal characters\n", args[i], countPairs(args[i], 0));
	  }
  }
  public static int countPairs(String s, int i){
		int count = 0;
		if(i > s.length()-2){
			return count;
		}
		
		else{
			char c = s.charAt(i);
			char n = s.charAt(i++);
			if(c == n){
				count++;
			}
			return countPairs(s, i+1);
		}
	}
}

