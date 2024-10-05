/*
 * This class extends the abstract class Animal and is home to the Yellow Bellied Marmot
 * 
 * Date				Author			Purpose
 * 09/27/2024		Kat Ash			created initial version of the Yellow Bellied Marmot class
 * 									
 * 
 * 10/04/2024		Kat Ash			finalized code and ready to check in
 */


package com.skilldistillery.spa.entities;

import java.util.Objects;

public class YellowBelliedMarmot extends Animal
{
	private String noise = "Whistle!!! Scream!!!! Teeth chattering!!!!!";
	
	
	public YellowBelliedMarmot() 
	{
	}


	public YellowBelliedMarmot(String name, String noise) 
	{
		super();
		super.setName(name);
		this.noise = noise;
	} // end constructor

	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println(noise);
		
	} // end makeNoise method
	
	public String getSpecies()
	{
		return "Yellow Bellied Marmot";
	} // end method getSpecies
	@Override
	public void makeNoise(String noise)
	{
		YellowBelliedMarmot myMarmot = new YellowBelliedMarmot();
		myMarmot.makeNoise();
		System.out.println(noise);
	} // end method makeNoise 
	
	@Override
	public void eat(double quantity)
	{
		System.out.println("\n\tDon't bother me, I\'m eating " + quantity + " ounces of mouth watering "
				+ "\n\therbaceous plant, grasses, grains, "
				+ "\n\tvarious legumes, "
				+ "\n\tjuicy fruit, and occasionally I get to eat some fleas!\n");
	}

	@Override
	public String toString() 
	{
		return "YellowBelliedMarmot [noise=" + noise + ", getName()=" + getName() + ", getNoise()=" + getNoise()
				+ ", toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ "]";
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
		YellowBelliedMarmot other = (YellowBelliedMarmot) obj;
		return Objects.equals(noise, other.noise);
	}
	


}
