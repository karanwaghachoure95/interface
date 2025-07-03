package com.Interface;

public class CalculatorImpInterfce implements Calculator{

	@Override
	public void add(int a, int b) {
		
     System.out.println(a+b);
	}

	
	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpInterfce();
		calculator.add(12, 45);
	}
	

}
