/*
 * 
 * Date				Author			Purpose
 * ===================================================================================================================
 * 09/27/2024		Kat Ash			created initial version of the Animal Retreat class
 * 									which contains the foundation of the building that the
 * 									Animal Spa resides in
 * 10/04/2024		Kat Ash			finalized the code and ready to check in
 * 
 */

package com.skilldistillery.spa.entities;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class AnimalRetreat 
{
	// variables that are visible to the Animal retreat class
	private Attendant attendant;
	private final int MAX_NUMBER_OF_ROOMS = 10;
	private Animal animalsAtTheSpa[] = new Animal[MAX_NUMBER_OF_ROOMS];
	private String[] listOfAnimals = 
		{"Black Footed Ferret", "Cat", "Faerie Dog", "Hippo", "Koala", "Moose", "Mouse", "Unicorn", "Yellow Bellied Marmot", "Zebra"};
	private int currentOpenRoom = 3;
	private static boolean debug = false;
	
	// constructor
	public AnimalRetreat(String attendantName)
	{
		attendant = new Attendant(attendantName); 
		attendant.setName(attendantName);
		
		// will need to implement build spa
		System.out.println("We\'re excited to announce the COMPLETION of building out our NEW Animal Retreat and Spa Resort.");
		System.out.println("We welcome our non-human guests, and invite them all to luxuriate in delight!");
		System.out.println("We hired the best attendant on the planet to provide for all our guests.");
		System.out.println(attendantName + " Please introduce yourself!\n");
		
		attendant.introduceSelf(attendantName);
		
		// prior to opening there are three animals in the spa
		// need to add them here
		Cat myCat = new Cat("Emmaline Pankhurst", "Hisss Purr Hisss Purrrr CHOMP!");
		animalsAtTheSpa[0] = myCat;
		
		Unicorn myUnicorn = new Unicorn("Princess Sparkly Buttercup", "I am a Unicorn admire my shiny horn and my pearly white coat!\n"
			+ "\tAs you now know, we Unicorns can speak the Human English Language!");
		animalsAtTheSpa[1] = myUnicorn;
		
		FaerieDog myFaerieDog = new FaerieDog("Princess Pea Pod","I can grant you three wishes!!!  What do you wish for???");
		animalsAtTheSpa[2] = myFaerieDog;
	} // end constructor
	
	

	public void addAnimal(Scanner kb)
	{
		
		int menuSelection = 0;
		
		
		System.out.println("Hi, who would you like to reserve a room for?\n");
		menuSelection = printSelectAnimalMenu(kb);
	
		if (menuSelection == 0)
		{
			addBlackFootedFerret(kb);
			
		}
		else if (menuSelection == 1)
		{
			addCat(kb);
		}
		else if (menuSelection == 2)
		{
			addFaerieDog(kb);
		}
		else if (menuSelection == 3)
		{
			addHippo(kb);
		}
		else if (menuSelection == 4)
		{
			addKoala(kb);
		}
		else if (menuSelection == 5)
		{
			addMoose(kb);
		}
		else if (menuSelection == 6)
		{
			addMouse(kb);
		}
		else if (menuSelection == 7)
		{
			addUnicorn(kb);
		}
		else if (menuSelection == 8)
		{
			addYellowBelliedMarmot(kb);
		}
		else if (menuSelection == 9)
		{
			addZebra(kb);
		}
		

		if (debug == true)
		{
			System.out.println("at the end of add animal");
		}
		
	}// end add animal
	
	public int printSelectAnimalMenu(Scanner kb)
	{
		int menuSelection = 0;
		int i;
		boolean validAnswer = false;
		
		
		while (validAnswer == false)
		{
			
			for (i= 0; i < 10; i++)
			{
				System.out.println("\t" + i + " " + listOfAnimals[i]);
			}
			System.out.println("\nPlease select your Animal species you want to reserve and occupy a room for\n");
			System.out.print(" Please select the number from the list ");
			menuSelection = kb.nextInt();
			// 1 <cr>
			kb.nextLine(); // need to flush buffer
			
			if ((menuSelection >= 0) && (menuSelection < 10))
			{
				validAnswer = true;
			}
			else
			{
				System.out.println("\nThat was an invalid answer.  Please try again\n");
			}
			
		}
		return menuSelection;
	}
	
	
	public void addBlackFootedFerret(Scanner kb)
	{
		BlackFootedFerret myFerret = new BlackFootedFerret();
		String name = "";
		String noise = "";
		// now get name and noise of ferret
		
		name = getNameFromOwner("Black Footed Ferret", kb);

		noise = getNoiseFromOwner("Black Footed Ferret", kb);
		
		myFerret = new BlackFootedFerret(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myFerret;
		currentOpenRoom++;
		System.out.println("Hi " + name + " please makeyourself at home");
	}  // end method addBlakFootedFerret
	
	public void addCat(Scanner kb)
	{
		Cat myCat = new Cat();
		String name = "";
		String noise = "";
		// now get name and noise of the cat
		
		name = getNameFromOwner("Cat", kb);
		
		if (debug == true)
		{
			System.out.println("just after getNameFromOwner for cat name = " + name);
		}
		
		noise = getNoiseFromOwner("Cat", kb);
		
		if (debug == true)
		{
			System.out.println("just after getNoiseFromOwner for cat");
		}
		
		myCat = new Cat(name, noise);
		
		animalsAtTheSpa[currentOpenRoom] = myCat;
		
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");
		
		
	} // end method addCat
	
	public void addFaerieDog(Scanner kb)
	{
		FaerieDog myFaerieDog = new FaerieDog();
		String name = "";
		String noise = "";
		// now get name and noise of Faerie Dog
		
		name = getNameFromOwner("Faerie Dog", kb);

		noise = getNoiseFromOwner("Faerie Dog", kb);
		
		myFaerieDog = new FaerieDog(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myFaerieDog;
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");
		
	}  // end method addFaerieDog

	public void addHippo(Scanner kb)
	{
		Hippo myHippo = new Hippo();
		String name = "";
		String noise = "";
		// now get name and noise of Hippo
		
		name = getNameFromOwner("Hippo", kb);

		noise = getNoiseFromOwner("Hippo", kb);
		
		myHippo = new Hippo(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myHippo;
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");

	}  // end method addHippo
	
	public void addKoala(Scanner kb)
	{
		Koala myKoala = new Koala();
		String name = "";
		String noise = "";
		// now get name and noise of Koala
		
		name = getNameFromOwner("Koala", kb);

		noise = getNoiseFromOwner("Koala", kb);
		
		myKoala = new Koala(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myKoala;
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");

	}  // end method addKoala
	

	public void addMoose(Scanner kb)
	{
		Moose myMoose = new Moose();
		String name = "";
		String noise = "";
		// now get name and noise of Moose
		
		name = getNameFromOwner("Moose", kb);

		noise = getNoiseFromOwner("Moose", kb);
		
		myMoose = new Moose(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myMoose;
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");

		
	}  // end method addMoose
	
	
	public void addMouse(Scanner kb)
	{
		Mouse myMouse = new Mouse();
		String name = "";
		String noise = "";
		// now get name and noise of Mouse
		
		name = getNameFromOwner("Mouse", kb);

		noise = getNoiseFromOwner("Mouse", kb);
		
		myMouse = new Mouse(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myMouse;
		currentOpenRoom++;
		
		
		System.out.println("Hi " + name + " please makeyourself at home");

	}  // end method addMouse
	
	
	public void addUnicorn(Scanner kb)
	{
		Unicorn myUnicorn = new Unicorn();
		String name = "";
		String noise = "";
		// now get name and noise of Unicorn
		
		name = getNameFromOwner("Unicorn", kb);

		noise = getNoiseFromOwner("Unicorn", kb);
		
		myUnicorn = new Unicorn(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myUnicorn;
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");

	}  // end method addUnicorn
	
	
	public void addYellowBelliedMarmot(Scanner kb)
	{
		YellowBelliedMarmot myYellowBelliedMarmot = new YellowBelliedMarmot();
		String name = "";
		String noise = "";
		// now get name and noise of Yellow Bellied Marmot
		
		name = getNameFromOwner("Yellow Bellied Marmot", kb);

		noise = getNoiseFromOwner("Yellow Bellied Marmot", kb);
		
		myYellowBelliedMarmot = new YellowBelliedMarmot(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myYellowBelliedMarmot;
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");

	}  // end method addYellowBelliedMarmot
	
	
	public void addZebra(Scanner kb)
	{
		Zebra myZebra = new Zebra();
		String name = "";
		String noise = "";
		// now get name and noise of Zebra

		name = getNameFromOwner("Zebra", kb);

		noise = getNoiseFromOwner("Zebra", kb);
		
		myZebra = new Zebra(name, noise);
		animalsAtTheSpa[currentOpenRoom] = myZebra;
		currentOpenRoom++;
		
		System.out.println("Hi " + name + " please makeyourself at home");

	}  // end method addZebra
	
	
	public String getNameFromOwner(String species, Scanner kb)
	{		
		String name = null;
	
		boolean enteredValidResponse = false;
		
		while (enteredValidResponse == false)
		{
			try
			{
				System.out.println("Please enter your "+ species + "\'s name: ");
				name = kb.nextLine();
			} // end try
			catch (Exception e) 
			{
		        System.out.println("Invalid input.");
		    } // end catch e
			
			if (name.equals(null))
			{
				enteredValidResponse = false;
			}
			else
			{
				enteredValidResponse = true;
			}
			
		} // end while loop	
		
		if (debug == true)
		{
			System.out.println("after While loop in getNameFromOwner");
			System.out.println("name entered = " + name);
		}
		
		return name;
	}

	public String getNoiseFromOwner(String species, Scanner kb)
	{
		String noise = "";
	
		boolean enteredValidResponse = false;
		
		while (enteredValidResponse == false)
		{
			try 
			{
				System.out.println("Please enter the noise your " + species + "\'s makes: ");
				System.out.println("chomp chomp? ");
				noise = kb.nextLine();
				enteredValidResponse = true;
			}
			catch (Exception e) 
			{
		        System.out.println("Invalid input.");
		        kb.nextLine(); // Clear input buffer 
		    }
		}

		if (debug == true)
		{
			System.out.println("at the end of method getNoiseFromOwner");
			System.out.println("Noise = " + noise);
		}
		
		return noise;
		
	} // end getNoiseFromOwner


	public int getCurrentOpenRoom()
	{
		return this.currentOpenRoom;
	} // end method currentOpenRoom
	
	public void printRoomsAndOccupantsAtSpa()
	{
		// this method will loop thru the list of animals
		// and print out their information
		// print out a couple of blank lines before answers
		System.out.println("\n\n");
		try 
		{
			int i = 0;
			for(i = 0; i < 10; i++)
			{
				Animal myworkingAnimal = animalsAtTheSpa[i];
				if (myworkingAnimal == null)
				{
					System.out.println("Room "+ i + " is unoccupied. Time to call housekeeping!"); 
				}
				else if (myworkingAnimal.getName().equalsIgnoreCase("Clean"))
				{
					System.out.println("This room is now clean and ready to be occupied.");
				}
				else
				{
					System.out.println("Room " + i + " is occupied by " 
							+ animalsAtTheSpa[i].getName() 
							+ " the " + animalsAtTheSpa[i].getSpecies()
							+ "\n\twho says \"" + animalsAtTheSpa[i].getNoise() + "\"\n");
				}
			}
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("In Animal Retreat printRoomsAndOccupantsAtSpa You did something really wrong here");
		}
		
		// print out a couple of blank lines after answers
		System.out.println("\n\n");
		
	} // end method printRoomsAndOccupantsAtSpa
	
	
	public void startAttendantRounds(Attendant attendant)
	{
		// this method will call the attendants make rounds method
		if (debug == true)
		{
			System.out.println("In Animal Retreat start attendant rounds");
		}
		
		attendant.makeRounds(animalsAtTheSpa);
		
		if (debug == true)
		{
			System.out.println("In Animal Retreat after attendant makeRounds");
		}
		
	} // end method startAttendantRounds
	
	public String[] getListOfAnimals()
	{
		return this.listOfAnimals;
	} // end method getListOfAnimals


	// set attendant name
	public void setAttendant(Attendant attendant)
	{
		if (debug)
		{
			// this will set the attendant for the spa
			System.out.println("In Animal Retreat setAttendant not implemented yet");
		}
		
		this.attendant = attendant;
		
	} // end method setAttendant


	// STS Generated
	@Override
	public String toString() 
	{
		return "AnimalRetreat [attendant= " + attendant + ", animalsAtTheSpa= " + Arrays.toString(animalsAtTheSpa)
				+ ", listOfAnimals= " + Arrays.toString(listOfAnimals) + ", currentOpenRoom= " + currentOpenRoom
				+ ", getClass()= " + getClass() + ", hashCode()= " + hashCode() + ", toString()= " + super.toString()
				+ "]";
	}  // end method toString



	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(animalsAtTheSpa);
		result = prime * result + Arrays.hashCode(listOfAnimals);
		result = prime * result + Objects.hash(attendant, currentOpenRoom);
		return result;
	} // end method hashCode



	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalRetreat other = (AnimalRetreat) obj;
		return Arrays.equals(animalsAtTheSpa, other.animalsAtTheSpa) && Objects.equals(attendant, other.attendant)
				&& currentOpenRoom == other.currentOpenRoom && Arrays.equals(listOfAnimals, other.listOfAnimals);
	} // end method equals
	

} // end class AnimalRetreat
