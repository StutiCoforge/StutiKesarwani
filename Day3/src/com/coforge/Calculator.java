package com.coforge;

public class Calculator implements SimpleCalculativeInterface, ScientificCalculatorInterface {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println((float)a/b);
		
	}

	@Override
	public void power(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(a,b));
		
	}

	@Override
	public void squareRoot(double d) {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(d));
		
		
	}

	@Override
	public void logvalue(double numm) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.log10(numm));
		
	}

}
