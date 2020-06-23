package com.wipro.polymorphism;

class Fruit
{
	 String taste,name,size;
	Fruit(String n,String t,String s)
	{
		taste=t;
		size=s;
		name=n;
		
	}
	void eat()
	{
		System.out.println(name +" taste is "+taste);
	}
}

class Orange extends Fruit
{
	Orange(String n,String t,String s){
		super(n,t,s);
		
	}
	void eat()
	{
		System.out.println(name +" taste is "+taste);
	}
}

class Apple extends Fruit
{
	Apple(String n,String t,String s){
		super(n,t,s);
		
	}
	void eat()
	{
		System.out.println(name +" taste is "+taste);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Orange o=new Orange("orange","sour","medium");
		Apple a=new Apple("apple","sweet","medium");
		a.eat();
		o.eat();
		

	}

}
