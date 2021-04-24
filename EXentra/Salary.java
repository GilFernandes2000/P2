public class Salary
{
   private double sal;
   
   public Salary(double sal){
	   this.sal = sal;
   }
   public double applyBonus(double bonus){
	   sal = sal + (sal*bonus);
	   return sal;
   }
   public double getValue(){
	  return sal;
  } 
}
