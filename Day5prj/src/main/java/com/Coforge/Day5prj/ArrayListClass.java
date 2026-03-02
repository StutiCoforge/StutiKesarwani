package com.Coforge.Day5prj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {
                public static void main(String[] args) {
                	ArrayList alist=new ArrayList();
                	System.out.println("========================================");
                	alist.add(null);
                	alist.add("stuti");
                	alist.add(56);
                	alist.add(true);
                	alist.add(78.96);
                	alist.add(45.67f);
                	alist.add('S');
            		
                	for(int i=0;i<alist.size();i++)
                		System.out.println(alist.get(i));
                	System.out.println("========================================");
                	alist.add("stuti");
                	alist.add(56);
                	alist.add(true);
                	alist.add(78.96);
                	alist.add(45.67f);
                	alist.add('S');
                	alist.add(null);
                	alist.add(null);
                	for(int i=0;i<alist.size();i++)
                		System.out.println(alist.get(i));
                	System.out.println(alist);
                	ArrayList<Integer>intAlist=new ArrayList<Integer>();
                	intAlist.add(56);
                	intAlist.add(90);
                	intAlist.add(34);
                	intAlist.add(34);
                	intAlist.add(34);
                	intAlist.add(34);
                	intAlist.add(34);
                	System.out.println(intAlist);
                	for(int i=0;i<intAlist.size();i++)
                		System.out.println(intAlist.get(i));
                	for(int i:intAlist)
                		System.out.println(i);
                	
//                Integer ibj=567;  
//                int i1-iobj.intValue();--- unboxing//jvm makesure wrraper get converted into int and int into wrapper class
//                	
                	System.out.println("***************************");
                	Iterator<Integer>itr=intAlist.iterator();
                	while(itr.hasNext()) {
                		Integer i=itr.next();
                		if(i==34)
                			itr.remove();
                		System.out.println(i);
                	}
                		System.out.println("After iteration arrayList is:");
                		System.out.println(intAlist);
                 System.out.println("Forward direction list values");
                		ListIterator<Integer>ListItr=intAlist.listIterator();
                		while(ListItr.hasNext())
                			System.out.println(ListItr.next());
                		System.out.println("Reverse direction of list values");
                		while(ListItr.hasPrevious())
                			System.out.println(ListItr.previous());
                		
                		//addall
                		
                		ArrayList<Integer>alist1=new ArrayList<Integer>();
                		alist1.add(54);
                		alist1.add(33);
                		alist1.add(98);
                		alist1.add(0,11);
                		System.out.println(alist1);
                		intAlist.addAll(3,alist1);
                		System.out.println("After add all method");
                		System.out.println(intAlist);
                		
                		
                		System.out.println(intAlist);
                		intAlist.remove(2);
                		System.out.println(intAlist);
                		Integer i=134;
                		intAlist.remove(i);
                		System.out.println(intAlist);
                		
                		intAlist.removeAll(alist);
                		System.out.println("After removeall collection");
                		System.out.println(intAlist);
                		System.out.println(alist);
                		intAlist.replaceAll(e->e+10);
                		System.out.println(intAlist);
//                		System.out.println("Before clear"+alist);
//                		alist.clear();
//                		System.out.println("After clear"+alist);
//                		Integer i1=999;
//                		intAlist.addFirst(i1);
//                		System.out.println(intAlist);
                		
                		
                		ArrayList<Integer>clonedArrayList=(ArrayList<Integer>)alist.clone();
                		
                		System.out.println(clonedArrayList);   // this will show same in respect to reference or location we can say.
                		System.out.println(alist.hashCode());
                		System.out.println(clonedArrayList.hashCode());
                		
                		//will show different because we are making chANGES IN cloned
                		clonedArrayList.add(78);
                		System.out.println(alist);
                		System.out.println(clonedArrayList.hashCode());
                		
               //Cloneable
                		//javaserializable
                		
                		System.out.println(alist.contains(67));
                		System.out.println(alist.containsAll(intAlist));
                		
                		//iterator for each
                		alist.forEach(e->System.out.println(e));
                		System.out.println(alist.indexOf(98));
                		intAlist.retainAll(alist);
                		System.out.println(intAlist);
                		System.out.println(alist.toString().getClass);
                }
                
}
