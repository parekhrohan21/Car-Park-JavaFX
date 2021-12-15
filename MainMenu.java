/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Parekh
 */
import java.io.*;
import java.util.*;
public class MainMenu {
    // this is the main menu for the program
    public static void main(String[] args)
    {
        
        		List<Car> carList = new ArrayList<>();
                        //  String[] parkstatus=new String[10];
                        List<Car> parkstatus = new ArrayList<>();
                       CarFileHandler.readList1(parkstatus);
                       CarFileHandler.readList2(carList);
        int ch = 0;
        System.out.println("Welcome to the Car Park Application");
        do{
            
            System.out.println("\n\n1. Check In Car");
            System.out.println("2. Checkout Car");
            System.out.println("3. Car Park Current Status");
            System.out.println("4. Register new Car");
            System.out.println("5. List of All Registered Cars");
            System.out.println("6. Quit");
            System.out.print("\nEnter your choice from 1-6:- ");
            ch=EasyScanner.nextInt();
            switch (ch)
            {
                case 1: Parking.checkin(parkstatus, carList); break ;                    
                case 2: Parking.checkout(parkstatus); break;
                case 3: Parking.currentpark(parkstatus); break;              
                case 4: RegisterCar.addCar(carList); break;
                case 5: RegisterCar.listAll(carList); break;                
                case 6: System.out.println("Goodbye, testing complete");  
                        CarFileHandler.writeList1(parkstatus);
                        CarFileHandler.writeList2(carList);
                        break;                
                default: System.out.println("Entered value not valid\nPlease choose from 1-6");
            }
        }while(ch!=6);
    } 
   
   
   private boolean containsString(String testString, ArrayList<String> list) 
   {
        return list.contains(testString);
   }
}
