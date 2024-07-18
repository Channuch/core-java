class NewsPaper{
	
	String brandName;
	int brandId ;
	double price;
	int noOfPages;
	String language;
	
	public boolean create(String brandName,int brandId ,double price,int noOfPages,String language){
		System.out.println("Create Started");
		
		 boolean isNewsPaperCreated = false;
		   boolean isBrandNameValid = false;
		     boolean isBrandIdValid = false;
		       boolean isPriceValid = false;
		   boolean isNoOfPagesValid = false;
		    boolean islangaugeValid = false;
		 
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
		 
		 if(noOfPages > 0){
			 this.noOfPages = noOfPages; 
			 isNoOfPagesValid = true;
		 }else System.out.println("Mention Valid Pages Availables"); 
		 
		 if(language != null){
			this.language = language;  
			islangaugeValid = true;
		 }else System.out.println("Provide Valid Language");
		 if(isBrandNameValid && isBrandIdValid && isPriceValid && isNoOfPagesValid && islangaugeValid){
			 isNewsPaperCreated = true;
		 }     
		System.out.println("Create Ended");
	return isNewsPaperCreated;	
	}
	
	
	public void displayInfo(){
		System.out.println("+++++++++++++++++++++++++++++++The Display Info Started ++++++++++++++++++++++++++++++++++++");
		    System.out.println("The NewsPaper Name is :"+this.brandName);
            System.out.println("The NewsPaper Id is :"+this.brandId);
            System.out.println("The Price Is :"+this.price);
            System.out.println("The Number Of Pages Are :"+this.noOfPages);
            System.out.println("The Paper Language is :"+this.language);
		System.out.println("++++++++++++++++++++++++++++++++The Display Info Ended ++++++++++++++++++++++++++++++++++++++");
		
	}
}