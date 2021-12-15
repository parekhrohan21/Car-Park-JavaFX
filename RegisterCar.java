
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
public class RegisterCar {
    //this metod list all the registered cars
    static void listAll(List<Car> carListIn)
	{
		for(Car item : carListIn)
		{
			System.out.println(item.getRegistration()
			+ " "
			+ item.getowner());
			
		}
	}
    // this method helps in adding new cars in the registered file
   static void addCar(List<Car> carListIn)
	{
		String tempReg;
		String tempowner;
		System.out.print("Please enter the registration number: ");
		tempReg = EasyScanner.nextString(); 
               
		System.out.print("Please enter the owner: ");
		tempowner= EasyScanner.nextString();
		//tempPrice = EasyScanner.nextDouble();
		carListIn.add(new Car(tempReg, tempowner));
                		System.out.print("\nCar added "+tempReg+" "+tempowner);
	}
}
