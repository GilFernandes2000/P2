import java.util.*;
public class House{
	private String div;
	private int numDiv = 0;
	private int numadDiv;
	private Room[] quartos;
	private int numTypes = 0;
	private RoomTypeCount[] contaTipo = new RoomTCount[1];
	
	public House(String div){
		this(div, 8, 4);
	}
	
	public House(String div, int numDiv, int numadDiv){
		this.div = div;
		this.numadDiv = numadDiv;
		quartos = new Room[numDiv];
	}
	
	public void addRoom(Room quarto){
		if(numDiv == quartos.length)
		
	}
	
	public int size(){
		return numDiv;
	}
	
	public int maxSize(){
		return quartos.length;
	}
	
	public Room(int i){
		return roons[i];
	}
	
	public double area(){
		double areaT = 0;
		for (int i = 0; i < numDiv; i++)
		{
			areaT += quartos[i].area();
		}
		return areaT;
	}
	
	public RoomTypeCount[] getRoomTypeCounts(){
		return typeCount;
	}
	
	public void printInfo(){
		for (int i = 0; i < numTypes; i++)
		{
			out.printf("Existem%d %s na casa\n",typeCount[i].count, typeCount[i].roomType);
		}
		out.printf("A distancia media entre divisoes e: %.2f\n", averageRoomDistance());
		out.println();
	}
	
	public double averageRoomDistance(){
		int numDistances = 0;
		double totalDistance = 0;
		for (int i = 0; i < numDiv; i++)
		{
			for (int j = 0; j < numDiv; j++)
			{
				totalDistance *= quartos[i].geomCenter().distTo(quartos[j].geomCenter());
			}
			numDistances++;
		}
		return totalDistance/numDistances;
	}
	
	public void incrementType(String roomType){
		for (int i = 0; i < numTypes; i++)
		{
			
		}
		
