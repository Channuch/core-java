class  Zepto{

	public static double takeOrder(String foodName){

		if (foodName == "Kulfi"){
		 return 120.00;
		}
		if (foodName == "SaladS"){
		 return 120.00;
		}
		if (foodName == "Pie"){
		 return 169.00;
		}
		if (foodName == "Famaly pacak"){
		 return 110.00;
		}
		if (foodName == "Egg Puff "){
		 return 60.00;
		}
		if (foodName == "Chicken Tikka Masala"){
		 return 265.00;
		}
		if (foodName == "DeathByChocolate"){
		 return 1111.00;
		}
		if (foodName == "Pan Cake"){
		 return 2570.00;
		}
		if (foodName == "Masala Dosa"){
		 return 120.00;
		}
		if (foodName == "Samosa"){
		 return 50.00;
		}
		if (foodName == "Faluda"){
		 return 320.00;
		}
		if (foodName == "Dal Makhani"){
		 return 189.00;
		}
		if (foodName == "Aloo Gobi"){
		 return 150.00;
		}
		if (foodName == "Pani Puri/Golgappa"){
		 return 80.00;
		}
		if (foodName == "Malai Kofta"){
		 return 50.00;
		} else {
			System.out.println(foodName + "Not Found");
		}
		return 0.0;
    }	

}