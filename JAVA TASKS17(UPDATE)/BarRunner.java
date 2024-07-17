class BarRunner{

   public static void main(String[] brands){
    
	boolean names = Bar.addWineBrands("Old Monk");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Magic Moment");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("JOhny Walker");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	 names = Bar.addWineBrands("Signature");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Black & White");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Black Dog");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	 names = Bar.addWineBrands("Imperial Blue");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Royal Stage");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Red lable");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Black Lable");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	   names = Bar.addWineBrands("Oxygen");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Old Traves");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("OC");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Bag Paper");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  names = Bar.addWineBrands("Kf Strong");
	  System.out.println("Wine Brand is Added to List = "+names);
	  
	  Bar.getAllBrands();
	  
	 boolean update = Bar.updateWineBrand("OC" ,"Budwiser");
	  System.out.println("Brand List is updated = "+update);
   
     Bar.getAllBrands();
	 
	 boolean delete = Bar.deleatBrand("Old Traves");
	  System.out.println("The Brand is removed From List = "+delete);
	  
	  Bar.getAllBrands();
   }


}