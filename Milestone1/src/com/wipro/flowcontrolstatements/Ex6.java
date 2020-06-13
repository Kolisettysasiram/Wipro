package com.wipro.flowcontrolstatements;

public class Ex6 {

	public static void main(String[] args) {
		String s=args[0];
		char a=s.charAt(0);
		int b=Integer.parseInt(args[1]);
		
		if(s.equals("Female"))
		{
			if(b>=1 && b<=58)
				System.out.println("8.2%");
			else
				System.out.println("9.2%");
				
		}
		else
		{
			if(b>=1 && b<=58)
				System.out.println("8.4%");
			else
				System.out.println("10.5%");
				
		}

	}

}
