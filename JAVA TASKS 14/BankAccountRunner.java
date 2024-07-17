class BankAccountRunner{

	public static void main(String[] banking){
	
	        System.out.println("Main Started");
			
        BankAccount.credit(2000.00);
        double availableBalance = BankAccount.getBalance();
        System.out.println(availableBalance);
		
        BankAccount.credit(0.00);
        availableBalance = BankAccount.getBalance();
        System.out.println(availableBalance);
		
        BankAccount.debit(7000.00);
        availableBalance = BankAccount.getBalance();
        System.out.println(availableBalance);
		
        BankAccount.credit(6000.00);
        availableBalance = BankAccount.getBalance();
        System.out.println(availableBalance);
		
        BankAccount.credit(2000.00);
        availableBalance = BankAccount.getBalance();
        System.out.println(availableBalance);
		
        BankAccount.debit(10000.00);
        availableBalance = BankAccount.getBalance();
        System.out.println(availableBalance);
		
             System.out.println("Main Ended");
	}



}