package com.Coforge.Day5prj;


import java.util.Comparator;

public class OrderCostComaparator implements Comparator<Customer> {
	
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getOrdercost()-o2.getOrdercost());
	}
	

}
