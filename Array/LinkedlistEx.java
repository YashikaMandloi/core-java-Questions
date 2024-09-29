package linkedlist;

import java.util.*;

public class LinkedlistEx {
	
		public static void main(String[] args) {
			LinkedList<Integer> l1=new LinkedList<>();
			l1.add(1);
			l1.add(8);
			l1.add(7);
			l1.add(100);
			System.out.println(l1);
			
			l1.addFirst(10);
			l1.addLast(78);
			System.out.println(l1);
			l1.removeFirst();
			System.out.println(l1);
			l1.removeLast();
			System.out.println(l1);
			System.out.println(l1);
			//size
			System.out.println("size of list="+l1.size());
			l1.remove(2);
			System.out.println(l1.get(2));
			//replace
			
			
			
		}
	}