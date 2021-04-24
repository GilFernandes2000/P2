import static java.lang.System.*;
import java.util.Calendar;


public class Tarefa{
	private Data inicio;
	private Data fim;
	private String texto;
	
	public Tarefa(Data inicio, Data fim, String texto){
		this.inicio = inicio;
		this.fim = fim;
		this.texto = texto;
	}
	public Data inicio(){
		return inicio;
	}
	public Data fim(){
		return fim;
	}
	public String texto(){
		return texto;
	}
	public String toString() {
    return String.format("%s	%s	%s", inicio, fim, texto);
	}
} 
