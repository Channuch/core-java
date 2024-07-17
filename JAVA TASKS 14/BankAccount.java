class BankAccount{

	static double balance ;
	
	
	public static void debit(double ammount){
	  System.out.println("Debit Started");
	  if(ammount <= balance)
		balance = balance - ammount;
	  else
		  System.out.println("Insufficient balance");
	  System.out.println("Debit Ended");
	
	return ;
	}
	
	
	public static void credit(double ammount){
	  System.out.println("Credit Started");
	  if(ammount> 0.0){
		balance = balance + ammount;
	  }else{
		  System.out.print("Amount can't be zero");
	  }
	  System.out.println("Credit Ended");
		
	return ;	
	}
	
	public static double getBalance(){
		System.out.println("Factching Balance,,,,,,,,,,,,,");
		return balance;
	}



}