/*
 * 
 * Date			Author			Purpose
 * ===================================================================================================================
 * 09/27/2024	Kat Ash			Initial version of Animal Retreat application
 * 								which will call the classes and methods that will create
 * 								and run the spa
 * 
 * 10/04/2024	Kat Ash			Finalized the code and ready to check in
 */

package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.*;

import java.util.Scanner;

public class AnimalRetreatApp {

	// main class - this main is the only one used in this application
	// each application must contain a main 
	// this main will end up calling on most likely a run method
	private boolean debug = false;
	
	
	
	
	public static void main(String[] args) 
	{
		String attendantName = "Fred";
		Attendant attendant = new Attendant(attendantName);
		AnimalRetreatApp app = new AnimalRetreatApp();
		AnimalRetreat myRetreat = new AnimalRetreat(attendantName);
		
		app.launchApp(attendant, myRetreat);
		
		
		

	} // end main
	
	// this run method is the worker bee of the application
	// it calls on all the methods that you want the application to perform
	// for the end goal of meeting the requirements and executing as expected
	public void launchApp(Attendant attendant, AnimalRetreat myRetreat)
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println(attendant.getName() + " here.  Let\'s get this party started!");
		System.out.println("Here are our offerings from our Spa Menu!\n");
			
		menu(myRetreat, keyboard, attendant);
		
		keyboard.close();
		System.out.println("\n\n\"Relax\"\n,said " + attendant.getName() + ",\n\"I am programmed to receive\"\n"
				+ "\"You can check out any time you like, but you can never leave!\"\n");
		System.exit(0);
		
	} // end run
	
	// this method will provide a method to either list 
	// the animals or add an animal
	public void menu(AnimalRetreat myRetreat, Scanner kb, Attendant attendant)
	{
		int menuSelection = 0;
		// this method will display a menu that will allow the user to 
		// add an animal to the list
		// print the list of animals
		// start attendant rounds
		// close the inn for the night
		// exit from the loop
		
		while (menuSelection != 4)
		{
			menuSelection = printMenu(kb);
			
			if (menuSelection == 1)
			{
				myRetreat.printRoomsAndOccupantsAtSpa();
			}
			else if (menuSelection == 2)
			{
				int currentRoomCount = myRetreat.getCurrentOpenRoom();
				if (currentRoomCount < 10)
				{
					myRetreat.addAnimal(kb);
				}
				else
				{
					System.out.println("Sorry we are all booked up Please come back another day");
				}
			}
			else if (menuSelection == 3)
			{
				myRetreat.startAttendantRounds(attendant);
				System.out.println(attendant.getName() + "here. I have finished my tasks for the Day!!!")
			}
			else
			{
				break;
			}
			
			menuSelection = 0;
			if (debug == true)
			{
				System.out.println("at the end of menu in Animal retreat app ");
			}
			
		} // end while loop
		
}
	
	
	public int printMenu(Scanner kb)
	{
		
		int menuSelection = 0;
		
		System.out.println("\t\t\tMenu");
		System.out.println("\t===================================");
		System.out.println("\t1. List all animals");
		System.out.println("\t2. Add an animal");
		System.out.println("\t3. Start attendant rounds");
		System.out.println("\t4. Close the inn for the night\n\n");
		System.out.print("\tPlease enter your choice ");
		
		menuSelection = kb.nextInt();
		kb.nextLine();
		
		if ((menuSelection < 0) || (menuSelection > 4))
		{
			System.out.println("\nThat was an invalid answer.  Please try again\n");
		}
		
		return menuSelection;
		
		
	}
	

} // end application code for AnimalRetreatApp
