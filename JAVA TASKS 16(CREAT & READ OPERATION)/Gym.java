class Gym{
	
	static String gymEquipments[] = {null , null, null, null, null, null, null, null};
	static int index ;
	
	public static boolean creatGymEquipment(String equipment){
	 System.out.println("Creat Gym Equipments Started");
	 boolean isGymEquipmentsCreated = false;
	 if(equipment != null){
		gymEquipments[index]  = equipment;
		index++ ;
		isGymEquipmentsCreated = true;
	 }else System.out.println("Equipment name cant be null !!!!!");
	  
	 System.out.println("Creat Gym Equipments Ended");
	
	
	return isGymEquipmentsCreated ;
	}
	
	public static void getGymEquipments(){
		
		System.out.println("The Available Gym Equipments Are =");
		for(String gymEquipment : gymEquipments){
			System.out.println(gymEquipment);
		}
	}


}