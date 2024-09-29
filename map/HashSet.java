package MapInterface;

import java.util.HashMap;


public class HashSet {

	public static void main(String[] args) {
		HashMap<Integer,String>hs=new HashMap();
		
		hs.put(null, "raya");
		hs.put(1,"aashish");
		hs.put(2, "manish");
		hs.put(3,"vivek");
		hs.put(4,"roma");
		System.out.println(hs.get(null));
		hs.remove(3);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.containsKey(1));
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		
		System.out.println("Using put method:-"+hs);
		hs.get(2);
		System.out.println("Using get method:-"+hs);
		
		hs.remove(3);
		System.out.println("using remove method:-"+hs);
		
		System.out.println(hs.containsKey(1));
		
	}
	}

