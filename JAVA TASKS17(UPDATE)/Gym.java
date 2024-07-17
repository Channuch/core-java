import java.util.*;
class Gym{
	
	static String gymEquipments[] = {null , null, null, null, null, null, null, null};
	static int index ;
	
	public static boolean creatGymEquipment(String equipment){
	 System.out.println("Creat Gym Equipments Started");
	 boolean isGymEquipmentsCreated = false;
	 if(index < gymEquipments.length){
	   if(equipment != null){
		gymEquipments[index]  = equipment;
		index++ ;
		isGymEquipmentsCreated = true;
	   }
	    else {
		 System.out.println("Equipment name cant be null !!!!!");
	    }
	 }
	 else{
		 System.out.println("Equipments are allready full ,,,,,,,,");
	 }
	  
	 System.out.println("Creat Gym Equipments Ended");
	
	
	 return isGymEquipmentsCreated ;
	}
	
	public static void getGymEquipments(){
		
		System.out.println("The Available Gym Equipments Are =");
		for(String gymEquipment : gymEquipments){
			System.out.println(gymEquipment);
		}
	}
	
	public static boolean updateGymEquipment(String oldEquipment, String newEquipment){
		System.out.println("Update Gym Equipment Started");
		boolean isEquipmentUpdated = false;
		for(int index = 0; index<gymEquipments.length ; index++){
			if(oldEquipment == gymEquipments[index]){
				gymEquipments[index] = newEquipment;
				isEquipmentUpdated = true;
			}
		}
		if(isEquipmentUpdated == false){
			System.out.println(oldEquipment +" Not Found");
		}
		System.out.println("Update Gym Equipment Ended");
	return isEquipmentUpdated ;	
	}
	
	public static boolean deleteEquipment(String equipmentTodelete){
		System.out.println("Delete Equipment started");
		boolean isEquipmentDeleted = false;
		int newIndex , oldIndex ;
		for(newIndex = 0 , oldIndex = 0 ; oldIndex < gymEquipments.length ; oldIndex++ ){
			if(equipmentTodelete!= gymEquipments[oldIndex]){
				gymEquipments[newIndex]= gymEquipments[oldIndex];
				newIndex++;
			}
		}
		   gymEquipments = Arrays.copyOf(gymEquipments , newIndex);
		    if(equipmentTodelete != null){
			 isEquipmentDeleted = true;
		    }
		      if(isEquipmentDeleted == false){
			   System.out.println(equipmentTodelete+" is Not Found");
		      }
		
		 System.out.println("Delete Equipment Ended");
	 return isEquipmentDeleted;	
	}


}