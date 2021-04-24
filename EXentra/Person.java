public class Person
{
	public Person(String aName, String aStreet, String aCity, String aState, String aZip)
    {  
      name = aName;
      street = aStreet;
      city = aCity;
      state = aState;
      zip = aZip;
    }  
    
    public String formatForMailing()
   {  
      return name + "\n" + Adress.format();
   }
   
	Address Adress;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip; 
	
	public Person (String aName, Address ad)
	{
		name = aName;
		Adress = ad;
	}
	public static void main(String[] args)
   {
      Person harry = new Person("Harold J. Hacker",
      new Address("123 Main Street", "Anytown", "NY", "12345"));
      System.out.println(harry.formatForMailing());
   }   
}
