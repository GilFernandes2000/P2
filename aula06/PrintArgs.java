import static java.lang.System.*;

public class PrintArgs {

  public static void main(String[] args) {
    printArray(args, args.length);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int N) {
    // Implemente de forma recursiva...
    assert N >= 0;
    assert N < array.length;
    if (N <= 2)
	{
		out.println(array[0]);
		out.println(array[1]);
	}
	else
	{
		for (int i = 0; i < N-2; i++)
		{
			out.printf("%s\n", array[i]);
		}
		out.println(array[N-1]);
	}
  }

}

