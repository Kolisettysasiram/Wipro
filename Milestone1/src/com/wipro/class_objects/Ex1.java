package com.wipro.class_objects;

class Box{
	double width,height,depth;
	Box(double width,double height, double depth)
	{
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	double volume()
	{
		return width*height*depth;
	}
}

public class Ex1 {

	public static void main(String[] args) {
	   Box b=new Box(10,20,30);
	   double c=b.volume();
	   System.out.println(c);

	}

}
