class MobileStore{
		static String shopName= "HIGHTECH MOBILES";
		static String phoneBrands[] = {null , null ,null, null ,null ,null};
		static int index ;
		static double brandprices[] = {0.0 ,0.0 ,0.0 ,0.0, 0.0};

	public static boolean addBrands(String brandName){
		System.out.println("Add Brand Name Started");
		boolean isBrandNameAdded=false;
		if(brandName != null){
		        phoneBrands[index] = brandName;
				index++ ;
				isBrandNameAdded = true;
		}else{
			System.out.println("Brand Name Can't Be null !!!!!!!");
		}

		System.out.println("Add Brand Name Ended");
	       

	return isBrandNameAdded;
	}
	
		public static boolean addPrice(double prices){
			System.out.println(" Add prices is Started");
			boolean isPriceAdded = false;
			if(prices > 0.0){
				brandprices[index]   = prices; 
				index++ ;
			 isPriceAdded = true;
			}else System.out.println("The Priveded  price Value not correct !!!!!!!!");
			System.out.println("Add prices is Ended");
			return isPriceAdded ;
		}

	 public static void getDetails(){

	   System.out.println("The Available Mobile Are :-");
	   for(String phoneBrand : phoneBrands)
	   System.out.println(phoneBrand);
	   
	 }

}