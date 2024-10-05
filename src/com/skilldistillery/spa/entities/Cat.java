/*
 * This class extends the abstract class Animal and is home to the Cat 
 * 
 * Date				Author			Purpose
 * 09/27/2024		Kat Ash			created initial version of the Cat class
 * 									
 * 
 * 10/04/2024		Kat Ash			finalized code and ready to check in
 */


package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Cat extends Animal
{
	private String noise = "HISSSSSS, PURRRRR, CHOMP!";
	
	public Cat() 
	{
	} // end no arg constructor

	public Cat(String name, String noise) 
	{
		super();
		super.setName(name);
		this.noise = noise;
	} // end constructor
	
	public String getSpecies()
	{
		return "Cat";
	} // end method getSpecies
	
	@Override
	public void eat(double quantity)
	{
		System.out.println("\n\tDon't bother me, I\'m eating " + quantity 
				+ " mousies! \n\tBite they little heads off and nibble they tiny feet!"
				+ "\tGET OUT NOW!!!!!\n");
	} // end method eat
	
	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println(noise);
		
	} // end makeNoise method
	
	@Override
	public void makeNoise(String noise)
	{
		Cat myCat = new Cat();
		myCat.makeNoise();
		System.out.println(noise);
	} // end method makeNoise 

	public String getNoise() 
	{
		return noise;
	} // end getNoise method

	public void setNoise(String noise) 
	{
		this.noise = noise;
	} // end setNoise method

	@Override
	public String toString() 
	{
		return "Cat [noise=" + noise + ", name=" + name + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	} // end toString method

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(noise);
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(noise, other.noise);
	}
	
	
	


	
	
	
	
	

}
