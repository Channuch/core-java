class MobileStoreRunner{

	public static void main(String[] addBrands){
		boolean adds = MobileStore.addBrands("Samsung");
		  System.out.println("The Brand Name is Added = "+adds);
	    adds = MobileStore.addBrands("Google Pixel");
		  System.out.println("The Brand Name is Added = "+adds);
		adds = MobileStore.addBrands("Xiomi");  
		  System.out.println("The Brand Name is Added = "+adds);
		adds = MobileStore.addPrice(25000.00);
		  System.out.println("The Brand Prices Added = "+ adds);
		adds = MobileStore.addPrice(3200.00);
		  System.out.println("The Brand Prices Added = "+ adds);
		MobileStore.getDetails();
	}



}