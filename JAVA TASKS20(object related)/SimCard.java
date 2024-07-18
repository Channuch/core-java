class SimCard{

    String name ;
	int id ;
	int plan;
	
	  public boolean createSim(String name , int id , int plan){		
		
		boolean isSimCardCreated=false;
		
		if(name!=null && id>0 && plan>0 ){			
			
		}
		      this.name=name;
			  this.id=id;
			  this.plan=plan;
	           isSimCardCreated = true;
            return isSimCardCreated;			   
	 }
	    public void displayInfo(){
			
			System.out.println("The Sim Card Name Is = " +this.name);
			System.out.println("The Sim Card Id Is = "+ this.id);
			System.out.println("The Sim Card Plan IS = " + this.plan);
			
			
			
		}
	 



}