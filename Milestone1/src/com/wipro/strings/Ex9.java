package com.wipro.strings;

public class Ex9 {

	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		int l=a.length();
		  int m=b.length();
		  String s="";
		  String t;
		  if(l==m)
		  {
		    for(int i=0;i<l;i++)
		    {
		      s=s+a.charAt(i);
		      s=s+b.charAt(i);
		    }
		  }
		  if(l==0)
		  s=b;
		  if(m==0)
		  s=a;
		  if(l>m && l!=0 && m!=0)
		  {
		    t=a.substring(0,m);
		    
		    for(int i=0;i<m;i++)
		    {
		      s=s+t.charAt(i);
		      s=s+b.charAt(i);
		    }
		    s=s.concat(a.substring(m));

		  }
		  if(m>l&&  l!=0 && m!=0)
		  {
		    t=b.substring(0,l);
		    for(int i=0;i<l;i++)
		    {
		      s=s+a.charAt(i);
		      s=s+t.charAt(i);
		    }
		     s=s.concat(b.substring(l));
		  }
		  System.out.println(s);
	}

}
