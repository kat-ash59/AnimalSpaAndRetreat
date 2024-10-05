package com.skilldistillery.spa.entities;

import java.util.Objects;

public class YellowBelliedMarmot extends Animal
{
	private String noise = "Whistle!!! Scream!!!! Teeth chattering!!!!!";
	
	
	public YellowBelliedMarmot() 
	{
	}


	public YellowBelliedMarmot(String noise) 
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
		System.out.println("Don't bother me, I\'m eating " + quantity + " ounces of mouth watering "
				+ " herbaceous plant, grasses, grains, "
				+ " various legumes, "
				+ "	juicy fruit, and occasionally I get to eat some fleas.");
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
