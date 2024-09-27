package com.skilldistillery.spa.entities;

import java.util.Objects;

public class FairyDogs extends Animal
{
	private String noise = "I can grant you three wishes!!!  What do you wish for???";

	public FairyDogs() 
	{
	} // end no arg constructor

	public FairyDogs(String noise) 
	{
		super();
		this.noise = noise;
	} // end constructor
	
	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println(noise);
		
	} // end makeNoise method
	
	@Override
	public void makeNoise(String noise)
	{
		FairyDogs myFairyDog = new FairyDogs();
		myFairyDog.makeNoise();
		System.out.println(noise);
	}
	
	@Override
	public void eat(double quantity)
	{
		System.out.println("Don't bother me, I\'m eating " + quantity + " ounces of mouth watering "
				+ " mousies! Bite they little heads off and nibble they tiny feet!");
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
		return "FairyDogs [noise=" + noise + ", name=" + name + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}  // end toString method

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
		FairyDogs other = (FairyDogs) obj;
		return Objects.equals(noise, other.noise);
	}
	
	
	
	
	
	
	
	
	
	
	

}
