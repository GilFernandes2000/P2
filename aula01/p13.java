import static java.lang.System.*;
import java.util.Scanner;

public class p13 {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int n;
    while (true) {
      out.print("N? ");
      n = in.nextInt();
      if (n > 0) break;
      err.println("ERROR: invalid number!");
    }

    String verb = isPrime(n)? "is" : "is not";
    out.printf("Number %d %s prime\n", n, verb);
  }

  public static boolean isPrime(int n) {
    int count = 0;
    for (int i = 1; i <= n ; i++){
		if( n%i == 0){
			count++;
		}
	} 
	if( count == 2){
		return true;
	}
	else{
		return false;
	}

  }
}
