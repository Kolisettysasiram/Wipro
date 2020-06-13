package com.wipro.arrays;

public class Ex7 {

	public static void main(String[] args) {
		int l=Integer.parseInt(args[0]);
		int[] a = new int[l];
		int j=1;
		int[] b=new int[1000];
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.parseInt(args[j]);
			b[a[i]]++;
			j++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(b[a[i]]>0)
			{
				System.out.print(a[i] +" ");
				b[a[i]]=0;
			}
		}
	}

}
