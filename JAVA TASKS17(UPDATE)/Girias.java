import java.util.*;
class Girias{

   static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
   static int index ;
   
   public static boolean createHomeAppliances(String appliancesName){
       System.out.println("Creat Appliances Started");
	    boolean isHomeAppliancesCreated = false;
		if(index < homeAppliances.length){
		if(appliancesName != null){
		  homeAppliances[index] = appliancesName;
		  index++;
		  isHomeAppliancesCreated = true;
		}
		else{ System.out.println("Null Value Can't be added to list!!!!!!!!");}
		}
		else {System.out.println("The Place is Allready Filled ,,,,,,,,,,,,,,");}
		
       System.out.println("Creat Appliances Ended");
   return isHomeAppliancesCreated ;
   }

	public static void getAppliances(){
		System.out.println("The Available Appliances Are =");
		for(String homeAppliance : homeAppliances){
			System.out.println(homeAppliance);
		}
	}
	
	public static boolean updateAppliancesNmae(String oldName , String newName){
		System.out.println("Upadet Name Started");
		boolean isAppliancesNameUpdated = false;
		for(int index = 0; index<homeAppliances.length ; index++){
			if(oldName == homeAppliances[index]){
				homeAppliances[index] =newName;
				isAppliancesNameUpdated = true;
		}
		}
		if(isAppliancesNameUpdated = false){
			System.out.println(oldName +" Not Found");
		}
		System.out.println("Update Name Ended ");
		return isAppliancesNameUpdated;
	

    }
	
	public static boolean deleteAppliances(String itemToBeDeleted){
		System.out.println("Delete Appliances Started");
		 boolean isApplicationDeleted=false;
		 int newIndex , oldIndex ;
		 for(newIndex = 0, oldIndex=0 ; oldIndex < homeAppliances.length ; oldIndex++){
			 if(homeAppliances[oldIndex]!=itemToBeDeleted){
				 homeAppliances[newIndex]=homeAppliances[oldIndex];
			 newIndex ++;
			 }
			
		 }
		  if(itemToBeDeleted != null) isApplicationDeleted = true;
		   else System.out.println("The Value can't be Null!!!!!!!!");
			 homeAppliances = Arrays.copyOf(homeAppliances ,newIndex );
		 if(isApplicationDeleted == false){
			 System.out.println(itemToBeDeleted+"IS NOT Found !!!!!!!");
		 }
		 
		System.out.println("Delete Appliances Ended");
	return isApplicationDeleted;	
	}
}