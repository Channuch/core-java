class Amazon{
 
 static String nameIs;
 static long phoneNo;
 static String email;
 static String address;
 static int creatId;

	public static boolean creatAccount(String name , long mobileNo ,String gmail,String currentAddress,int loginId){
		
		boolean isAccountCreated = false;
		boolean isNameValid = false;
		boolean isPhoneNoValid = false;
		boolean isGmailValis = false;
		boolean isAddressValid = false;
		boolean isLoginIdValid = false;
		
		if(name != null){
			nameIs=name;
			isNameValid=true;
		}else{
			System.out.println("Enter a Valid Name");
		} 
		if(mobileNo >0){
			phoneNo=mobileNo;
			isPhoneNoValid = true;
		}else{
			System.out.println("Mobil Number Is Not Valid");
		}
		if(gmail != null){
			email=gmail;
			isGmailValis = true;
		}else{
			System.out.println("Not A valid G-Mail");
		}
		if(currentAddress != null){
			address=currentAddress;
			isAddressValid=true;
		}else{
			System.out.println("Please Provide Valid Address ");
		}
		if(loginId > 0){
			creatId=loginId;
			isLoginIdValid=true;
		}else{
			System.out.println("Login Id Not Found");
		}
		if(isNameValid && isPhoneNoValid && isGmailValis && isAddressValid && isLoginIdValid){
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
	 
	 public static void details(){
		 System.out.println("Enter Name = "+nameIs);
		 System.out.println("Enter Phone Number = "+phoneNo);
		 System.out.println("Enter Email = "+email);
		 System.out.println("Enter  Current Address = "+address);
		 System.out.println("Enter a Login Id = "+creatId);
		 
	 }

}