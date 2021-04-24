package p2utils;
import static java.lang.System.*;

public class RPNCalculator{
	
	public static void main(String[] args){
		if(args.length < 3){
			out.print("More thigs dammit");
			exit(1);
		}
		Stack<Double> num = new Stack<>();
		Stack<String> op = new Stack<>();
		for(int i = 0; i < args.length; i++){
			if(args[i] == "+" || args[i] == "*" || args[i] == "-" || args[i] == "/"){
				op.push(args[i]);
			}
			else{
				int s = Integer.parseInt(args[i]);
				double d = s;
				num.push(d);
			}
		}
		while(num.size() != 0){
			double ope = 0;
			double op1, op2;
			op1 = num.top();
			num.pop();
			op2 = num.top();
			num.pop();
			switch (op.top()){
				case "+":
					ope = op1 + op2;
				case "*":
					ope = op1 * op2;
				case "-":
					ope = op1 + op2;
				case "/":
					ope = op1 / op2;
			}
			op.pop();
			num.push(ope);
		}
	}
}
