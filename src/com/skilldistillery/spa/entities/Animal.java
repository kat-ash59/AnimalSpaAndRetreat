package com.skilldistillery.spa.entities;

public abstract class Animal 
{
	private String name;
	
	
	
	
	// methods that do stuff
	public Animal()
	{
	}
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public void makeNoise()
	{
		System.out.println("Purr, Purr, Purr, Chomp");
	} // end method makeNoise
	
	
	public void eat(double quantity)
	{
		System.out.println("Don't bother me, I\'m eating " + quantity + " lbs of food.");
	}
	
	
	// methods for getters and setters
	public String getName() 
	{
		return name;
	} // end method getName

	public void setName(String name) 
	{
		this.name = name;
	} // end method setName
	


} // end class Animal
