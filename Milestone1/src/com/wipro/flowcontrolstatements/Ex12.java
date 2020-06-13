package com.wipro.flowcontrolstatements;

public class Ex12 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			  System.out.println("not");
			  flag=1;
			  break;
			}
		}
		if(flag==0 || a==2)
			System.out.println("prime");
		
	}

}
