package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Cat extends Animal
{
	private String noise = "HISSSSSS, PURRRRR, CHOMP!";
	
	public Cat() 
	{
	} // end no arg constructor

	public Cat(String noise) 
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
