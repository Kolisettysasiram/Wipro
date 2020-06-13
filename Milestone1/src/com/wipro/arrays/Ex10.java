package com.wipro.arrays;

public class Ex10 {

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
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
			else
				continue;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
			else
				continue;
		}


	}

}
