public class SalaryBonus
{
   private double salary;
   private double bonusRate;

   public SalaryBonus(double aSalary, double aRate)
   {
	     //TODO: Add assert statements
      salary = aSalary;
      bonusRate = aRate;
      assert aSalary <= 150000;
      assert aRate <= 0.05;
   }
   public static String check(double salaryTest, double rateTest)
   {
      try
      {
         SalaryBonus eBonus = new SalaryBonus(salaryTest,rateTest);
         return "Constructor completed normally";
      }
      catch (AssertionError error)
      {
         return "Precondition violation detected";
      }
      catch (Exception exception)
      {
         return "Exception in constructor";
      }
   }
}
