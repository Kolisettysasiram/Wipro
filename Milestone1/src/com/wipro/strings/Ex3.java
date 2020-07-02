package com.wipro.strings;

public class Ex3 {

	public static void main(String[] args) {
		String s=args[0];
		String str="";
		int n=s.length();
		while(n!=0)
		{
			str=str+s.substring(0,2);
			n--;
		}
		System.out.println(str);

	}

}
