class Speaker{

	static boolean isCharged ;
	static int maxVolume = 50;
	static int minVolume ;
	static int currentVolume ;
	
	public static void onAndOff(){
		System.out.println("On And Off Started");
		if(isCharged == false ){
				isCharged = true;
		System.out.println("The Speaker is Turned On ");
		}
			else if(isCharged == true){
					isCharged = false;
					System.out.println("The Speaker is Turned Off");
			}
			System.out.println("On And Off Ended");
		return ;
	}

	public static void increaseVolume(){
		System.out.println("Increase Volume Started");
		if (isCharged == true){
			if (currentVolume <= maxVolume){
				currentVolume = currentVolume + 55 ;
				System.out.println("The Current Volume is "+ currentVolume);
			}else {
				System.out.println("YOU Reached Maximum Volume");
			}
			System.out.println("Increase Volume Ended");
		}
	}

	
	public static void decreaseVolume(){
		System.out.println("Decrease Volume Started");
		if (isCharged == true){
			 if (currentVolume>=minVolume){
				 currentVolume = currentVolume -66 ;
				 System.out.println("The Current Volume is "+ currentVolume);
			 }else{
				 System.out.println("YOU Reachde minimum Volume");
			 }
			 System.out.println("Decrease Volume Ended");
			 return ;
		}
	}

	public static void getInformaion(){
		System.out.println("Get Information Started");
		String  brand = "JBL";
		int price = 50000;
		boolean isWarrented  = true;
		String colour = "black";
		System.out.println("The Product Brand "+ brand);
		System.out.println("The Product price "+ price);
		System.out.println("The Product colour "+ colour);
		System.out.println("Comes with Warrenty  "+ isWarrented);
		System.out.println("Get Information Ended");
	}
}