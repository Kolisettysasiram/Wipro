package com.wipro.arrays;

public class Ex2 {

	public static void main(String[] args) {
		int l=Integer.parseInt(args[0]);
		int[] a = new int[l];
		int j=1;
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.parseInt(args[j]);
			j++;
		}
		int max=0;
		int min=99999;
		for(int i=0;i<l;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("maximum value is "+max);
		System.out.println("minimum value is "+min);


	}

}
