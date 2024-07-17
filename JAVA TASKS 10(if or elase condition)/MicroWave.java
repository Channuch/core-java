class MicroWave{
	
	
	static boolean isConnected= true;
	 static int currentTemperature ;
	 static int minimumTemperature ;
	 static int maximumTemperature = 100 ;
	 
	public static void turnOnOrOff(){
	System.out.println("onOrOff Started");
	if(isConnected == false){
		isConnected = true;
		System.out.println("The MicroWave is Turned On");
	}
	else if (isConnected == true){
	isConnected = false;
	System.out.println("The MicroWave is Turned Off");
	}
	System.out.println("OnOrOff Ended");
	return ;
	}

	public static void increaseTemeprature(){
		if (isConnected == true){
		System.out.println("Increase Temperature Started");
			if (currentTemperature<=maximumTemperature){
			currentTemperature = currentTemperature+78;
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
				currentTemperature = currentTemperature- 56;
				System.out.println("The Current Temperature is " + currentTemperature);
			
		}else {
			System.out.println("Minimum Valume reached");
		}
		System.out.println("Decrease Temperature Ended");
		return ;
	}
	
		
		
	}
	
	public static void productInformation(){
		System.out.println("Get Information Started");
		String brand = "Panasonic";
		String price = "$ 20000.";
		String colour = "Black" ; 
		System.out.println("The Brand Name = "+brand);
		System.out.println("The Product Price = "+ price);
		System.out.println("The Product Colour = " + colour);
		
			System.out.println("Get Information Ended");
	}




}