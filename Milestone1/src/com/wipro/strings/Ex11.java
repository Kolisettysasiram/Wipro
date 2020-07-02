package com.wipro.strings;

public class Ex11 {

	public static void main(String[] args) {
		String str=args[0];
		String word=args[1];
		int l=word.length();
		  String s;
		  if(str.length()<word.length())
		  {
	        System.out.println("");
		  }
		  if(str.length()==word.length())
		  {
			  System.out.println("");
		  }
		  
		  s=str.substring(0,l);
		  String t="";
		  if(s.equals(word))
		  {
		    t=t+str.charAt(l);
		  }
		  for(int i=l;i<str.length()-l;i++)
		  {
		    if(str.substring(i,i+l).equals(word))
		    {
		      t=t+str.charAt(i-1);
		      t=t+str.charAt(i+l);
		       i=i+l-1;
		    }
		   
		  }
		  if(str.substring(str.length()-l).equals(word))
		  t=t+str.charAt(str.length()-l-1);
		  System.out.println(t);
	}

}
