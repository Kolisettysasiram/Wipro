package com.wipro.arrays;

public class Ex6 {

	public static void main(String[] args) {
			   int [] a = {45,12,85,32,89,39,69,44,42,1,6,8};
			   int t;
			   for (int i=1; i<a.length;i++) {
			    for (int j=i; j> 0;j--) {
			     if (a[j]<a[j-1]) {
			      t=a[j];
			      a[j]=a[j-1];
			      a[j-1]=t;
			     }
			    }
			   }
			   for (int i=1; i<a.length;i++) {
			     System.out.println(a[i]);
			   }
			 

	}

}
