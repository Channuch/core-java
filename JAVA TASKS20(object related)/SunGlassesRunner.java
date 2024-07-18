class SunGlassesRunner{

        public static void main(String[]glasses){
		
		  SunGlasses rayVision = new SunGlasses();	  
		  boolean create = rayVision.createGlasses("Ray Vision" , 11 , "Cooling" , 2000.00);
		  
		  rayVision.displayInfo();
		  
		   SunGlasses oakley = new SunGlasses();
		   create = oakley.createGlasses("Oakley" , 13223 , "Aviator" , 3000.00);	 
		   oakley.displayInfo();
		 
		  SunGlasses carrera = new SunGlasses();
		  create = carrera.createGlasses("Carrera" , 5363 , "Cat Eye" , 4000.00);
		  carrera.displayInfo();

		  SunGlasses persol = new SunGlasses();
		  create=persol.createGlasses("Persol" , 2324 , "Round" , 5000.00);
          persol.displayInfo();

		  SunGlasses polaroid = new SunGlasses();
		  create = polaroid.createGlasses("Polaroid" , 5363 ,"Club Master" ,6000.00);
		  polaroid.displayInfo();
		  
		  SunGlasses elegante = new SunGlasses();
		  create = elegante.createGlasses("Elegante" , 6738 ,"Oval" ,4000.00);
		  elegante.displayInfo();
		 
		  SunGlasses vogue = new SunGlasses();
		  create = vogue.createGlasses("Vogue" , 53638 , "Top Bar" ,15000.00);
		  vogue.displayInfo();
		 
		  SunGlasses randolph = new SunGlasses();
		  create= randolph.createGlasses("Randolph" , 4735 , "Square" , 2000.00);
		  randolph.displayInfo();
		 
		  SunGlasses gucci = new SunGlasses();
		  create=gucci.createGlasses("Gucci" , 78578 , "Heart" , 7000.00);
		  gucci.displayInfo();
		 
		  SunGlasses warbyParker = new SunGlasses();
		  create=warbyParker.createGlasses("Warby Parker" , 4557 , "Cooling" , 6599.00);
		  warbyParker.displayInfo();
		  
		  SunGlasses prada = new SunGlasses();
		  create = prada.createGlasses("Prada" , 526726 , "Sport" , 4000.00);
		  prada.displayInfo();
		 
		  SunGlasses fastrack = new SunGlasses();
		  create=fastrack.createGlasses("Fastrack" , 98789 , "Cooling" ,9999.00);
		  fastrack.displayInfo();
		  
		  SunGlasses idee = new SunGlasses();
		  create=idee.createGlasses("Idee" , 3738 , "Butterfly" , 18000.00);
		  idee.displayInfo();
		
		  SunGlasses lashes = new SunGlasses();
		  create=lashes.createGlasses("Lashes" , 998765 , "Cooling" , 19999.00);
          lashes.displayInfo();

		  SunGlasses beyondEyeWear = new SunGlasses();
		  create=beyondEyeWear.createGlasses("Beyond EyeWear" , 75443 ,"Navugitor" , 29999.00);
		  beyondEyeWear.displayInfo();
		}

}