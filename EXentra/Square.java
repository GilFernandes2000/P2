public class Square
{
   private double length;
   
   public Square(double sideLength)
   {
      this.length = sideLength;
   }
   
    public double area()
   {
     return length*length;      
   }
   
   public void grow(double percentage)
   {
	  length += length*(percentage/100);   
   }
   
   public static double check(double s, double p)
   {
      Square sq = new Square(s);
      sq.grow(p);
      return sq.area();
   }
}
