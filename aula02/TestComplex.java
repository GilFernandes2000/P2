import static java.lang.System.*;
import java.util.*;

public class TestComplex {
	static Scanner sc = new Scanner(System.in);
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
	 double re, im;
	 System.out.print("Parte real -> ");
	 re = sc.nextDouble();
	 System.out.print("Parte Imaginaria -> ");
	 im = sc.nextInt();
    Complex a = new Complex(re, im);

    // Vamos usar métodos do objeto a
    out.println("(" + a.real() + " + " + a.imag() + "i)");
    out.println("  parte real = " + a.real());
    out.println("  parte imaginaria = " + a.imag());
    out.println("  modulo = " + a.abs());
    out.printf("  argumento =  %2.2f\n", a.arg());
  }

}
