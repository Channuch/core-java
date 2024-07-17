class LoanApplicationRunner{

	public static void main(String[] applyLoan){
			
			
		boolean isloanApplicable = LoanApplication.applyLoan(null,239598580966L,760,3.0,"Vehicle Loan");
			
		if(isloanApplicable == true ){
		LoanApplication.getinfo();
		}else{
			System.out.println("Provided Detaisl not found");
		}
	}
		
			
			
			
			
			
			












}