package ComparableAndCompartorDemo;

public class Employee {

	//data
		int id;
		String name;
		int salary;

		//com
		Employee(int rollno,String name,int age){
			this.id=id;
			this.name=name;
			this.salary=salary;
			
		}
		
		public int compareTo(Employee o){
			if(salary==o.salary)
				return 0;
			
			else if(salary>o.salary)
				return 1;
			
			else return -1;
		}
}
