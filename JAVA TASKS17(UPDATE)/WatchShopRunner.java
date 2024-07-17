class WatchShopRunner{

   public static void main(String[] brandsCollection){
    
	boolean names = WatchShop.addWatchBrandName("Casio");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("TAG Heuer");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("Blancpain");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("Vacheron Constantin");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("Breitling");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("Cartier");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	 names = WatchShop.addWatchBrandName("Jaeger-LeCoulter");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("Audemars Piguet");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("Baume & Mercier");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  names =  WatchShop.addWatchBrandName("Chopard");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	   names = WatchShop.addWatchBrandName("Glashutte Original");
	  System.out.println("Watch Brand is Added to List = "+names);
	  
	  WatchShop.getAllWatchBrands();
	  
	 boolean update = WatchShop.updateWatchBrand("Jaeger-LeCoulter" ,"HMT");
	  System.out.println("Watch List is updated = "+update);
   
     WatchShop.getAllWatchBrands();
   }


}