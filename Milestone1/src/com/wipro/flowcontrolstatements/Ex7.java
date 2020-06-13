package com.wipro.flowcontrolstatements;

public class Ex7 {

	public static void main(String[] args) {
		String s=args[0];
		char a=s.charAt(0);
		if(Character.isLowerCase(a))
			System.out.println(Character.toUpperCase(a));
		else
			System.out.println(Character.toLowerCase(a));
	
	}
	}
