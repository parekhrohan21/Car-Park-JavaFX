import java.io.Serializable;


public class Car implements Serializable
{
	private String registration;
	private String owner;
     //   private ParkList parks;
        static final int max=10;
	
	public Car(String registrationIn, String ownerIn)
	{
		registration = registrationIn;
		owner = ownerIn;
             //   parks= new ParkList(max);
	}
        
       /* public void makePark(Park parkIn)
	{
            parks.addPark(parkIn); // call PaymentList method
	}*/
	
	public String getRegistration()
	{
		return registration;
	}
        
        
	
	public String getowner()
	{
		return owner;
	}
	
	
}

