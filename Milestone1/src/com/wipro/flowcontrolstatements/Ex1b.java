package com.wipro.flowcontrolstatements;

public class Ex1b {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		a=a%10;
		b=b%10;
		if(a==b)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
