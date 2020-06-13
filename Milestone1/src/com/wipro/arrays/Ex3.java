package com.wipro.arrays;

public class Ex3 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int search=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("-1");
	}

}
