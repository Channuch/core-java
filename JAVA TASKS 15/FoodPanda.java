class  FoodPanda{

	public boolean takeOrder(String foodName){

		if (foodName == "Vada Pav"){
		 return 80.00;
		}
		if (foodName == "Pav Bhaji"){
		 return 89.00;
		}
		if (foodName == "Rajma Masala"){
		 return 180.00;
		}
		if (foodName == "Chicken Biryani"){
		 return 260.00;
		}
		if (foodName == "Bhindi Masala"){
		 return 130.00;
		}
		if (foodName == "Dahi Puri"){
		 return 99.00;
		}
		if (foodName == "Mutter Paneer"){
		 return 160.00;
		}
		if (foodName == "Prawn Curry"){
		 return 350.00;
		}
		if (foodName == "Chicken Korma"){
		 return 189.00;
		}
		if (foodName == "Aloo Paratha"){
		 return 60.00;
		}
		if (foodName == "Pesarattu"){
		 return 125.00;
		}
		if (foodName == "Chicken Curry"){
		 return 99.00;
		}
		if (foodName == "Rasam"){
		 return 60.00;
		}
		if (foodName == "Medu Vada"){
		 return 89.00;
		}
		if (foodName == "Gajar Ka Halwa"){
		 return 160.00;
		} else {
			System.out.println(foodName + "Not Valid");
		}
		return 0.0;
    }	

}