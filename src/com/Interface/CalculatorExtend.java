package com.Interface;

public class CalculatorExtend extends CalculatorImp{
  @Override
 public void add(int a,int b) {
	 System.out.println(a+b);
  }
  
  public static void main(String[] args) {
	  CalculatorExtend C=new CalculatorExtend();
	C.add(10,20);
}
}
