package Mul;

public class Main {
	
	class College {
	    String collegeName;

	    public College(String collegeName) {
	        this.collegeName = collegeName;
	    }

	   
	    public void displayCollegeName() {
	        System.out.println("College Name: " + collegeName);
	    }
	}

	
	class MCA extends College {
	    String deptName;

	    
	    public MCA(String collegeName, String deptName) {
	        super(collegeName); // Initialize base class
	        this.deptName = deptName;
	    }

	    public void displayDeptName() {
	        System.out.println("Department Name: " + deptName);
	    }
	}

	
	class BtechComp extends MCA {

		public BtechComp(String collegeName, String deptName) {
	        super(collegeName, deptName); // Initialize base class MCA
	    }

	    
	    public void displayBtechDetails() {
	        displayCollegeName(); // From College class
	        displayDeptName();    // From MCA class
	        System.out.println("Course: B.Tech Computer Science");
	    }
	}

	
	public class Main {
	    public static void main(String[] args) {
	      
	        BtechComp btech = new BtechComp("NRI College", "Computer Science");

	        
	        btech.displayBtechDetails();
	    }
	}

}
