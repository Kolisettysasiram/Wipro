package com.wipro.inheritance;

 public class employee extends person{
	private double annual_salary;
	 private int emp_year;
	 private String insurance_num;
	 public employee(String n,double as,int e,String in)
	 {
		 super(n);
		 annual_salary=as;
		 emp_year=e;
		 insurance_num=in;
		 
	 }
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getEmp_year() {
		return emp_year;
	}
	public void setEmp_year(int emp_year) {
		this.emp_year = emp_year;
	}
	public String getInsurance_num() {
		return insurance_num;
	}
	public void setInsurance_num(String insurance_num) {
		this.insurance_num = insurance_num;
	}
	 
}
