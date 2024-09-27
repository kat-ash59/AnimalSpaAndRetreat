package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Attendant 
{
	private String name;

	
	public Attendant()
	{
		// no arg constructor
	}
	
	public Attendant(String name) 
	{
		super();
		this.name = name;
	}
	
	public void makeRounds()
	{

	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}



	@Override
	public String toString() 
	{
		return "Attendant [name=" + name + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendant other = (Attendant) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
} // end class Attendant
