package com.wipro.inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		person p=new person("suresh");
		employee e=new employee("sai",36000,1999,"DUT201956");
		e.setAnnual_salary(55500);
		e.setEmp_year(1988);
		e.setInsurance_num("dut1456789");
		System.out.println();e.getAnnual_salary();
		e.getEmp_year();
		e.getInsurance_num();
		
	}

}
