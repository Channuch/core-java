class Myntra{

        static String nameIs;
        static long mobileNumberIs;
        static String emailIs;
        static String passWordIs;
        static String addressIs;
        static int pinCodeIs;



public static boolean createAccount(String name , long mobileNumber , String email , String passWord , String address , int pinCode ){


         boolean isAccountCreatedSuccessfully = false;
         boolean isValidName = false;
         boolean isValidMobileNumber = false;
         boolean isValidEmail =  false;
         boolean isValidPassWord = false;
         boolean isValidAddress = false;
         boolean isValidPincode = false;

             if(name!= null){
				 nameIs = name;
				 isValidName = true;
				 
			 }else{
				 System.out.println("Plase Provide Valid Name ");
			 }
			  if(mobileNumber > 0){
				 mobileNumberIs = mobileNumber;
				 isValidMobileNumber = true;
				 
			 }else{
				System.out.println("Please Provide Valid Mobile Number"); 
			 }
			  if(email!= null){
				  emailIs = email;
				  isValidEmail = true;
				  
			 }else{
				 System.out.println("Please Provide Valid Email");
			 }
			  if(passWord!= null){
				 passWordIs = passWord;
				 isValidPassWord = true;
				 
			 }else{
				 System.out.println("Please Provide Valid PassWord");
			 }
			  if(address!= null){
				  addressIs = address;
				  isValidAddress = true;
				 
			 }else{
				 System.out.println("Please Provide Valid Address");
			 }
			  if(pinCode > 0){
				  pinCodeIs = pinCode;
				  isValidPincode = true;
				 
			 }else{
				System.out.println("Please Provide Valid Pincode"); 
			 }
			 if(isValidName && isValidMobileNumber && isValidEmail && isValidPassWord && isValidAddress && isValidPincode){
				 isAccountCreatedSuccessfully = true;
				 
			 }

                  return isAccountCreatedSuccessfully;

}
               public static void getInfo(){
				   
				System.out.println("The Name Is = " + nameIs);   
				System.out.println("The Mobile NO is = " + mobileNumberIs);   
				System.out.println("The Email Is = " + emailIs);   
				System.out.println("The PassWord Is = " + passWordIs);   
				System.out.println("The Address Is = " + addressIs);   
				System.out.println("The Pincode Is = " + pinCodeIs);   
				   
				   
				   
			   }

}