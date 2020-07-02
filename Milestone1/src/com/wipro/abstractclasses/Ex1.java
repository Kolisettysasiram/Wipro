package com.wipro.abstractclasses;

abstract class GeneralBank
{
	public abstract double getSavingsInterestRate();
	public abstract double getFixedDepositInterestRate();
	
}

class ICICIBank extends GeneralBank
{
	public  double getSavingsInterestRate()
	{
		return 4;
		
	}
	public  double  getFixedDepositInterestRate() 
	{
		
		return 8.5;
	}
}

class KotMBank extends GeneralBank
{
	public  double getSavingsInterestRate()
	{
		return 6;
		
	}
	public  double  getFixedDepositInterestRate() 
	{
		return 9;
		
	}
}

public class Ex1 {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
        KotMBank k=new KotMBank();
        GeneralBank gk=new KotMBank();
        GeneralBank gi=new ICICIBank();
        System.out.println(" Savings interest rate is  "+i.getSavingsInterestRate());
        System.out.println(" Savings interest rate is  "+i.getFixedDepositInterestRate());
        System.out.println(" Savings interest rate is  "+k.getSavingsInterestRate());
        System.out.println(" Savings interest rate is  "+k.getFixedDepositInterestRate());
        System.out.println(" Savings interest rate is  "+gi.getSavingsInterestRate());
        System.out.println(" Savings interest rate is  "+gi.getFixedDepositInterestRate());
        System.out.println(" Savings interest rate is  "+gk.getSavingsInterestRate());
        System.out.println(" Savings interest rate is  "+gk.getFixedDepositInterestRate());
	}

}
