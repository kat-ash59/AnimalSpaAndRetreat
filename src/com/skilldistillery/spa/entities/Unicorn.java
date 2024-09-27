package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Unicorn extends Animal
{
	private String noise = "I am a Unicorn admire my shiny horn and my pearly white coat!\n"
			+ "As you now know, we Unicorns can speak the Human English Language!";
	
	
	
	
	public Unicorn() 
	{
		super();
	} // end unicorn constructor no args

	public Unicorn(String name) 
	{
		super(name);
	} // end constructor set name

	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println(noise);
		
	} // end makeNoise method
	
	@Override
	public void makeNoise(String noise)
	{
		Unicorn myUnicorn = new Unicorn();
		myUnicorn.makeNoise();
		System.out.println(noise);
	} // end method makeNoise 

	@Override
	public void eat(double quantity)
	{
		System.out.println("Don't bother me, I\'m eating " + quantity + " lbs of delicious Alfalfa Hay.");
	}

	@Override
	public String toString() 
	{
		return "Unicorn [noise=" + noise + ", name=" + name + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	} // end toString method
	
	

	@Override
	public int hashCode() 
	{
		return Objects.hash(noise);
	} // end method hashCode for comparisons

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unicorn other = (Unicorn) obj;
		return Objects.equals(noise, other.noise);
	} // end method to compare objects noise

	public String getNoise() 
	{
		return noise;
	}  // end method get noise

	public void setNoise(String noise) 
	{
		this.noise = noise;
	} // end method set noise
	
	
	

} // end class Unicorn
