package com.wipro.flowcontrolstatements;

public class Ex17 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=a;
		int rev=0;
		while(a>0)
		{
			rev=rev*10+(a%10);
			a=a/10;
		}
		int c=b-rev;
		if(c==0)
			System.out.println(b +" is a palindrome");
		else
			System.out.println(b +" is not a palindrome");
		
	}

}
