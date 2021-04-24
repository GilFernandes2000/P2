package p2utils;

public class Palindrome{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.print("Usage: java -ea Palindrome <Frase>");
		}
		if(isPalindrome(args[0])){
			System.out.print("A frase é um palindrome");
		}
		else{
			System.out.print("A frase nao é um palindrome");
		}
	}
	public static boolean isPalindrome(String str){
		int i = 0;
		int j = str.length()-1;
		
		while(i<j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
