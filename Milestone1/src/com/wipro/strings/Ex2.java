package com.wipro.strings;

public class Ex2 {

	public static void main(String[] args) {
		String s=args[0];
		String t=args[1];
		int l=s.length();
		String str="";
		char a=s.charAt(l-1);
		char b=t.charAt(0);
		if(a!=b)
			str=s+t;
		else
		{
			str=s+t.substring(1);
		}
		System.out.println(str.toLowerCase());

	}

}
