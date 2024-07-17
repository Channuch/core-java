class Passport{
	 
	static String userName;
	static String userLastName;
	static long phoneNo;
	static char gen;
	static String sta;
	static String entEmail;
	static String cnfEmail;
	static String crtPassword;
	static String cnfPassword;
	static String curAddress;
	static int pc;
	
	 
	 public static boolean creatPassport(String name , String lastName , long mobNo , char gender , String status ,String email , String cnfmEmail ,String password,String cnfmPassword,String address , int pinCod ){
						boolean isPassportDataCreated = false;
						
				if(name != null && lastName != null && mobNo >= 0 && gender != ' ' && status != null && email != null && cnfmEmail!= null && password != null && cnfmPassword != null && address != null && pinCod >= 0 )
				{ 
				
				            userName = name;
						userLastName = lastName;
                           phoneNo   = mobNo;
						       gen   = gender;
						         sta = status;
						    entEmail = email;
						    cnfEmail = cnfmEmail;
						 crtPassword = password;
						 cnfPassword = cnfmPassword;
						  curAddress = address;
						          pc = pinCod;
	           isPassportDataCreated = true;
				}
				else {
	                        System.out.println ("Please Provide Valid Name / Last Name / Mobile No / Gender / Status / Email / Password / Address / Pincode ");
                }						
					
		return isPassportDataCreated;
	}
	
	public static void getDetails(){
		
		System.out.println("Name :- " +userName);
		System.out.println("Last Name :- "+ userLastName);
		System.out.println("Mobile No :- "+ phoneNo);
		System.out.println("Gender :- "+ gen);
		System.out.println("Status :- "+ sta);
		System.out.println("Enter E-Mail :- "+ entEmail);
		System.out.println("Conform E-Mail :- "+ cnfEmail);
		System.out.println("Creat Password :- "+ crtPassword);
		System.out.println("Conform Password :- "+ cnfPassword);
		System.out.println("Enter Current Address :- "+ curAddress);
		System.out.println("Enter PinCode :- "+ pc);
		
	}





}