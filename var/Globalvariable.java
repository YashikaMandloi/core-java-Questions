package global;

public class Globalvariable {
	
	    private int x; // instance variable

	    public MyClass(int val) {
	        x = val;
	    }

	    public void printX() {
	        System.out.println("x: " + x);
	    }

	    public void changeX(int newVal) {
	        x = newVal;
	    }

	    public static void main(String[] args) {
	        MyClass obj1 = new MyClass(10);
	        obj1.printX(); // prints "x: 10"

	        obj1.changeX(20);
	        obj1.printX(); // prints "x: 20"

	        MyClass obj2 = new MyClass(30);
	        obj2.printX(); // prints "x: 30"
	    }
	}
}
