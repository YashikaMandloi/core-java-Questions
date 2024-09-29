package ComparableAndCompartorDemo;

import java.util.Comparator;


public class Salary {

	public class salary implements Comparator<ComEmployee>{

		@Override
		public int compare(ComEmployee  o1, ComEmployee  o2) {
			if(o1.salary==o2.salary)
			return 0;
			else if(o1.salary>o2.salary)
				return 1;
			else
				return -1;
		}

	}
}
