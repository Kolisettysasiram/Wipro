package com.wipro.arrays;

public class Ex12 {

	public static void main(String[] args) {
		int[] a=new int[3];
		int[] b=new int[3];
		int[] c=new int[2];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[j]);
			j++;
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=Integer.parseInt(args[j]);
			j++;
		}
		c[0]=a[(a.length)/2];
		c[1]=a[(b.length)/2];
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
