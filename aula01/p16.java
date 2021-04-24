import java.util.*;


public class p16{
	static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args){
		 Random rd  =  new Random();
		 int random = rd.nextInt(101);
		 int escolha, tentativas = 0;
		 System.out.println("Adivinha o numero");
		 do{
			 System.out.print("-> ");
			 escolha = sc.nextInt();
			 if(escolha > random){
				 System.out.println("mais baixo");
			 }
			 if(escolha < random){
				 System.out.println("mais alto");
			 }
			 tentativas++;
		 }while(escolha != random);
		 System.out.printf("Acertou no numero (%d) em %d tentativas\n", random, tentativas);
	 }
 }
