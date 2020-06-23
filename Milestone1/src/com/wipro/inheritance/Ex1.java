package com.wipro.inheritance;

class Animal
{
	void eat()
	{
		System.out.println(" Animal is eating");
	}
	void sleep()
	{
	System.out.println(" Animal is sleeping");	
	}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println(" Bird is flying");
	}
	void eat()
	{
		System.out.println(" Bird is eating");
	}
	void sleep()
	{
	System.out.println(" Bird is sleeping");	
	}
}

public class Ex1 {

	public static void main(String[] args) {
     Animal a=new Animal();
     Bird b=new Bird();
     a.eat();
     a.sleep();
     b.fly();
     b.eat();
     b.fly();
     a.sleep();

	}

}
