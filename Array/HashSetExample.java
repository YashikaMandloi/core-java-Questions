package linkedlist;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	HashSet h1=new HashSet(100);
	//HashSet h2=new HashSet(100,(float) 0.90);
	
	//HashSet<Integer> h3=new HashSet<Integer>();
	
	//add
	h1.add(1);
	h1.add(8);
	h1.add(7);
	h1.add(100);
	
	System.out.println(h1);
	
	h1.add(10);
	h1.add(78);
	System.out.println(h1);
	System.out.println(h1);
	System.out.println(h1.contains('A'));
	System.out.println("size of list="+h1.size());
	h1.remove(2);
	System.out.println(h1);
	
	
	HashSet<Integer> h3 = new HashSet<>(100);
	h3.add(null);
	h3.add(12);
	h3.add(45);
	h3.add(90);
	h3.add(3);
	System.out.println(h3);
	h3.remove(3);
System.out.println(h3);
	System.out.println(h3.isEmpty());
	System.out.println(h3.contains(44));
	System.out.println(h3.size());
}

	}


