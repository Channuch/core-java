class DrivingLicence{
	
	static  String name;
	static  String lname;
	static String db;
	static long phoneno;
	static boolean isDocumentSubmitted ;
	
	
	
	

    public static boolean newLicence(String fullName , String lastName ,String dob  , long mobilNo , boolean isdocumentSubmitted){
 
     boolean isAccountCreated = false;
	 
	name = fullName;
	lname = lastName;
	db = dob;
	phoneno = mobilNo;
	isDocumentSubmitted = isdocumentSubmitted;
	
	return isAccountCreated ; 
    }
	
    public static void enterInfo (){
		
	
	System.out.println("FULL NAME = "+ name);
	System.out.println("LAST NAME = "+ lname);
	System.out.println("DATE OF BIRTH = "+ db);
	System.out.println("ENTER PHONE NUMBER = "+ phoneno);
	System.out.println("ARE THE DOCUMENT SUBMITTED = "+isDocumentSubmitted);
	System.out.println("Driving Licence Form Filled , Wait For Trial");
	
	}


}