/**
 * Uma estrutura de dados baseada numa fila, mas em que só ficam
 * armazenados os últimos N números inseridos.
 * Quando a fila está preenchida (N elementos) a inserção de um novo número
 * implica a saída do primeiro (que deixa de existir).
 */

public class LeakyQueue
{
	public static void main(Double[] args){
		double[] queue = new double[3];
		for (int i = 0; i < args.length; i++)
		{
			if(i > queue.length){
				int j = 0;
				while(j < queue.length){
					queue[j] = queue[j+1];
					j++;
				}
				queue[queue.length-1] = args[i];
			}
			else{
				queue[i] = args[i];
			}
			System.out.println(queue);
		}
	}
}

