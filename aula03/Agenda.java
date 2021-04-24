import static java.lang.System.*;
import java.util.Calendar;

public class Agenda{
	private Tarefa tar;
	
	public Agenda (Tarefa tar){
		this.tar = tar;
	}
	public Tarefa tar(){
		return tar;
	}
	
	public static Tarefa novaTarefa(Tarefa tar){
		return tar;
	}
	public static void escreve(){
		while(Agenda.hasNextLine()){
			System.out.printf("%s", Agenda);
		}
	}
}
