import java.lang.*;

public class Loan{
	
	public static void main(String[] args){
		
		if(args.length != 4){
			System.out.println("São precisos 4 argumentos");
			System.exit(1);
		}
		int Meses = Integer.parseInt(args[0]);
		int M = Integer.parseInt(args[1]);
		int T = Integer.parseInt(args[2]);
		int P = Integer.parseInt(args[3]);
		System.out.printf("Ao fim de %d meses a divida é de %d\n", Meses, dividaI(M, P, Meses, T));
		System.out.printf("Ao fim de %d meses a divida é de %d\n", Meses, dividaR(M, P, Meses, T));
	}
	public static int dividaI(int divi, int p, int n,int j){
		assert divi >= 0;
		assert n >= 0;
		for (int i = 0; i < n; i++){
			divi = (divi*j) - p;
		}
		assert divi >= 0;
		return divi;
	}
	public static int dividaR(int divi, int p, int n, int j){
		if(n == 0){
			return divi;
		}
		else{
			return dividaR((divi*j)-20 , p, n-1, j);
		}
	}
}
