public class Box
{
   private double height;
   private double width;
   private double depth;
   
   public Box(double h, double w, double d){
	   this.height = h;
	   this.width = w;
	   this.depth = d;
   }
   
   public double volume(){
	   double volume = this.height * this.width * this.depth;
	   return volume;
   }
   
   public double surfaceArea(){
	   double surface1 = this.height * this.width;
	   double surface2 = this.height * this.depth;
	   double surface3 = this.width * this.depth;
	   double surArea = (surface1*2) + (surface2*2) + (surface3*2);
	   return surArea;
   }
}
