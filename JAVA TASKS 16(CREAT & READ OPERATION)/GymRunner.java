class GymRunner{

	 public static void main(String[] buyEquipments){
	  
	   boolean insert = Gym.creatGymEquipment("Dumbbells");
	    System.out.println(" The Gym Equipment Added To List " + insert);
		
	   insert = Gym.creatGymEquipment("Treadmill");
	    System.out.println(" The Gym Equipment Added to List "+ insert);
	   
	   insert = Gym.creatGymEquipment("Barbells");
	    System.out.println(" The Gym Equipment Added to List "+ insert);
	  
	   insert = Gym.creatGymEquipment("Kettlebells");
	    System.out.println(" The Gym Equipment Added to List "+ insert);
	  
	   insert = Gym.creatGymEquipment("Pull Up Bars");
	    System.out.println(" The Gym Equipment Added to List "+ insert);
	   
	   insert = Gym.creatGymEquipment("Weight Plates");
	    System.out.println(" The Gym Equipment Added to List "+ insert);
	   
	   insert = Gym.creatGymEquipment("Rowing Machine");
	    System.out.println(" The Gym Equipment Added to List "+ insert);
	   
	   insert = Gym.creatGymEquipment("Chest Press Machine");
	    System.out.println(" The Gym Equipment Added to List "+ insert);
		
	   Gym.getGymEquipments();
	   
	 }




}