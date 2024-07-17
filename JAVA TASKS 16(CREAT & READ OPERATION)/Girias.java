class Girias{

   static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
   static int index ;
   
   public static boolean createHomeAppliances(String appliancesName){
       System.out.println("Creat Appliances Started");
	    boolean isHomeAppliancesCreated = false;
		if(appliancesName != null){
		  homeAppliances[index] = appliancesName;
		  index++;
		  isHomeAppliancesCreated = true;
		}else System.out.println("Null Value Can't be added to list!!!!!!!!");
       System.out.println("Creat Appliances Ended");
   return isHomeAppliancesCreated ;
   }

	public static void getAppliances(){
		System.out.println("The Available Appliances Are =");
		for(String homeAppliance : homeAppliances){
			System.out.println(homeAppliance);
		}
	}

}