class TeliVision{
	
	
	static boolean isPowred= true;
	 static int currentChannelNu ;
	 static int minimumChannels ;
	 static int maximumChannels = 60 ;
	
	public static void OnOff(){
		System.out.println("TV On Off Started");
		if (isPowred == true){
			isPowred = false ;
			System.out.println("The TV is Powered OFF");
		}else if (isPowred == false){
			isPowred = true;
			System.out.println("The TV is Powered ON");
		}
		 System.out.println("TV On Off Ended");
		 return;
	}
	
	public static void increaseChannelNo(){
				System.out.println("Increase Channel Number Started");
		if (isPowred==true){
			if (currentChannelNu<=maximumChannels){
				currentChannelNu=currentChannelNu+57;
				System.out.println("The Current channel Number is " + currentChannelNu);
			}else{
				System.out.println("The channel Number is Does not exist , reached End of channels");
			}
			System.out.println("Increase Channel Number Ended");
			return ;
		}
	}
	
	public static void decreaseChannelNo(){
		System.out.println("Decrease Channel Number Started");
		if (isPowred == true){
			if (currentChannelNu>=minimumChannels){
				currentChannelNu=currentChannelNu-36;
				System.out.println("The Current channel Number is " + currentChannelNu);
			}else {
				System.out.println("The channel Number is Does not exist , reached End of channels");
			}
			System.out.println("Decrease Channel Number Ended");
			return;
		}
	}
	
	public static void productInformation(){
		System.out.println("Product Information Started");
		
		String brand = "LG";
		int price = 750000;
		String size = "56 inch";
		String colour = "black";
		
		System.out.println("The Product "+ brand);
		System.out.println("The product Price "+ price);
		System.out.println("Size of The TV "+ size);
		System.out.println("Product colour "+ colour);
		
		System.out.println("Product Information Ended");
	}
}