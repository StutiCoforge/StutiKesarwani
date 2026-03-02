package com.coforge;

public class DemoOnFinal {
	private final String name="swapna";
	public void printDetails() {
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		DemoOnFinal dof=new DemoOnFinal();
		dof.printDetails();
		final double pi=3.14;
	}
	

}
