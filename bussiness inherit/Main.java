package anv;

//Parent class
class Business_In_India {
 String businessName;

 public Business_In_India(String businessName) {
     this.businessName = businessName;
 }

 public void showBusinessInfo() {
     System.out.println("Business Name: " + businessName);
 }
}

//Child class 1
class Local_Business extends Business_In_India {
 String localLicense;

 public Local_Business(String businessName, String localLicense) {
     super(businessName);
     this.localLicense = localLicense;
 }

 public void showLocalInfo() {
     showBusinessInfo();
     System.out.println("Local License: " + localLicense);
 }
}

//Child class 2
class International_Business extends Business_In_India {
 String internationalLicense;

 public International_Business(String businessName, String internationalLicense) {
     super(businessName);
     this.internationalLicense = internationalLicense;
 }

 public void showInternationalInfo() {
     showBusinessInfo();
     System.out.println("International License: " + internationalLicense);
 }
}

//Main class to test the hierarchy
public class Main {
 public static void main(String[] args) {
     Local_Business localBiz = new Local_Business("LocalMart", "L1234");
     localBiz.showLocalInfo();

     System.out.println();

     International_Business internationalBiz = new International_Business("GlobalCorp", "I5678");
     internationalBiz.showInternationalInfo();
 }
}


