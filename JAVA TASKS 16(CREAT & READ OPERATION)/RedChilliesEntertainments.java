class RedChilliesEntertainments{
	 
	 static String movieActors[] = {null, null, null, null, null, null, null, null, null, null};
	 static int index;
	 
	public static boolean addMovieActors(String actors){
	  System.out.println("add Movie Actors Started");
	   boolean isMovieActorsAdded = false;
	   if(actors != null){
	     movieActors[index] = actors;
		 index++;
		 isMovieActorsAdded = true;
	   }else System.out.println("Name Can't be null !!!!!!!!");
	   
	  System.out.println("add Movie Actors Ended");
	
	return isMovieActorsAdded ;
	}
	
	public static void getMovieActors(){
	 System.out.println("The Actors seleced for Movies are =");
	 for(String movieActor : movieActors){
	  System.out.println(movieActor);
	 }
	
	}





}