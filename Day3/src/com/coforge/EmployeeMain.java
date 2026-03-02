package com.coforge;

public class EmployeeMain {
             public static void main(String[]args) {
            	 Employee e1=new Employee("a",123,700000);
            	 Employee e2=new Employee("b",234,80000);
            	 Employee e3=new Employee("c",678,90000);
            	 
            	 e1.setCompanyName("Ct");
            	 System.out.println(e1);
            	 System.out.println(e2);
            	 System.out.println(e3);
            	 
            	 
            	 
            	 e1.calcSalary();
            	 e2.calcSalary();
            	 e3.calcSalary();
             }
}
