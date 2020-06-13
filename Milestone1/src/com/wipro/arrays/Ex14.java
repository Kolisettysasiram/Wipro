package com.wipro.arrays;

public class Ex14 {

	public static void main(String[] args) {
		int l=args.length;
		if(l<9)
		{
			System.out.println("Please enter 9 integer numbers");
		}
		else
		{
			int[][] a=new int[3][3];
			int k=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			int max=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(a[i][j]>max)
						max=a[i][j];
				}
			}
			System.out.println("The biggest number in the given array is "+max);
		}

	}

}
