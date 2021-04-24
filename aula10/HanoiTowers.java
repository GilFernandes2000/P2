import static java.lang.System.*;
import java.util.Scanner;
import p2utils.Stack;

public class HanoiTowers
{
	public static void main(String[] args){
		if(args.length == 0){
			out.println("necessarios varios argumentos");
		}
		Stack<E> st = new Stack<E>();
		for(int i = 0; i < args.length; i++){
			st.push(args[i]);
		}
}
