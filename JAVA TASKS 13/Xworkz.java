class Xworkz{
 
 static String nameIs;
 static long phoneNo;
 static String email;
 static String clg;
 static String qualificationis;
 static String addressis;

	public static boolean registar (String name , long moblieNo , string gmail , String colleg, String qualification , String address){
		
		boolean isRegistarComplit = false;
		boolean isNameValid = false;
		boolean isPhoneNumberVaid = false;
		boolean isGmailValid= false;
		boolean isCollegNameValid = false;
		boolean isQualificationValid = false;
		boolean isAddressValid = false;
		
		if(name != null){
			nameIs = name;
			isNameValid = true;
		}else{
			System.out.println("Enter A Valid Name !!!!!!!!");
		}
		if(moblieNo > 0){
			phoneNo = moblieNo;
			isPhoneNumberVaid = true;
		}else{
			System.out.println("Phone Number Is Not Valid !!!!!!!");
		}
		if(gmail != null){
			email=gmail;
			isGmailValid=true;
		}else{
			System.out.println("Gmail Is not Valid !!!!!!!!!!!!");
		}
		if(colleg != null){
			clg=colleg;
			isCollegNameValid = true;
		}else{
			System.out.println("Colleg name is not valid !!!!!!!!!");
		}
		if(quqlification != null){
			qualificationis=qualification;
			isQualificationValid=true;
		}else{
			System.out.println("Qualification is Not Vaslid !!!!!");
		}
		if(address!= null){
			addressis=addressis;
			isAddressValid = true;
		}
		else{
			System.out.println("Address is not vallid !!!!!!!");
		}
		if(isAddressValid && isCollegNameValid && isGmailValid && isNameValid && isPhoneNumberVaid && isQualificationValid){
			isRegistarComplit = true;
		}
		return isRegistarComplit;
	}
	 
	 public static void gatherInfo(){
		 System.out.println("Full name is  = "+nameIs);
		 System.out.println("Phone Number is = "+phoneNo);
		 System.out.println("Enter Gmail = "+email);
		 System.out.println("Colleg Name = "+clg);
		 System.out.println("Qualification = "+qualificationis);
		 System.out.println("Address = "+addressis);
	 }

}
  
  



}