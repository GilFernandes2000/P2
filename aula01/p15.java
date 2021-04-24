import java.util.*;

public class p15 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		double num, soma = 0, media = 0;
		int count = 0;
		System.out.println(" Medias de numeros random ");
		do{
			System.out.print("-> ");
			num = sc.nextInt();
			if(num != 0){
				soma += num;
				count ++;
			}
		}while(num != 0);
		media = soma/count;
		System.out.printf("Soma -> %2.2f\n", soma);
		System.out.printf("Media -> %2.2f\n", media);
	}
}
			
