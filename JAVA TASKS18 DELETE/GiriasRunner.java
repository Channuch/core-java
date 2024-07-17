class GiriasRunner{

	public static void main(String[] addAppliances){
	 boolean addTo = Girias.createHomeAppliances("Water Filter");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Griender");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Refrigerator");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Microwave");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Waching Machine");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Air Conditionar");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Dish Washer");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Heater");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Toster");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Blender");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Coffie Maker");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Vacume cleaner");
	    System.out.println("The Items Added to List = "+ addTo);
		
		addTo = Girias.createHomeAppliances("Heater");
	    System.out.println("The Items Added to List = "+ addTo);
		
		
		Girias.getAppliances();
		 
		boolean updateName = Girias.updateAppliancesNmae("Coffie Maker","Bread Toster");
		  System.out.println("The New Home Appliances Updated in List =" +updateName);
		
		Girias.getAppliances();
		
		boolean delete = Girias.deleteAppliances("Blender");
		  System.out.println("The Item Is Deleted From List = "+delete);
		
	    Girias.getAppliances();
	}


}