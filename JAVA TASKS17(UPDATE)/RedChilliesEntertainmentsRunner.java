class RedChilliesEntertainmentsRunner{

   public static void main(String[] addActros){
 
       boolean actros = RedChilliesEntertainments.addMovieActors("Kicha Sudeep");
            System.out.println("Actros listed for  Movies = ");
			
		actros = RedChilliesEntertainments.addMovieActors("Upndra");
            System.out.println("Actros listed for  Movies = ");
		
		actros = RedChilliesEntertainments.addMovieActors("AlluArjun");
            System.out.println("Actros listed for  Movies = ");
			
		actros = RedChilliesEntertainments.addMovieActors("Chikkanna");
            System.out.println("Actros listed for  Movies = ");
		
		actros = RedChilliesEntertainments.addMovieActors("Ashika Ranganath");
            System.out.println("Actros listed for  Movies = ");
		
		actros = RedChilliesEntertainments.addMovieActors("Nishvika Nadiu");
            System.out.println("Actros listed for  Movies = ");
		
		actros = RedChilliesEntertainments.addMovieActors("Neetu");
            System.out.println("Actros listed for  Movies = ");
		
		actros = RedChilliesEntertainments.addMovieActors("Rakul");
            System.out.println("Actros listed for  Movies = ");
		
		actros = RedChilliesEntertainments.addMovieActors("Anupooma Permashwar");
            System.out.println("Actros listed for  Movies = ");
			
		RedChilliesEntertainments.getMovieActors();
		
		boolean newActr = RedChilliesEntertainments.updateMovieActors("Neetu", "Sai Pallavi");
		 System.out.println("Actros Liste Updated "+ newActr);
		 
		RedChilliesEntertainments.getMovieActors(); 
		
		boolean delete = RedChilliesEntertainments.deleteActros("Chikkanna");
		 System.out.println("Actros deleted from list = "+delete);
		
		RedChilliesEntertainments.getMovieActors();
    }
}