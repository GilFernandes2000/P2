import static java.lang.System.*;

public class Factors {

  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++)
      out.println(args[i]+" = "+factors(Integer.parseInt(args[i])));
  }
  
  public static String factors(int num){
	  String fact = "";
	  if(num == 0) return "0";
	  if(num == 1){
		  return "1";
	  }
	  
	  else{
		  for(int i = 2; i < num; i++){
			  if(num%i == 0){
				  if((num/i) == 1){
					  fact = fact + i;
					  return fact;
				  }
				  else{
					  fact = fact + i + "*";
					  
				  }
			  }
			  return factors(num/i);
		  }
	  }
	  
  }
}

