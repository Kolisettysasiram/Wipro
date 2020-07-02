package com.wipro.strings;

public class Ex4 {

	public static void main(String[] args) {
		String str=args[0];
		int l=str.length();
		if(l%2==0)
			System.out.println(str.substring(0,l/2));
		else
			System.out.println("null");

	}

}
