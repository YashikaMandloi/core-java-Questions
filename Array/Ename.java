package ComparableAndCompartorDemo;

import java.util.Comparator;


public class Ename {

	public class Name implements Comparator<ComEmployee> {

		@Override
		public int compare(ComEmployee  o1, ComEmployee  o2) {
			//this method is from string class
			return o1.name.compareTo(o2.name);
		}

	}
}
