/*
 * 
 * Date				Author			Purpose
 * ===================================================================================================================
 * 09/27/2024		Kat Ash			created initial version of the Animal Retreat class
 * 									which contains the foundation of the building that the
 * 									Animal Spa resides in
 * 
 * 
 */

package com.skilldistillery.spa.entities;

public class AnimalRetreat 
{
	private Attendant attendant;
	
	public AnimalRetreat(String attendantName)
	{
		attendant = new Attendant(attendantName); 
	}
	
	
} // end class AnimalRetreat
