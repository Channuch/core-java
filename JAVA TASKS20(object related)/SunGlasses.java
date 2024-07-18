class SunGlasses{

        String name;
		int id;
		String type;
		double price;
		
		
		public boolean createGlasses(String name , int id , String type , double price){
			
			boolean isSunGlassesCreated = false;
			if(name!=null && id>0 && type!=null && price>0.0){
				
			}
			         this.name=name;
					 this.id = id;
					 this.type = type;
					 this.price = price;
					 isSunGlassesCreated = true;
					 return isSunGlassesCreated;
			
		}
		 
		   public void displayInfo(){
			   
			   System.out.println("The Brand Name Is = " + this.name);
			   System.out.println("The Brand Id Is = "+ this.id);				
			   System.out.println("The Brand Type Is = " + this.type );
			   System.out.println("The Brand Price Is = " +this.price);
		   }


		   
		



}