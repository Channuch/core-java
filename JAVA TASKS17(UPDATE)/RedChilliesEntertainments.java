import java.util.*;
class RedChilliesEntertainments{
	 
	 static String movieActors[] = {null, null, null, null, null, null, null, null, null};
	 static int index;
	 
	public static boolean addMovieActors(String actors){
	  System.out.println("add Movie Actors Started");
	   boolean isMovieActorsAdded = false;
	   if(index < movieActors.length){
	    if(actors != null){
	     movieActors[index] = actors;
		 index++;
		 isMovieActorsAdded = true;
	    }
		else{
			System.out.println("Name Can't be null !!!!!!!!");
		}
	   }
	   else{
		   System.out.println("Places are allready filled,,,,,,");
	   }
	  System.out.println("add Movie Actors Ended");
	
	return isMovieActorsAdded ;
	}
	
	public static void getMovieActors(){
	 System.out.println("The Actors seleced for Movies are =");
	 for(String movieActor : movieActors){
	  System.out.println(movieActor);
	 }
	
	}
	
	public static boolean updateMovieActors(String oldActros , String newActros){
		System.out.println("Update Movie Actors Started");
		 boolean isMovieActrossUpdated = false ;
		 for(int index=0; index<movieActors.length ; index++){
			 if(oldActros == movieActors[index]){
				 movieActors[index]=newActros;
				 isMovieActrossUpdated = true;
			 }
		 }
		 if(isMovieActrossUpdated == false){
			 System.out.println(oldActros+" are Not in this Movie");
		 }
		  
		System.out.println("Update Movie Actors Started");
	return isMovieActrossUpdated;
	}
	
	public static boolean deleteActros(String actrosToBeDelete){
		System.out.println("Delete Actros is Started");
		 boolean isActrosDeleted = false;
		  int newIndex , oldIndex ;
		  for(newIndex = 0 , oldIndex= 0 ; oldIndex<movieActors.length ; oldIndex++){
			  if(actrosToBeDelete != movieActors[oldIndex]){
				  movieActors[newIndex] = movieActors[oldIndex];
				  newIndex ++;
			  }
		  }
		  movieActors= Arrays.copyOf(movieActors ,newIndex);
		  if(actrosToBeDelete != null){
			  isActrosDeleted = true;
		  }
		  if(isActrosDeleted == false){
			 System.out.println(actrosToBeDelete+"is Not Found or Not In list"); 
		  }
		
		System.out.println("Delete Actros is Ended");
	return isActrosDeleted ;	
	}


}