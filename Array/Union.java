package linkedlist;

import java.util.HashSet;

public class Union {

	public Union() {
		// TODO Auto-generated constructor stub
		
		HashSet set1=new HashSet(100);
		//HashSet h2=new HashSet(100,(float) 0.90);
		
		//HashSet<Integer> h3=new HashSet<Integer>();
		
		//add
		set1.add(1);
		set1.add(8);
		set1.add(7);
		set1.add(100);
		
		System.out.println("set1="+set1);
		
		set1.add(10);
		set1.add(78);
		System.out.println(set1);
		System.out.println(set1);
		System.out.println(set1.contains('A'));
		System.out.println("size of list="+set1.size());
		set1.remove(2);
		System.out.println(set1);
		
		
		HashSet<Integer> set3 = new HashSet<>(100);
		set3.add(null);
		set3.add(12);
		set3.add(45);
		set3.add(90);
		set3.add(3);
		System.out.println("set3="+set3);
		//union addAll
		set1.addAll(set3);
		System.out.println("Union of set 1 and 2="+set1);
		
		//retain common
		/*set1.retainAll(set2);
		 System.out.println("insertion"+set1);
		 */
		
		//uncommon
		set1.removeAll(set3);
		System.out.println("difference="+set1);
		
		System.out.println(set3);
		set3.remove(3);
	System.out.println(set3);
		System.out.println(set3.isEmpty());
		System.out.println(set3.contains(44));
		System.out.println(set3.size());
	}
}



