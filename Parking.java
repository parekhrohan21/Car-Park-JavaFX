
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Parekh
 */
public class Parking {
    //this method will show the current status of the car park
     static void currentpark(List <Car> parkin)
    {
        {
                    int st=parkin.size();
                    System.out.println("\nCurrent availabilty of car park is "+(10-st));
                    System.out.println("\nList of Entered cars ");
                   for(int i=0;i<st;i++){ 
                   //for (Car item : parkin) 
                   System.out.println((i+1)+". "+parkin.get(i).getRegistration()
			+ " "
			+ parkin.get(i).getowner()); }
                    
                }
    }
   //this method will check the car and allow only the registered car to enter 
   static void checkin( List<Car> parkin, List<Car> carin)
   {
        if (parkin.size() <= 10)
                        {
                               String tempReg;
		String tempowner;
		
		System.out.print("Please enter the registration number: ");
		tempReg = EasyScanner.nextString();
                
		System.out.print("Please enter the owner: ");
		tempowner= EasyScanner.nextString();
               
               boolean ans=false;
               for (int i=0;i<carin.size();i++)
               {
                   if (carin.get(i).getRegistration().equals(tempReg))
                      ans = true;
               }
                                      if (ans)
                                      {
                                          parkin.add(new Car(tempReg, tempowner));
                                          System.out.print("The car is CHECKed IN");
                                      }
                                      else System.out.println("Only registered cars allowed"); 
         } 
         else System.out.println("The Park is currently full");  
   }
   //this method will allow the car to exit the car park
   static void checkout(List<Car> parkin)
            {
                for(int i=0;i<parkin.size();i++) {
                   //for (Car item : parkin) 
                   System.out.println((i+1)+". "+parkin.get(i).getRegistration()
			+ " "
			+ parkin.get(i).getowner()); }
                    
                int pos;
		System.out.print("Enter the position of the car to be removed: ");
		pos = EasyScanner.nextInt();
                int pIn=pos - 1;
                if (pos<=parkin.size()) {
		parkin.remove(pIn);
                System.out.print("\nCheck out Successful"); }
                else System.out.println("Invalid selection");
                }
}
