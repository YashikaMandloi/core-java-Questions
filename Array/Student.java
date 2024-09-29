package ComparableAndCompartorDemo;

public class Student implements Comparable<Student>  {

	//data
	int rollno;
	String name;
	int age;

	//com
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	
	
	public int compareTo(Student o){
		if(age==o.age)
			return 0;
		
		else if(age>o.age)
			return 1;
		
		else return -1;
	}

}
