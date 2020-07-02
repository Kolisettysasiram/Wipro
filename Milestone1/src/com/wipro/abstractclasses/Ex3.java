package com.wipro.abstractclasses;

abstract class Instrument
{
public abstract void play();
}

class Piano extends Instrument
{
	public void play()
	{
		System.out.println("Piano is playing  tan tan tan tan");
	}
}

class Guitar extends Instrument
{
	public void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
}

class Flute extends Instrument
{
	public void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		for(int i=0;i<10;i++)
		{
			if(i==4 || i==9 || i==0 )
				instruments[i]=new Piano();
			else if(i==8 || i==5 || i==1 )
				instruments[i]=new Guitar();
			else
				instruments[i]=new Flute();
			instruments[i].play();
			if(instruments[i] instanceof Piano) 
				System.out.println("InstanceOf Piano"); 
			else if(instruments[i] instanceof Flute) 
				System.out.println("InstanceOf Flute"); 
			else
				System.out.println("InstanceOf Guitar"); 
			System.out.println(); 
			
		}
		

	}

}
