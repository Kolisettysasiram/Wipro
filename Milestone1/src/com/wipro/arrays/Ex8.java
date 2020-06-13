package com.wipro.arrays;

public class Ex8 {

	public static void main(String[] args) {
		
		int l=Integer.parseInt(args[0]);
		int[] a = new int[l];
		int j=1;
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.parseInt(args[j]);
			j++;
		}
		
		int x=0,y=0;
		int sum=0,sum2=0;
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==7)
			  x=k;
			if(a[k]==6)
				y=k;
			sum=sum+a[k];
		}
		if(x>y)
		{
			int t=0;
			t=y;
			y=x;
			x=t;
		}
		for(int m=x;m<=y;m++)
		{
			sum2=sum2+a[m];
		}
		System.out.println(sum-sum2);
		
	}

}
