import java.util.*;
import java.lang.*;

public class Room {
	private String divisao;
	private Point p1, p2;
	
	public Room(Point p1, Point p2, String divisao) {
		this.p1 = p1;
		this.p2 = p2;
		this.divisao = divisao;
	}
	
	public String roomType() {
		return divisao;
	}
	
	public Point bottomLeft() {
		return p1;
	}
	
	public Point topRigth() {
		return p2;
	}
	
	public Point geomCenter() {
		Point centro;
		centro = this.p1.halfWayTo(this.p2);
		return centro;
	}
	
	public double area() {
		double ar;
		double lado1 = p2.x() - Math.abs(p1.x());
		double lado2 = p2.x() - Math.abs(p1.x());
		ar = lado1*lado2;
		return ar;
	}
}
