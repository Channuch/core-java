class Hospital{
 
 static String nameIs;
 static char genderis;
 static int ageis;
 static long phoneNo;
 static String bloodType;
 static String addressis;

	public static boolean registarPatient(String name,char gender,int age,long mobileNo,String bloodGroup,String address){
		
		boolean isPatientRegistedSuccess = false;
		boolean isPatientNamevalid = false;
		boolean isPatientGenderValid = false;
		boolean isPatientAgeValid = false;
		boolean isPatientPhoneNumberValid = false;
		boolean isPatientBloodtypeValid = false;
		boolean isPatientAddressValid = false;
		
		if(name != null){
			nameIs =  name;
			isPatientNamevalid = true;
		}else{
			System.out.println("Please Provide Valid Name");
		}
		if(gender != ' '){
			genderis = gender;
			isPatientGenderValid = true;
		}else{
			System.out.println("Please Provide Valid Gender");
		}
		if(age > 0){
			ageis = age ;
			isPatientAgeValid = true;
		}else{
			System.out.println("Please Provide valid Age Details ");
		}
		if(mobileNo > 0){
			phoneNo = mobileNo ;
			isPatientPhoneNumberValid = true;
		}else{
			System.out.println("The Phone Number is Not Valid");
		}
		if(bloodGroup != null){
			bloodType = bloodGroup;
			isPatientBloodtypeValid = true;
		}else{
			System.out.println("Blood Group Not Found");
		}
		if(address != null){
			addressis = address ;
			isPatientAddressValid = true;
		}else{
			System.out.println("Address Not Found , Please Provid Valid Address");
		}
		if(isPatientNamevalid && isPatientAgeValid && isPatientGenderValid && isPatientPhoneNumberValid && isPatientBloodtypeValid && isPatientAddressValid){
			isPatientRegistedSuccess = true;
		}
		return isPatientRegistedSuccess;
	}
	 
	 public static void patientInfo(){
		 System.out.println("Patient Name is = "+ nameIs);
		 System.out.println("Patient Gender is = "+ genderis);
		 System.out.println("Patient Age is  = "+ageis);
		 System.out.println("Mobile Number = "+phoneNo);
		 System.out.println("Patient Blood Type = "+bloodType);
		 System.out.println("Patient Address  = "+addressis);
	 }

}





