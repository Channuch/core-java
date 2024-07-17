class  Blinkit{

	public static double takeOrder(String foodName){

		if (foodName == "Kachori"){
		 return 40.00;
		}
		if (foodName == "Dhokla"){
		 return 60.00;
		}
		if (foodName == "Shrikhand"){
		 return 160.00;
		}
		if (foodName == "Mysore Pak "){
		 return 300.00;
		}
		if (foodName == "Dal Baati Churma"){
		 return 250.00;
		}
		if (foodName == "Pitha"){
		 return 50.00;
		}
		if (foodName == "Kori Rotti"){
		 return 30.00;
		}
		if (foodName == "Neer Dosa"){
		 return 80.00;
		}
		if (foodName == "Akki Roti"){
		 return 30.00;
		}
		if (foodName == "Bisi Bele Bath "){
		 return 130.00;
		}
		if (foodName == "Obbattu/Holige "){
		 return 80.00;
		}
		if (foodName == "Uttapam"){
		 return 60.00;
		}
		if (foodName == "Vangi Bath"){
		 return 80.00;
		}
		if (foodName == "Pulihora"){
		 return 120.00;
		}
		if (foodName == "Mirchi Bajji"){
		 return 60.00;
		} 
		else {
			System.out.println(foodName + "Not Available");
		}
		return 0.0;
    }	
	
	public static double takeOrder(String foodName , int quantity){
		if (foodName == "Kachori"){
		 return   40.00 * quantity;
		}
		if (foodName == "Dhokla"){
		 return 60.00 * quantity;
		}
		if (foodName == "Shrikhand"){
		 return  160.00 * quantity;
		}
		if (foodName == "Mysore Pak "){
		 return  300.00 * quantity;
		}
		if (foodName == "Dal Baati Churma"){
		 return  250.00* quantity;
		}
		if (foodName == "Pitha"){
		 return  50.00 * quantity;
		}
		if (foodName == "Kori Rotti"){
		 return  30.00 * quantity;
		}
		if (foodName == "Neer Dosa"){
		 return  80.00 * quantity;
		}
		if (foodName == "Akki Roti"){
		 return 30.00 * quantity;
		}
		if (foodName == "Bisi Bele Bath "){
		 return 30.00 * quantity;
		}
		if (foodName == "Obbattu/Holige "){
		 return 80.00 * quantity;
		}
		if (foodName == "Uttapam"){
		 return  60.00 * quantity;
		}
		if (foodName == "Vangi Bath"){
		 return  80.00 * quantity;
		}
		if (foodName == "Pulihora"){
		 return  120.00 * quantity;
		}
		if (foodName == "Mirchi Bajji"){
		 return  60.00 * quantity;
		} 
		else {
			System.out.println(foodName + "Not Available");
		}
		return 0.0;
	}

}