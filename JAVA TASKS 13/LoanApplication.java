class LoanApplication{
		
		static String bankNameIs ;
		static long accountNo ;
		static int creditscr;
		static double intrest;
		static String typeOfLoan;

public static boolean applyLoan(String bankName ,long bankAccountNo , int creditScore , double rateOfIntrest ,String loanType){

	boolean isloanApplicable = false;
	boolean isBankNameValid = false;
	boolean isBankAccountValid = false;
	boolean isCreditScoreVald = false;
	boolean isRateOfIntrestValid = false;
	boolean isLoanTypeValid = false;
	
	if(bankName != null){
		bankNameIs = bankName;
		isBankNameValid= true;
	}
	else{
		System.out.println("PLEASE PROVIDE VALID NAME !!!!");
	}
	if(bankAccountNo > 0 ){
		accountNo = bankAccountNo;
		isBankAccountValid = true ;
	}
	else{
		System.out.println("ACCOUNT NUMBER NOT VALID !!!!!");
	}
	if(creditScore > 650){
		creditscr= creditScore;
		isCreditScoreVald = true;
	}
	else{
		System.out.println("TO APPLY THE LOAN YOUR CREDIT SCORE MUST BE MORE THAN 650 !!!!!");
	}
	if(rateOfIntrest > 1.5){
		intrest=rateOfIntrest;
		isRateOfIntrestValid = true ;
	}
	else{
		System.out.println("THE BANK HAS THE MINIMUM INTREST OF 1.5");
	}
	if(loanType!=null){
		typeOfLoan=loanType;
		isLoanTypeValid = true;
	}
	else{
		System.out.println("PLEASE ENTER VALID DATA !!!!!");
	}
	if(isBankNameValid && isBankAccountValid && isCreditScoreVald && isRateOfIntrestValid && isLoanTypeValid){
	isloanApplicable= true;
	}
	
	return isloanApplicable;
}
	
	public static void getinfo(){
	
	 System.out.println("BANK NAME = "+bankNameIs);
	 System.out.println("ENTER ACCOUNT = "+accountNo);
	 System.out.println("ENTER YOUR CREDIT SCORE = "+creditscr);
	 System.out.println("RATE OF INTREST = "+intrest);
	 System.out.println("ENTER LOAN TYPE = "+typeOfLoan);
	 
	}
	 
}