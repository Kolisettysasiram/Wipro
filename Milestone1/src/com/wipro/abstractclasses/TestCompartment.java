package com.wipro.abstractclasses;
import java.util.Random;


abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{

	 public String notice()
	{
		String s="First class is reserved ";
		return s;
	}
}

class Ladies extends Compartment
{

	 public String notice()
	{
		String s="Ladies class is reserved ";
		return s;
	}
}

class General extends Compartment
{

	 public String notice()
	{
		String s="General class is not reserved ";
		return s;
	}
}

class Luggage extends Compartment
{

	 public String notice()
	{
		String s="Luggage class is for luggage ";
		return s;
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] compartments = new Compartment[10];
          Random rand = new Random();
	    
	    for (int j= 0;j<10;j++) {
	    	int randomNum = rand.nextInt(4)+1;
	    	
	    	if (randomNum == 1)
	    		compartments[j] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[j] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[j] = new General();
	    	else if (randomNum == 4)
	    		compartments[j] = new Luggage();
	    	
	    	System.out.println(compartments[j].notice());

	}
	}

}
