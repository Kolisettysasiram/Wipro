package com.wipro.arrays;

public class Ex1 {

	public static void main(String[] args) {
		int l=Integer.parseInt(args[0]);
		int[] a = new int[l];
		int j=1;
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.parseInt(args[j]);
			j++;
		}
		for(int i=0;i<l;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
