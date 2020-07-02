package com.wipro.strings;



public class Ex8 {

	public static void main(String[] args) {
		String str=args[0];
	    if(str.length() < 1)
	        System.out.println("");
	        
	    if(str.length() == 1) {
	        if(str.charAt(0) == '*')
	            System.out.println("");
	        else
	            System.out.println(str);
	    }
	                                    
	    char[] arr = new char[str.length()];
	    int count = 0;
	                                            
	                                                
	    if(str.charAt(0) != '*' && str.charAt(1) != '*') {
	        arr[count] = str.charAt(0);
	        count++;
	    }
	                                                              
	    for(int i = 1; i < str.length() - 1; i++) {
	        if(str.charAt(i-1)!='*' && str.charAt(i) != '*' && 
	            str.charAt(i+1) != '*') {
	            arr[count] = str.charAt(i);
	            count++;
	        }
	    }
	                                                                                        
	    if(str.charAt(str.length()-1) != '*' && 
	        str.charAt(str.length()-2) != '*') {
	        arr[count] = str.charAt(str.length() - 1);
	        count++;
	    }
	    String k=new String(arr, 0, count);
	    System.out.println(k);
 
	}

}
