
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
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
public class CarFileHandler {
  	// method for writing the file
	static void writeList1(List<Car> parkListIn)
{       
		// use try-with-resources to ensure file is closed safely
		try(	
				FileOutputStream carFile = new FileOutputStream("Park.bin");
				DataOutputStream carWriter = new DataOutputStream(carFile);
          	)
		{

			for(Car item : parkListIn)
			{
				carWriter.writeUTF(item.getRegistration());
				carWriter.writeUTF(item.getowner());
				
			}
		
		}

		catch(IOException e)
		{
			System.out.println("There was a problem writing the file");
		}
}

	
	// method for reading the file
		static void readList1(List<Car> parkListIn)
	{
		String tempReg;
		String tempowner;
		//double tempPrice;
		boolean endOfFile = false;
                
       // use try-with-resources to ensure file is closed safely
		try(
				FileInputStream carFile = new FileInputStream("Park.bin");
				DataInputStream carStream = new DataInputStream(carFile);
			)
		{			
			while(endOfFile == false)
			{
				try
				{
					tempReg = carStream.readUTF();
					tempowner = carStream.readUTF();
					//tempPrice = carStream.readDouble();
					parkListIn.add(new Car(tempReg, tempowner));
				}
				catch(EOFException e)
				{
					endOfFile = true;
				}
			}
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("\nThere are currently no records");
		}
	
		catch(IOException e)
		{
			System.out.println("There was a problem reading the file");
		}
	}
                
                static void writeList2(List<Car> carListIn)
{       
		// use try-with-resources to ensure file is closed safely
		try(	
				FileOutputStream carFile = new FileOutputStream("Cars.bin");
				DataOutputStream carWriter = new DataOutputStream(carFile);
          	)
		{

			for(Car item : carListIn)
			{
				carWriter.writeUTF(item.getRegistration());
				carWriter.writeUTF(item.getowner());
				
			}
		
		}

		catch(IOException e)
		{
			System.out.println("There was a problem writing the file");
		}
}

	
	// method for reading the file
		static void readList2(List<Car> carListIn)
	{
		String tempReg;
		String tempowner;
		//double tempPrice;
		boolean endOfFile = false;
                
       // use try-with-resources to ensure file is closed safely
		try(
				FileInputStream carFile = new FileInputStream("Cars.bin");
				DataInputStream carStream = new DataInputStream(carFile);
			)
		{			
			while(endOfFile == false)
			{
				try
				{
					tempReg = carStream.readUTF();
					tempowner = carStream.readUTF();
					//tempPrice = carStream.readDouble();
					carListIn.add(new Car(tempReg, tempowner));
				}
				catch(EOFException e)
				{
					endOfFile = true;
				}
			}
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("\nThere are currently no records");
		}
	
		catch(IOException e)
		{
			System.out.println("There was a problem reading the file");
		}
	}
}
