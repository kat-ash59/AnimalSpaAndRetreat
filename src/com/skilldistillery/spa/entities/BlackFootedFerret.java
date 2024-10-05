package com.skilldistillery.spa.entities;

import java.util.Objects;

public class BlackFootedFerret extends Animal
{
	private String noise = "Hiss!! Chatter-Bark!!! Chortle!!!!";

	public BlackFootedFerret() 
	{
	} // end no arg constructor

	public BlackFootedFerret(String noise) 
	{
		super();
		this.noise = noise;
	} // end constructor
	
	public BlackFootedFerret(String name, String noise) 
	{
		super.name = name;
		this.noise = noise;
	} // end no arg constructor
	
	public String getSpecies()
	{
		return "Black Footed Ferret";
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
		BlackFootedFerret myBlackFootedFerret = new BlackFootedFerret();
		myBlackFootedFerret.makeNoise();
		System.out.println(noise);
	}
	
	@Override
	public void eat(double quantity)
	{
		System.out.println("\n\tDon't bother me, I\'m eating " + quantity + " ounces of mouth watering\n "
				+ "\tjuicy fruit, lichen, moss, flowers and various roots.\n");
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
		BlackFootedFerret other = (BlackFootedFerret) obj;
		return Objects.equals(noise, other.noise);
	}
	
	
	
	
	
	
	
	

}
