package com.Coforge.Day5prj;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerArrayList {
public static void main(String[] args) {
	Customer c1=new Customer(1,"stuti","hyd",56000);
	Customer c2=new Customer(54,"anu","hyd",60000);
	Customer c3=new Customer(57,"thk","hyd",60000);
	Customer c4=new Customer(60,"ag","hyd",60000);
	Customer c5=new Customer(61,"ig","hyd",60000);
	Customer c6=new Customer(62,"yg","hyd",60000);
	ArrayList<Customer>custList=new ArrayList<Customer>();
	custList.add(c1);
	custList.add(c2);
	custList.add(c3);
	custList.add(c4);
	custList.add(c5);
	custList.add(c6);
	//collection.sort is only possible with wrapper class -> means like integer char , no collection framework like //array
	
	//for collection framework we need to make comparable..
	
	Collections.sort(custList);
	custList.forEach(cust->System.out.println(cust));
	
	
	
}
