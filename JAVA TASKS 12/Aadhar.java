class Aadhar{
	
	static  String name;
	static  String lname;
	static String db;
	static long phoneno;
	static String addresss ;
	

    public static boolean newAadhar(String fullName , String lastName ,String dob  , long mobilNo , String address ){
 
     boolean isAadharcreated = false;
	 
	name = fullName;
	lname = lastName;
	db = dob;
	phoneno = mobilNo;
	addresss = address ;
	
	return isAadharcreated ;
	 
 }
	
    public static void personDetails(){
		
	
	System.out.println("FULL NAME = "+ name);
	System.out.println("LAST NAME = "+ lname);
	System.out.println("DATE OF BIRTH = "+ db);
	System.out.println("ENTER PHONE NUMBER = "+ phoneno);
	System.out.println("ENTER PERMANENT ADDRESS = "+ addresss);
	System.out.println("AADHAR created Successfully");
	}


}