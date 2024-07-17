class GoldShop{
  
  static String goldItems[]={null, null, null, null, null, null, null};
  static int index ;
  
  public static boolean creatGoldItem(String item){
    System.out.println("Creat Gold Item Started");
	 boolean isGoldItemCreated = false;
	  if(index < goldItems.length){
	    if(item != null){
		 goldItems[index] = item;
		 index ++;
		 isGoldItemCreated = true;
		}
		else {
		  System.out.println("The Item value Should not be Null !!!!!!!");
		}
	  }
	  else{
	     System.out.println("The Item Are Already Full !!!!!!!!");
	  }
    System.out.println("Creat Gold Item Ended");
   return isGoldItemCreated;
  }
  
  public static void getGoldItems(){
	  System.out.println("The Available Gold Items Are = ");
	  for(String goldItem : goldItems){
		  System.out.println(goldItem);
	  }
  }  
  
  public static boolean updateGoldItem(String oldItem , String newItem){
	  System.out.println("Update Gold item Started");
	   boolean isGoldItemUpdated = false;
	    for(int index =0 ; index <goldItems.length ; index++ ){
			if(oldItem == goldItems[index]){
				goldItems[index] = newItem;
				isGoldItemUpdated = true;
			}
		}
		if(isGoldItemUpdated == false){
			System.out.println(oldItem +" Is Not Available");
		}
	  System.out.println("Update Gold item Ended");
   return isGoldItemUpdated;	  
  }



}