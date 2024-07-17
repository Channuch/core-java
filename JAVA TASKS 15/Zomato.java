class Zomato{

	public static double takeOrders(String foodName){
		if(foodName == "GobiManchuri"){
			return 80.00;
		}
		if(foodName == "Gobi 65"){
			return 89.00;
		}
		if(foodName == "Paneer Tikka"){
			return 120.00;
		}
		if(foodName == "Panner 65"){
			return 110.00;
		}
		if(foodName == "Malai Chaap"){
			return 200.00;
		}
		if(foodName == "Masala Papad"){
			return 89.00;
		}
		if(foodName == "Chicken Kebab"){
			return 299.00;
		}
		if(foodName == "Chicken Lollipop"){
			return 249.00;
		}
		if(foodName == "Spicy Wings"){
			return 266.00;
		}
		if(foodName == "Baby Corn Chilli"){
			return 175.00;
		}
		if(foodName == "Grilled Chicken"){
			return 140.00;
		}
		if(foodName == "Prawns Chilli"){
			return 286.00;
		}
		if(foodName == "Paneer Pepper Dry"){
			return 199.00;
		}
		if(foodName == "Chicken Tikka "){
			return 255.00;
		}
		if(foodName == "Gobi Chilli"){
			return 199.00;
		}
		if(foodName == "Paneer Chilli"){
			return 255.00;
		}
		if(foodName == "Mushroom Chilli"){
			return 199.00;
		}else{
			System.out.println(foodName+"Not Available");
		}
		return 0.0;
	}





}