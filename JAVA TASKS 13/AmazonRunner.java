class AmazonRunner{
 
 public static void main(String[] login){
	 
	 boolean isAccountCreated = Amazon.creatAccount("Shivakumar",9654377145L,"shivu@gmail.com","Aland chockPost Ramtirtth Kalaburgi  ",2456);
	 
	 if(isAccountCreated==true){
		 Amazon.details();
	 }
	 else{
		 System.out.println("Details Not Found");
	 }
 }



}