public class Coin {
	private double value;
	private String name;
	private static int count = 0;
	
	public static int objectCount() {
	  return count; 
	}
	public Coin(double aValue, String aName) {
		value = aValue;
		name = aName;
		count++;
	}
	
	public double getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString()
   {
      return "Coin[value=" + value + ",name=" + name + "]";
   }
  
  
   public static int check(int dimes, int quarters)
   {
      Coin[] coins = new Coin[dimes + quarters];
      for (int i = 1; i <= dimes; i++)
         coins[i] = new Coin(0.10, "dime");
      for (int i = 1; i <= quarters; i++)
         coins[dimes] = new Coin(0.25, "quarter");
      return Coin.objectCount();
   }
}

	
