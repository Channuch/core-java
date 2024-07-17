class BankAccount{
	
	static String nme ;
	static String mn ;
	static String ln ;
	static char g ;
	static String db ;
	static int ag  ;
	static String oqpn  ;
	static long pono  ;
	static boolean isAdhar  ;
	static String addrs ;

    public static boolean createAccount(String name , String middleName , String lastName ,char gender , String dob , int age , String occupation, long mobilNo ,boolean isAddharsubmitted , String address){
 
     boolean isFormFilled = false;
	 
	nme = name;
	mn = middleName;
	ln = lastName;
	g = gender;
	db = dob;
	ag = age;
	oqpn = occupation;
	pono = mobilNo;
	isAdhar = isAddharsubmitted;
	addrs = address;
	
	return isFormFilled ;
	 
 }
	
    public static void getinfo(){
	
	System.out.println("FULL NAME = "+ nme);
	System.out.println("MIDDLE NAME = "+ mn);
	System.out.println("LAST NAME = "+ ln);
	System.out.println("GENDER = "+ g);
	System.out.println("DATE OF BIRTH = "+ db);
	System.out.println("AGE = "+ ag);
	System.out.println("OCCUPATION = "+ oqpn);
	System.out.println("ENTER PHONE NUMBER = "+ pono);
	System.out.println("IS ADHAR SUBMITTED = "+ isAdhar);
	System.out.println("PERMANENT ADDRESS = "+ addrs);
	
	}


}