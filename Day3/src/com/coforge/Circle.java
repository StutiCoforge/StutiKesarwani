package com.coforge;

public class Circle implements ShapeInterface{
private double radius;
public Circle() {
	super();
}
public Circle(double radius) {
	super();
	this.radius=radius;
}
public void area() {
	System.out.println(3.15*radius*radius);
}
@Override
public void perimeter() {
	// TODO Auto-generated method stub

System.out.println();
System.out.println(2*3.14*radius);
	
}
}


