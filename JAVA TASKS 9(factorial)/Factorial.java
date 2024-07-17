class Factorial{
	
	
	//purpose
	public static int getFact( int getFactNum){
		System.out.println("The Fact mathod Started");
	int fact = 1;
		for (int num=1 ; num<=getFactNum ; num++){
			fact = num*fact;
	}
			
		System.out.println("The Fact mathod Ended");

	return fact ;

}


}