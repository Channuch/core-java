class Shampoo{
  
    String name ;
	int productId;
	double price ;
	String color;
	String type;
	String mfgDate;
	String expDate;
	
	
	public boolean creatShampoo(String name ,int productId, double price, String color, String type, String mfgDate, String expDate){
	 
	  System.out.println("Creat Shampoo Started");
	   boolean isShampooCreated = false;
	   if(name != null && productId > 0 && price > 0.0 && color != null && type!= null && mfgDate != null && expDate!= null){
	       this.name=name;
		   this.productId = productId;
		   this.price = price;
		   this.color = color;
		   this.type = type;
		   this.mfgDate = mfgDate;
		   this.expDate = expDate;
	   }
	  
	  System.out.println("Creat Shampoo Started");
	   
	 return isShampooCreated;  
	}
	
	public void getinfo(){
	
	     System.out.println("The Shampoo Name is ="+this.name);
		 System.out.println("The Shampoo Id is ="+this.productId);
		 System.out.println("The  price is ="+this.price);
		 System.out.println("The Shampoo colour is ="+this.color);
		 System.out.println("The Shampoo type is ="+this.type);
		 System.out.println("The Shampoo Manufacturing Date is ="+this.mfgDate);
		 System.out.println("The Shampoo Expire Date is ="+this.expDate);
	
	}

}