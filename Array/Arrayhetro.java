package com.ListInterfaceDemo;

import java.util.ArrayList;
public class Arrayhetro {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add("yashu");
		a1.add(true);
		a1.add(7.95);
		a1.add('b');
		a1.add(null);
		System.out.println("List of array is:- "+a1);
		System.out.println("Size of array list:" +a1.size());
		//retrivale
		System.out.println(a1.get(2));
		//replace
		a1.set(2, "welcome");
		System.out.println(a1);
		System.out.println(a1.contains("java"));
		//for each read
		for (Object o : a1) {
			System.out.println("Reading the data from list="+o);

	}
	}

}