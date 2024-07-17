class DMart{

static String chocolates[] = {"1.kit kat ","2. Dairy Milk ","3. Snickers ","4. Munch ","5. Milky Bar ", "6. Silk ","7. 5 Star "};
static String vegitables[] = {"1.Tomato","2.Potato","3.Ladyfinger","4.Brinjal","5.Capsicum","6.Carrot","7.Cucumber","8.Onion","9.Ginger"};
static String froots[] = {"1.Apple","2. Orange","3.Grapes","4.Watermelon","5.Pineapple","6.Mango","7.Dragonfroot","8.Cherry"};
static String coolDrinks[] = {"1.Sprite","2.Coco Cola","3.Fanta","4.Pepsi","5.Maza","6.Limca","7.Appy Fizz","8.Mirinda"};
static String groceries[] = {"1. Dalls","2. Atta","3. Oils","4. Salt","5. Sugure","6. Rice","7. Teapowder","8. Milk"};
static String homeAppliances[] = {"1.Fan","2.Tv","3.Sofa","4.Bed","5.Blender","6.WashingMachine","7.Vacume Cleaner","8.DishWasher"};
static String clothes[] = {"1.Shirts","2.Pants","3.T-shirts","4.Shorts","5.Nightpants"};
static String footWares[] = {"1.Sneakers","2.Casual Shoes","3.Sport Shoes","4.Sandles","5.Sleepers","6.Crocs","7.Loofers"};
static String stationerys[] = {"1.Pens and Pencils","2.Notebooks and Notepads","3.Filing and Organization","4.Paper Products","5.Art Supplies","6.Desk Accessories","7.Correction Supplies","8.Writing Instruments"};
static String personalCares[] = {"1.Shampoo and Conditioner","2.Body Wash and Soap","3.Skincare","4.Oral Care","5.Hair Care Accessories","6.Cosmetics","7.Men's Grooming","8.Sunscreen and Sun Care"};
static String electronics[] = {"1.Batteries","2.EarPhones","3.Cables","4.Torch","5.Chargers","6.clocks"};
static String homeDecors[] = {"1.Curtains and Drapes","2.Rugs and Carpets","3.Cushions and Throws","4.Wall Art","5.Mirrors","6.Photo Frames","7.Candles and Candle Holders","8.Vases and Artificial Flowers"};
static String toysAndGames[] = {"1.Carrom","2.Chess","3.Bat","4.Ball","5.Basket Ball","6.Foot Ball","7.BadMinton","8.Sket Board"};
static String biscuits[] = {"1.Parle-G","2.BorBone","3.MaryGold","4.Tiger","5.Goodday","6.Happy Happy","7.Hide And Seak","8.Oreo"};
static String packetsFoods[] = {"1.Noodles","2.Maggie","3.CUP Noodles","4.Soups","5.PoP Corns"};




public static void main(String newCollection[]){

System.out.println("The Available Chocolate Are : ");
 for (int index = 0 ; index < chocolates.length - 1 ; index++ ){
 System.out.println(chocolates[index]);
	}
	
	   // for Each Loop
	   for( String chocolate: chocolates){
		   System.out.println(chocolate) ; 
		   }
	
System.out.println("The Available Fresh Vegitables Are : ");
	for (int index = 0 ; index < vegitables.length - 1 ; index++){
		System.out.println(vegitables[index]);
	}
		for(String vegitable: vegitables){
			System.out.println(vegitable);
		}	

System.out.println("The Available Fresh Froots Are : ");
	for (int index = 0 ; index < froots.length - 1 ; index++){
		System.out.println(froots[index]);
	}
	for( String froot: froots){
		   System.out.println(froot) ; 
		   }
	
		
System.out.println("The Available CoolDrinks Are : ");
	for (int index = 0 ; index < coolDrinks.length - 1 ; index++){
		System.out.println(coolDrinks[index]);
	}
	for( String coolDrink: coolDrinks){
		   System.out.println(coolDrink) ; 
		   }
		   
System.out.println("The Available Groceries Are : ");
	for (int index = 0 ; index < groceries.length - 1 ; index++){
		System.out.println(groceries[index]);
	}
	for( String grocerie: groceries){
		   System.out.println(grocerie) ; 
		   }
	
System.out.println("The Home Appliances : ");
	for (int index = 0 ; index < homeAppliances.length - 1 ; index++){
		System.out.println(homeAppliances[index]);
	}
	for( String homeAppliance: homeAppliances){
		   System.out.println(homeAppliance) ; 
		   }

System.out.println("The New Arrived Clothes : ");
	for (int index = 0 ; index < clothes.length-1 ; index++){
		System.out.println(clothes[index]);
	}
	for( String clothe: clothes){
		   System.out.println(clothe) ; 
		   }
	
System.out.println("The New Footware Collection : ");
	for (int index = 0 ; index < footWares.length-1 ; index++){
		System.out.println(footWares[index]);
	}
	for( String footWare: footWares){
		   System.out.println(footWare) ; 
		   }
	
System.out.println("The Available Stationery Products: ");
	for (int index = 0 ; index < stationerys.length-1 ; index++){
		System.out.println(stationerys[index]);
	}
	for( String stationery: stationerys){
		   System.out.println(stationery) ; 
		   }

System.out.println("The Available Personal Care Products : ");
	for (int index = 0 ; index < personalCares.length-1 ; index++){
		System.out.println(personalCares[index]);
	}
	for( String personalCare: personalCares){
		   System.out.println(personalCare) ; 
		   }

System.out.println("The Available Electronics Are :  ");
	for (int index = 0 ; index < electronics.length-1 ; index++ ){
		System.out.println(electronics[index]);
	}
	for( String electronic: personalCares){
		   System.out.println(electronic) ; 
		   }

System.out.println("The Available Home Decors Are : ");
	for (int index = 0 ; index < homeDecors.length-1 ; index++){
		System.out.println(homeDecors[index]);
	}
	for( String homeDecor: homeDecors){
		   System.out.println(homeDecor) ; 
		   }

System.out.println("The Available Toys And Games Are : ");
	for (int index = 0 ; index < toysAndGames.length-1 ; index++){
		System.out.println(toysAndGames[index]);
	}
	for( String toysAndGame: toysAndGames){
		   System.out.println(toysAndGame) ; 
		   }

System.out.println("The Available Biscuits : ");
	for (int index = 0 ; index < biscuits.length-1 ; index++){
		System.out.println(biscuits[index]);
	}
	for( String biscuit: biscuits){
		   System.out.println(biscuit) ; 
		   }

System.out.println("The Available Packet Foods : ");
	for (int index = 0 ; index < packetsFoods.length-1 ; index++){
		System.out.println(packetsFoods[index]);
	}
	for( String packetsFood: packetsFoods){
		   System.out.println(packetsFood) ; 
		   }






}

}