package com.wipro.flowcontrolstatements;

public class Ex3 {

	public static void main(String[] args) {
		int k=args.length;
		if(args.length==0)
		{
			System.out.println("no values");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.print(args[i]);
				if(i==k-1)
					break;
				else
					System.out.print(",");
				
				
			}
		}
		
		

	}

}
