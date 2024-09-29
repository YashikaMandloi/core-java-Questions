package string;

public class excep {
public static void main(String args[]) {
	try {
		int a=100/0;
		System.out.println(a);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	finally {
	System.out.println("all connection are closed...");
	System.out.println("rest of code...");
	}
	System.out.println("rest of code...");
}
}
