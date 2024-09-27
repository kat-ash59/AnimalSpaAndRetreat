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
		app.run();
		

	}
	
	// this run method is the worker bee of the application
	// it calls on all the methods that you want the application to perform
	// for the end goal of meeting the requirements and executing as expected
	public void run()
	{
		String noise;
		AnimalRetreat myRetreat = new AnimalRetreat("Fred the Attendant");
		Unicorn myUnicorn = new Unicorn();
		myUnicorn.setName("It\'s So Fluffy");
		System.out.println("Hello my name is: " + myUnicorn.getName() + " greetings to you my new friend!");
		myUnicorn.makeNoise();
		
	} // end run
	
	

}
