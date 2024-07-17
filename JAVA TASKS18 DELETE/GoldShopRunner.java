class GoldShopRunner{
  
  public static void main(String[] goldBusiness){
   
   boolean addItem = GoldShop.creatGoldItem("Gold Chain");
    System.out.println("The Item Is Added To List = "+ addItem);
	
	addItem = GoldShop.creatGoldItem("Gold Bracelet");
    System.out.println("The Item Is Added To List = "+ addItem);
	
	addItem = GoldShop.creatGoldItem("Gold Ring");
    System.out.println("The Item Is Added To List = "+ addItem);
	
	addItem = GoldShop.creatGoldItem("Gold Ear Rings");
    System.out.println("The Item Is Added To List = "+ addItem);
	
	addItem = GoldShop.creatGoldItem("Gold Necklace");
    System.out.println("The Item Is Added To List = "+ addItem);
	
	
	addItem = GoldShop.creatGoldItem("Gold Biscuites");
    System.out.println("The Item Is Added To List = "+ addItem);
	
	addItem = GoldShop.creatGoldItem("Gold Watech");
    System.out.println("The Item Is Added To List = "+ addItem);
	
	GoldShop.getGoldItems();
	
	boolean update = GoldShop.updateGoldItem("Gold Biscuite","Gold Bangles");
	  System.out.println("The New List Is Updated ,,,,,"+update);
	  
	GoldShop.getGoldItems();
	
	boolean delete = GoldShop.deleteGoldItem("Gold Bracelet");
	  System.out.println("The New List Is Updated ,,,,,"+delete);
	
	
	GoldShop.getGoldItems();
    
  }

}
