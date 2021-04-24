import java.util.*;
import java.time.*;

public class FBPost{
	
	private String id;
	private String name;
	private LocalDate instant;
	private String conte;
	private int likes = 0;
	private ArrayList <String> coment;
	
	public FBPost(String id, String name, LocalDate instante, String conte, int likes, ArrayList<String> coment){
		this.id = id;
		this.name = name;
		this.instant = instant;
		this.conte = conte;
		this.likes = likes;
		this.coment = coment;
	}
	public String id(){
		return id;
	}
	public String name(){
		return name;
	}
	public LocalDate instant(){
		return LocalDate.now();
	}
	public String conte(){
		return conte;
	}
	public int likes(){
		return likes;
	}
	public ArrayList<String> coment(){
		ArrayList<String> aux = new ArrayList<>();
		for(String l: coment){
			aux.add(l);
		}
		return aux;
	}
}
