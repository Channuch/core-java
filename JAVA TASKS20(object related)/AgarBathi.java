class AgarBathi{
	
	String brandName;
	int brandId ;
	double price;
	String fragrance;
	int noOfStic;
	
	public boolean creatAgarBathi(String brandName,int brandId ,double price,String fragrance,int noOfStic){
		System.out.println("Creat Agarbathi Started");
		 boolean isAgarBathiCreated = false;
		 boolean isBrandNameValid = false;
		 boolean isBrandIdValid = false;
		 boolean isPriceValid = false;
		 boolean isFragrenceGood = false;
		 boolean isNoOfStickValid = false;
		 
		 if(brandName != null){
			 this.brandName = brandName;
			 isBrandNameValid = true;
		 }else System.out.println("Please Provide Valid brandName");
		 
		 if(brandId > 0){
			this.brandId = brandId;
			isBrandIdValid = true;
		 }else System.out.println("Please Provide Valid Brand Id");
		 
		 if(price > 0.0){
			this.price = price;
            isPriceValid = true;			
		 }else System.out.println("Price is Not Valid"); 
		 
		 if(fragrance != null){
			 this.fragrance = fragrance; 
			 isFragrenceGood = true;
		 }else System.out.println("Mention Valid Fragrence"); 
		 
		 if(noOfStic > 0){
			this.noOfStic = noOfStic;  
			isNoOfStickValid = true;
		 }else System.out.println("Number Of Sticks Not Valid");
		 if(isBrandNameValid && isBrandIdValid && isPriceValid && isFragrenceGood && isNoOfStickValid){
			 isAgarBathiCreated = true;
		 }     
		System.out.println("Creat Agarbathi Ended");
	return isAgarBathiCreated;	
	}
	
	
	public void displayInfo(){
		System.out.println("+++++++++++++++++++++++++++++++The Display Info Started ++++++++++++++++++++++++++++++++++++");
		    System.out.println("The Brand Name Is :"+this.brandName);
            System.out.println("The Agar Bathi Id is :"+this.brandId);
            System.out.println("The Brand Price is :"+this.price);
            System.out.println("The Fragrance is :"+this.fragrance);
            System.out.println("The Number of sticks Packet has :"+this.noOfStic);
		System.out.println("++++++++++++++++++++++++++++++++The Display Info Ended ++++++++++++++++++++++++++++++++++++++");
		
	}
}