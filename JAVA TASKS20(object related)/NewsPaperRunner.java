class NewsPaperRunner{

   public static void main(String[] goodHabit){

   NewsPaper read = new NewsPaper();
   
   boolean creat = read.create("Vijaya Karnataka",101,5.5,30,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read.displayInfo();

    NewsPaper read1 = new NewsPaper();
	
	creat =read1.create("The Hindu",102,6.0,28,"Kannada & English");
       System.out.println("The NewsPaper Created ="+creat);

    read1.displayInfo();
     
	NewsPaper read2 = new NewsPaper();
	
	creat =read2.create("Deccan Herald",103,7.5,32,"English");
       System.out.println("The NewsPaper Created ="+creat);

    read2.displayInfo();

    NewsPaper read3 = new NewsPaper();
	
	creat =read3.create("Udayavani ",104,5.0,26,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read3.displayInfo();

    NewsPaper read4 = new NewsPaper();
	
	creat =read4.create("Prajavani ",105,6.0,30,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read4.displayInfo();

    NewsPaper read5 = new NewsPaper();
	
	creat =read5.create("Kannada Prabha ",106,4.5,25,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read5.displayInfo();

    NewsPaper read6 = new NewsPaper();
	
	creat =read6.create("Vartha Bharati",107,5.0,28,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read6.displayInfo();

	NewsPaper read7 = new NewsPaper();
	
	creat =read7.create("Samyukta Karnataka ",108,5.5,30,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read7.displayInfo();
	 
	NewsPaper read8 = new NewsPaper();
	
	creat =read8.create("Kannada Dunia",109,7.0,32,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read8.displayInfo();
    
    NewsPaper read9 = new NewsPaper();
	
	creat =read9.create("Deccan Herald",110,6.5,30,"English");
       System.out.println("The NewsPaper Created ="+creat);

    read9.displayInfo();	
	
	NewsPaper read10 = new NewsPaper();
	
	creat =read10.create("Sanjevani",111,6.0,30,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read10.displayInfo();
	
	NewsPaper read11 = new NewsPaper();
	
	creat =read11.create("Vishwavani",112,5.0,30,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read11.displayInfo();
	
	NewsPaper read12 = new NewsPaper();
	
	creat =read12.create("Praja Pragathi ",113,5.5,26,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read12.displayInfo();
	
	NewsPaper read13 = new NewsPaper();
	
	creat =read13.create("Bangalore Mirror",114,6.0,30,"English");
       System.out.println("The NewsPaper Created ="+creat);

    read13.displayInfo();
	
	NewsPaper read14 = new NewsPaper();
	
	creat =read14.create("Suvarna Times",115,7.0,28,"Kannada");
       System.out.println("The NewsPaper Created ="+creat);

    read14.displayInfo();


  }
}