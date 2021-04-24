import static java.lang.System.*;

public class P3 {

  public static void main(String[] args) {
	  if(args.length%2 != 0){
		  out.print("o numero de argumentos tem de ser par");
		  exit(1);
	  }
	  for(int i = 0; i < args.length; i+=2){
		  out.printf(" 's' is prefixed by '%s' -> %b\n",args[i], args[i++], isPrefix(args[i], args[i++], 0, args[i++].length()));
	  }
  }
  public static boolean isPrefix(String a, String b, int h, int lb){
	  if(a == ""){
		  if(b == ""){
			  return true;
		  }
		  else{
			  return false;
		  }
	  }
	  else{
		  if(h == a.length()+ lb){
			  if(a.substring(h, h + lb -1)== b){
				  return true;
			  }
			  return false;
		  }
		  else{
			 if(a.substring(h, h + lb -1)== b){
				  return true;
			  }
			  return isPrefix(a, b, h+1, lb);
		  }
	  }
  } 
		  
}
