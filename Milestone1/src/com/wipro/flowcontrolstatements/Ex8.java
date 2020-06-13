package com.wipro.flowcontrolstatements;

public class Ex8 {

	public static void main(String[] args) {
		String s=args[0];
		char a=s.charAt(0);
		switch(a) {
			case 'B':
				System.out.println("Blue");
				break;
			case 'R':
			    System.out.println("Red");
			    break;
			case 'O':
				System.out.println("Orange");
				break;
			case 'G':
				System.out.println("Green");
				break;
			case 'W':
				System.out.println("White");
                break;
			case 'Y':
				System.out.println("Yellow");
            default:
            	System.out.println("Invalid Code");
            	break;
		}
	

	}

}
