/*
 * This class extends the abstract class Animal and allows a room to be
 * marked clean
 * 
 * Date				Author			Purpose
 * 10/04/2024		Kat Ash			created initial version of the Clean class
 * 
 */


package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Clean  extends Animal
{

	// variables that are visible to the class Clean
	
	
	// constructors
	public Clean() 
	{
	} // end no arg constructor
	
	public void setName(String name)
	{
		super.setName(name);
	}
	
	public String getSpecies()
	{
		return "";
	}
	
} // end class Clean
