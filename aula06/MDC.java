import java.lang.*;

public class MDC{
	public static void main(String [] args){
		if(args.length != 2){
			System.out.println("Comparação é entre dois numeros");
			System.exit(1);
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.printf("O MDC do %s e %s -> %d\n", args[0], args[1], mdc(a, b));
	}
	public static int mdc(int a, int b){
		if(b == 0){
			return a;
		}
		else{
			return mdc(b, a%b);
		}
	}
}
