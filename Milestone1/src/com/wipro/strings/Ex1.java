package com.wipro.strings;

public class Ex1 {

	public static void main(String[] args) {
		String s=args[0];
		int l=s.length();
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
		   char a=s.charAt(i);
		   char b=s.charAt(l-1-i);
		   if(a!=b)
		   {
			   flag=1;
			   break;
		   }
		}
		if(flag==1)
			System.out.println("Not palindrome");
		else
			System.out.println("Palindrome");

	}

}
