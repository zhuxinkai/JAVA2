class Demo1{
	  public static void main (String[] args){
	  	
	  	int [] array = {1,2,423,454,777468,345,124};
	  	
	  	
	  	System.out.print(Maxnum(array)+"\t");
	  	
	  	
	  	System.out.print(Minnum(array)+"\t");
	  	
	  	
	  }
	public static int Maxnum(int[] h)
	{
      int Maxnumber = h[0];     		
		  for (int i = 0; i < h.length; i++)
		     {
		     	if (Maxnumber < h[i]){
		     		
		     		Maxnumber = h[i];
		     	}
                       		     	
		     	
		     	
		     }
		return(Maxnumber);
		
		
	}
	
	public static int Minnum(int[] h)
	{
      int Minnumber = h[0];     		
		  for (int i = 0; i < h.length; i++)
		     {
		     	if (Minnumber > h[i]){
		     		
		     		Minnumber = h[i];
		     	}
                       		     	
		     	
		     	
		     }
		return(Minnumber);
		
		
	}
	
	
}