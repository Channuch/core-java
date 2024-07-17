class AirConditioner{
	
	
	static boolean isConnected= true;
	 static int currentjavTemperature ;
	 static int minimumTemperature ;
	 static int maximumTemperature = 10 ;
	 
	public static void onOrOff(){
	System.out.println("onOrOff Started");
	 isConnected = (isConnected = false) ? true :  false;
	System.out.println("OnOrOff Ended");
	return ;
	}

	public static void increaseTemeprature(){
		if (isConnected == true){
		System.out.println("Increase Temperature Started");
			if (currentTemperature<=maximumTemperature){
			currentTemperature = currentTemperature+11;
			System.out.println("The Current Temperature is " + currentTemperature);
		}else{
		System.out.println("Maximum Temperature Reached");
		}
				System.out.println("Increase Temperature Ended");
		return ;
		}
	}
		
	public static void decreaseTemperature(){
		if(isConnected == true){
			System.out.println("Decrease Temperature Stated");
			if (currentTemperature>=minimumTemperature){
				currentTemperature = currentTemperature- 8;
				System.out.println("The Current Temperature is " + currentTemperature);
			
		}else {
			System.out.println("Minimum Valume reached");
		}
		System.out.println("Decrease Temperature Ended");
		return ;
	}
	
		
		
	}
	
	public static void getInformation(){
		System.out.println("Get Information Started");
		String brand = "Samsung";
		String price = "$ 50000.";
		System.out.println("The Brand Name = "+brand);
		System.out.println("The Product Price = "+ price);
		
			System.out.println("Get Information Ended");
	}




}