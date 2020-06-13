package com.wipro.flowcontrolstatements;

public class Ex14 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=a;i>0;i=i/10)
		{
			sum=sum+i%10;
		}
		System.out.println(sum);

	}

}
