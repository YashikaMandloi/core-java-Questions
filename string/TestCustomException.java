package string;

 class UserException extends Exception {
	 UserException(String msg){
		 //call parent class
	super(msg);
	 }
	}

public class TestCustomException{
	
	//method
	static void vaildAge(int age) throws UserException{
		if(age<18) {
			//throws
			throw new UserException("person is vaild");
		}
		else {
			System.out.println("welcome to vote");
		}
	}

	public static void main(String args[]) {
try {
		//method call	
	vaildAge(20);
		}catch(UserException e) {
System.out.println("exception occured");
	}
	}
}
	

