package com.wipro.strings;

public class Ex6 {

	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		int m=a.length();
		int n=b.length();
		if(m>n)
			System.out.println(b+a+b);
		else
			System.out.println(a+b+a);
	}

}
