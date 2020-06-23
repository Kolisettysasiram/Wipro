package com.wipro.Encapsulation_Abstraction;

class Author
{
	static String name,email;
	static char gender;
	Author(String n,String e,char g)
	{
		name=n;
		email=e;
		gender=g;
	}
	
}

class Book
{
	String name;
	int price;
	int qtyInStock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public int getPrice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	void getAuthor()
	{
		System.out.println(" Author name : "+Author.name);
		System.out.println(" Author email : "+Author.email);
		System.out.println(" Author gender : "+Author.gender);
	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		Author a=new Author("sasi","sasi@gmail.com",'M');
		Book b=new Book();
		b.setPrice(999);
		b.setQtyInStock(45);
		b.setName("Computer Networks");
		System.out.println("Book name : "+b.getName());
		b.getAuthor();
		System.out.println(" Book price : "+b.getPrice());
		System.out.println(" Books stock quantity : "+b.getQtyInStock());
	
	}

}
