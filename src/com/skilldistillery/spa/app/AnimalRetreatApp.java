package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.*;

public class AnimalRetreatApp {

	public static void main(String[] args) 
	{
		AnimalRetreatApp app = new AnimalRetreatApp();
		app.run();
		

	}
	
	public void run()
	{
		AnimalRetreat retreat = new AnimalRetreat("Fred the Attendant");
		
		Unicorn myUnicorn = new Unicorn();
		myUnicorn.setName("It\'s So Fluffy");
		System.out.println(myUnicorn.getName());
		
	} // end run
	
	

}
