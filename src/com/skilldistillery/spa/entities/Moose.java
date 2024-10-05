/*
 * This class extends the abstract class Animal and is home to the Moose 
 * 
 * Date				Author			Purpose
 * 09/27/2024		Kat Ash			created initial version of the Moose class
 * 									
 * 
 * 10/04/2024		Kat Ash			finalized code and ready to check in
 */

package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Moose extends Animal
{
	private String noise = "Bellows!!!! Roar!!! Grunt!!!!";

	public Moose() 
	{
	} // end no arg constructor

	public Moose(String name, String noise) 
	{
		super();
		super.setName(name);
		this.noise = noise;
	} // end constructor
	
	public String getSpecies()
	{
		return "Moose";
	} // end method getSpecies
	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println(noise);
		
	} // end makeNoise method
	
	@Override
	public void makeNoise(String noise)
	{
		Moose myMoose = new Moose();
		myMoose.makeNoise();
		System.out.println(noise);
	}
	
	@Override
	public void eat(double quantity)
	{
		System.out.println("\n\tDon't bother me, I\'m eating " + quantity + " pounds of mouth watering "
				+ " Aspen, pin cherry, willows, water lillies.\n");
	}
	

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
		return "BlackFootedFerret [noise=" + noise + ", name=" + name + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}

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
		Moose other = (Moose) obj;
		return Objects.equals(noise, other.noise);
	}
	
	
	
	
	
	
	
	

}
