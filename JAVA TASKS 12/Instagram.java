class Instagram{
	
	static  String name;
	static  String lname;
	static String db;
	static long phoneno;
	static  String mail;
	static String ctrPassword  ;
	static String confPassword ;
	

    public static boolean createAccount(String fullName , String lastName ,String dob  , long mobilNo , String gmail , String password , String cnfPassword){
 
     boolean isAccountCreated = false;
	 
	name = fullName;
	lname = lastName;
	db = dob;
	phoneno = mobilNo;
	mail = gmail;
	ctrPassword  = password ;
	confPassword = cnfPassword ;
	
	return isAccountCreated ;
	 
 }
	
    public static void enterInfo (){
		
	
	System.out.println("FULL NAME = "+ name);
	System.out.println("LAST NAME = "+ lname);
	System.out.println("DATE OF BIRTH = "+ db);
	System.out.println("ENTER PHONE NUMBER = "+ phoneno);
	System.out.println("ENTER = "+ mail);
    System.out.println("CREATE PASSWORD = "+ ctrPassword);
	System.out.println("CONFORM PASSWORD = "+ confPassword);
	System.out.println("Account created Successfully");
	}


}