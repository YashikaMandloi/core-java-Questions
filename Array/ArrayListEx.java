package com.ListInterfaceDemo;

import java.util.ArrayList;

public class ArrayListEx {
public static void main(String args[]) {
	
	//declare
	ArrayList  a1=new ArrayList();
	
	a1.add(100);
	a1.add('c');
	a1.add(true);
	a1.add(2.5);
	a1.add("hi");
	a1.add(null);
	
	System.out.println(a1);
	//size
	System.out.println("size of list="+a1.size());
	a1.remove(2);
	System.out.println(a1);
	//retrivale
	System.out.println(a1.get(2));
	//replace
	a1.set(2, "welcome");
	System.out.println(a1);
	

}
	
}

