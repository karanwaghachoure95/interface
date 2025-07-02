package com.Interface;

public class CalculatorImpInterfce implements Calculator{

	@Override
	public void add(int a, int b) {
		
     System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpInterfce();
		calculator.add(12, 45);
	}
	

}
