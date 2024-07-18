class SimCardRunner{

        public static void main (String [] calling){
         SimCard brand = new SimCard();
		 boolean create = brand.createSim("Jio" , 7878,199 );
		 brand.displayInfo();
		
		  SimCard brand1 = new SimCard();
		  create=brand1.createSim("Idea" , 7879 , 299);
		  brand1.displayInfo();
		 
		  SimCard brand2 = new SimCard();
		  create=brand2.createSim("Vi" , 7880, 255);
		  brand2.displayInfo();
		
		  SimCard brand3 = new SimCard();
		  create=brand3.createSim("Airtel" , 7881 , 719);
		  brand3.displayInfo();
		
		  SimCard brand4 = new SimCard();
		  create=brand4.createSim("Vodafone" , 7882 , 2999);
		  brand4.displayInfo();
		 
		  SimCard brand5 = new SimCard();
		  create=brand5.createSim("BSNL" , 7883 , 1999);
		  brand5.displayInfo();
		
		  SimCard brand6 = new SimCard();
		  create=brand6.createSim("MTNL" , 7884 , 2999);
		   brand6.displayInfo();

		  SimCard brand7 = new SimCard();
		  create=brand7.createSim("Aircel" , 7885 , 149);
		   brand7.displayInfo();

		  SimCard brand8 = new SimCard();
		  create=brand8.createSim("Uninor" , 7886 , 199);
		   brand8.displayInfo();
		
		  SimCard brand9 = new SimCard();
		  create=brand9.createSim("Sprint" , 7887 , 3599);
		 brand9.displayInfo();
		 
		  SimCard brand10 = new SimCard();
		  create=brand10.createSim("Digicel" , 7889 , 999);
		   brand10.displayInfo();
		   
		  SimCard brand11 = new SimCard();
		  create=brand11.createSim("Bell" , 7890 , 1299);
		  brand11.displayInfo();
		  
		  SimCard brand12 = new SimCard();
		  create=brand12.createSim("Vinphone" , 7891 , 1049);
		  brand12.displayInfo();
		  
		  SimCard brand13 = new SimCard();
		  create=brand13.createSim("Cellink" , 7892 , 949);
		   brand13.displayInfo();
		   
		  SimCard brand14 = new SimCard();
		  create=brand14.createSim("Tesco" , 7894 , 1029);
		  brand14.displayInfo();
		 
        }

}