package com.wipro.flowcontrolstatements;

public class Ex5 {

	public static void main(String[] args) {
		String s=args[0];
		char a=s.charAt(0);
		if((a>='a'&& a<='z')||(a>='A'&&a<='Z'))
			System.out.println("Alphabet");
		else if(a>='0' && a<='9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");


	}

}
