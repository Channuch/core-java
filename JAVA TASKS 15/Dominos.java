class  Dominos{

	public static double takeOrder(String foodName){

		if (foodName == "Margherita Pizza"){
		 return 120.00;
		}
		if (foodName == "Pepperoni Pizza"){
		 return 129.00;
		}
		if (foodName == "Vegetarian Pizza"){
		 return 99.00;
		}
		if (foodName == "Hawaiian Pizza"){
		 return 299.00;
		}
		if (foodName == "Chicken Supreme Pizza"){
		 return 399.00;
		}
		if (foodName == "BBQ Chicken Pizza "){
		 return 599.00;
		}
		if (foodName == "Extravaganza Pizza"){
		 return 499.00;
		}
		if (foodName == "Paneer Makhani Pizza"){
		 return 699.00;
		}
		if (foodName == "Cheeseburst Pizza "){
		 return 399.00;
		}
		if (foodName == "Mexican Green Wave Pizza"){
		 return 450.00;
		}
		if (foodName == "Garlic Breadsticks "){
		 return 199.00;
		}
		if (foodName == "Cheesy Garlic Bread"){
		 return 250.00;
		}
		if (foodName == "Stuffed Garlic Bread"){
		 return 199.00;
		}
		if (foodName == "Potato Wedges "){
		 return 159.00;
		}
		if (foodName == "New York Cheesecake"){
		 return 399.00;
		} 
		else {
			System.out.println(foodName + "NOT Available");
		}return 0.0;
    }	

}