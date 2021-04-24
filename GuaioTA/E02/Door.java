
public class Door {

  private int r1;
  private int r2;
  private double w;
  private double h;

  /** Constructs a new Door between two rooms.
   * @param r1 Identifier of a room.
   * @param r2 Identifiier of another room.  It cannot be the same as r1!
   * @param w  Door width (in meters).  Must be positive.
   * @param h  Door height (in meters).  Must be positive.
   */
  public Door(int r1, int r2, double w, double h) {
	assert r1 != r2;
	assert w > 0 && h > 0;
	this.r1 = r1;
	this.r2 = r2;
	this.w = w;
	this.h = h;
  }
  
  public double area(double w, double h){
	  assert w > 0;
	  assert h > 0;
	  double area = w * h;
	  return area;
  }
}

