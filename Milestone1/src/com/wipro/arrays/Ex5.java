package com.wipro.arrays;

public class Ex5 {

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
		int max2=0;
		int min2=99999;
		int min=99999;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2&&a[i]<max)
				max2=a[i];
			if(a[i]<min2&&a[i]>min)
				min2=a[i];
		}
		System.out.println("maximum value is "+max);
		System.out.println("maximum value is "+max2);
		System.out.println("minimum value is "+min);
		System.out.println("minimum value is "+min2);


	}

}
