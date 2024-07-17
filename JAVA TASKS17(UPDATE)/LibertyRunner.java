class LibertyRunner{
        

      public static void main (String []brandName){
	                
		      boolean add = Liberty.addShoeBrands("Adidas");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Puma");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Skechers");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Nike");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Converse");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("New Balance");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Bata");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Crocs");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Reebok");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("vans");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Asics");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Cole Haan");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Fila");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Woodland");
	            System.out.println("The Brand Name Is = " + add);
				
				add = Liberty.addShoeBrands("Ariat");
	            System.out.println("The Brand Name Is = " + add);
				
				Liberty.getAllShoeBrands();
				
				boolean updateName = Liberty.updateShoeBrand("Fila","Red Tape");
				   System.out.println("The Updated Shoe Is = " + updateName);
				
				
				Liberty.getAllShoeBrands();
	  
	  }

}
