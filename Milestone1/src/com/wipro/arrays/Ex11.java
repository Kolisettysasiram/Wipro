package com.wipro.arrays;

public class Ex11 {

	public static void main(String[] args) {
		int l=Integer.parseInt(args[0]);
		int[] a = new int[l];
		int j=1;
		int count=0;
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.parseInt(args[j]);
			j++;
		}
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=1&&a[i]!=4)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
