package com.wipro.class_objects;

class Calculator
{
	static double powInt(int num1,int num2)
	{
		return Math.pow(num1, num2);
	}
	static double powdouble(double num1,double num2)
	{
		return(Math.pow(num1, num2));
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.powInt(2,3));
		System.out.println(c.powdouble(3,2));
		
		

	}

}
