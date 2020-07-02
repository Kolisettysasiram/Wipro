package com.wipro.strings;

public class Ex10 {

	public static void main(String[] args) {
		String str=args[0];
		int n=Integer.parseInt(args[1]);
		int l=str.length();
		  String s=str.substring(l-n);
		  String t="";
		  while(n!=0)
		  {
		    t=t+s;
		    n--;
		  }
		  System.out.println(t);;
		  
	}

}
