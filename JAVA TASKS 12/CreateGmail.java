class CreateGmail{
	
	static  String nme;
	static  String ln;
	static  char g;
	static String db;
	static long pono;
	static String ctrPassword  ;
	static String confPassword ;
	

    public static boolean createAccount(String name , String lastName ,char gender , String dob  , long mobilNo , String password , String cnfPassword){
 
     boolean isFormFilled = false;
	 
	nme = name;
	ln = lastName;
	g = gender;
	db = dob;
	pono = mobilNo;
	ctrPassword  = password ;
	confPassword = cnfPassword ;
	
	return isFormFilled ;
	 
 }
	
    public static void getinfo(){
	
	System.out.println("FULL NAME = "+ nme);
	System.out.println("LAST NAME = "+ ln);
	System.out.println("GENDER = "+ g);
	System.out.println("DATE OF BIRTH = "+ db);
	System.out.println("ENTER PHONE NUMBER = "+ pono);
    System.out.println("CREATE PASSWORD = "+ ctrPassword);
	System.out.println("CONFORM PASSWORD = "+ confPassword);
	
	}


}