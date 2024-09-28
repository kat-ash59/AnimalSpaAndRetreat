/*
 * 
 * Date			Author			Purpose
 * ===================================================================================================================
 * 09/27/2024	Kat Ash			Initial version of Animal Retreat application
 * 
 */

package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.*;

public class AnimalRetreatApp {

	// main class - this main is the only one used in this application
	// each application must contain a main 
	// this main will end up calling on most likely a run method
	public static void main(String[] args) 
	{
		AnimalRetreatApp app = new AnimalRetreatApp();
		app.launchApp();
		

	} // end main
	
	// this run method is the worker bee of the application
	// it calls on all the methods that you want the application to perform
	// for the end goal of meeting the requirements and executing as expected
	public void launchApp()
	{
		String noise;
		AnimalRetreat myRetreat = new AnimalRetreat("Fred the Attendant");
		Unicorn myUnicorn = new Unicorn();
		myUnicorn.setName("It\'s So Fluffy");
		System.out.println("Hello my name is: \"" + myUnicorn.getName() + "!!!!\" Greetings to you my new friend!\n");
		myUnicorn.makeNoise();
		menu();
		
		
	} // end run
	
	// this method will provide a method to either list 
	// the animals or add an animal
	public void menu()
	{
		// this method will display a menu that will allow the user to 
		// add an animal to the list
		// print the list of animals
		// start attendant rounds
		// close the inn for the night
		// exit from the loop
		System.out.println("In AnimalRetreatApp menu not implemented yet");
	}
	
	

} // end application code for AnimalRetreatApp
