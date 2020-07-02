package com.wipro.strings;

public class Ex7 {

	public static void main(String[] args) {
		int flag=0,flag1=0;
		String s=args[0];
		String str="";
		if(s.charAt(0)=='x')
			flag=1;
		if(s.charAt(s.length()-1)=='x')
			flag1=1;
		if(flag==1 && flag1==1)
			str=s.substring(1,s.length()-1);
		else if(flag==1 && flag1==0)
			str=s.substring(1);
		else if(flag==0 && flag1==1)
			str=s.substring(0,s.length()-1);
		else
			str=s;
		System.out.println(str);
		
		
	}

}
