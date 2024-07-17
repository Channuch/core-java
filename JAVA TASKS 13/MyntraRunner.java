class MyntraRunner{
public static void main (String [] information){

        boolean isAccountCreatedSuccessfully = Myntra.createAccount ("Channaveer" , 9632084956L , "channu1123@gmail.com" , "Channu69" , "RS colony near humnabad ring road Kalaburgi" , 585104);

           if(isAccountCreatedSuccessfully = true){
			   Myntra.getInfo();
			   
		   }else{
			   
			   System.out.println("The Provided Data Is Not Founded");
		   }
             

}
}