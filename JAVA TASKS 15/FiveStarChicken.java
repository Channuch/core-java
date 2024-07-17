class  FiveStarChicken{

	public static  double takeOrder(String foodName){

		if (foodName == "Chicken Hariyali" ){
		 return 1255.00;
		}
		if (foodName == "Chicken Methi"){
		 return 1250.00;
		}
		if (foodName == "Chicken Malai Tikka"){
		 return 1350.00;
		}
		if (foodName == "Chicken Shahi Korma"){
		 return 1550.00;
		}
		if (foodName == "Chicken Reshmi Kabab"){
		 return 1200.00;
		}
		if (foodName == "Chicken Hyderabadi"){
		 return 8800.00;
		}
		if (foodName == "Chicken Sukka"){
		 return 669.00;
		}
		if (foodName == "Chicken Masala"){
		 return 1189.00;
		}
		if (foodName == "Chicken Dhansak"){
		 return 548.00;
		}
		if (foodName == "Chicken Do Pyaza"){
		 return 1969.00;
		}
		if (foodName == "Chicken Saag"){
		 return 960.00;
		}
		if (foodName == "Chicken Vindaloo"){
		 return 5590.00;
		}
		if (foodName == "Chicken Chettinad"){
		 return 6704.00;
		}
		if (foodName == "Chicken Vindaloo"){
		 return 3250.00;
		}
		if (foodName == "Chicken Boti"){
		 return 15000.00;
		} 
		else {
			System.out.println(foodName + "NOT Valid");
		return 0.0;
		}
    }	

}