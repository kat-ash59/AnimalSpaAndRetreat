package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Hippo extends Animal
{

	private String noise = "Grunt Grunt Yawn!!!!!!";
	
	public Hippo() 
	{
	} // end no arg constructor

	public Hippo(String noise) 
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
		Hippo myHippo = new Hippo();
		myHippo.makeNoise();
		System.out.println(noise);
	} // end method makeNoise 
	
	@Override
	public void eat(double quantity)
	{
		System.out.println("Don't bother me, I\'m eating " + quantity + " lbs of delicious Salad and amazing Timothy Hay.");
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
		return "Hippo [noise=" + noise + ", name=" + name + ", getName()=" + getName() + ", toString()="
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
		Hippo other = (Hippo) obj;
		return Objects.equals(noise, other.noise);
	}
	
	
	
	
	
	
	
	
	

}
