package com.coforge;

public class Square implements ShapeInterface{
	
	private double length;
	public Square() {
		super();
	}
	public Square(double length) {
		super();
		this.length=length;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(length*length);
	}

	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println(4*length);
		
	}
	

}
