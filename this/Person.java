
package per;

public class Person {
	
	    private int age;

	    public Person(int age) {
	        this.age = age;
	    }

	    public void checkEligibility() {
	        if (age <= 24) {
	            System.out.println("The person is eligible.");
	        } else {
	            System.out.println("The person is not eligible.");
	        }
	    }

	    public static void main(String[] args) {
	        Person person1 = new Person(22);
	        Person person2 = new Person(25);

	        person1.checkEligibility(); // Output: The person is eligible.
	        person2.checkEligibility(); // Output: The person is not eligible.
	    }
	}


