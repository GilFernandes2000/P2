public class RentalCar
{
   private boolean rented;
   private static int available = 0;
   private static int numRented = 0;

   public RentalCar()
   { 
      rented = false;
      available +=1;
   }

   /**
      Get number of cars available
      @return count of cars that are available
   */
   public static int numAvailable() 
   {
      return available;
   }

   /**
      Get number of cars rented
      @return count of cars that are rented
   */
   public static int numRented() 
   {
      return numRented;
   }

   /**
      Try to rent this car.
      @return true if the car was successfully rented, false if it was already
      rented.
   */
   public boolean rentCar() 
   {
	  if (rented)
	  {
		  return false;
	  }
	  else
	  {
		  available--;
		  numRented++;
	  }
      return rented;
   }

   /**
      Return rented car.
      @return true if the car was previously rented and is now returned,
      false if it was not previously rented.
   */
   public boolean returnCar()
   {
      if (!rented)
	  {
		  return false;
	  }
	  else
	  {
		  available++;
		  numRented--;
	  }
      return rented;
   }
 
   // This method is used for checking your work. Do not modify it.

   public static String check(int n)
   {
      RentalCar[] cars = new RentalCar[n];
      for (int i = 0; i < n; i++) 
      {
         cars[i] = new RentalCar();
      }
      for (int i = 0; i < n; i = i + 2)
      {
         cars[i].rentCar();
      }
      for (int i = 0; i < n; i = i + 3)
      {
         cars[i].rentCar();
      }
      for (int i = 0; i < n; i = i + 4)
      {
         cars[i].returnCar();
      }
      return RentalCar.numAvailable() + " " + RentalCar.numRented();
   }     
}
