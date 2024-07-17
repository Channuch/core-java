class Swiggy{
	
	public static double takeOrder(String foodName){
	if(foodName == "Pizza"){
		return 99.00;
	}
	if(foodName == "Noodles"){
		return 99.00;
	}
	if(foodName == "Burger"){
		return 125.00;
	}
	if(foodName == "PaneerPizza"){
		return 155.00;
	}
	if(foodName == "Tandoori Pizza"){
		return 150.00;
	}
	if(foodName == "Fish and chips"){
		return 95.00;
	}
	if(foodName =="Nuggets"){
		return 126.00;
	}
	if(foodName == "Hot Dogs"){
		return 199.00;
	}
	if(foodName == "Paneer Rols"){
		return 135.00;
	}
	if(foodName == "SandWich"){
		return 122.00;
	}
	if(foodName == "Onion Rings"){
		return 99.00;
	}
	if(foodName == "Taco supreme"){
		return 199.00; 
	}
	if(foodName == "Paneer Shawarma"){
		return 166.00;
	}
	if(foodName == "Garlic Bread"){
		return 89.00;
	}
	if(foodName == "Allo Tikki"){
		return 99.00;
	}
	else {
		System.out.println(foodName+"Not Found");
	}
	return 0.0;
	
	}





}