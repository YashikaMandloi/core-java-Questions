package ComparableAndCompartorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ECommain {

	public static void main(String[] args) {
		
		//arrayList
		
				ArrayList<Employee> a1=new ArrayList<Employee>();
				
				//add 
				a1.add(new Employee(20000,"abc"));
				a1.add(new Employee(18000,"xyz"));
				a1.add(new Employee(11000,"pqr"));
				
				//sorting as per age
				Collections.sort(a1,new Salary());
				System.out.println("sorting data by Salary=");
				for (Employee obj : a1) {
					System.out.println(obj.Salary+" "+obj.name);
				}
				//multiple
					Collections.sort(a1,new Name());
					System.out.println("sorting data by name=");
					for (Student obj1 : a1) {
						System.out.println(obj1.Salary+" "+obj1.name);
					
				}
				}
	}


