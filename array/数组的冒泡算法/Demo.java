class Demo{
	
	
	



public static void main (String[] args) {
	
	int [] array = {1,2,3,234,12312,42534,1212,424};
   Arrayprint(array);
   
   pringarray(array);
   
	
	
}
	public static void Arrayprint(int[] h)   {
   
	for (int i=0; i<h.length; i++)
	 {
	 	 for (int j = 0; j< h.length-1; j++)
	 	      {
               if (h[i]>h[j])
                 {
                 	int f = 0;
                 	f = h [i];
                 	h[i] = h[j];
                 	h[j] = f;
                 	
                 }	 	      	
	 	      	
	 	  
	 	      }
	 
	 	
	 }
	
}

public static void pringarray(int [] h)

        {
        	
        	for (int i = 0; i<h.length; i++)
        	  {
        	  	
        	  	System.out.print(h[i]+"\t");
        	  	
        	  }
        	
        	
        }

   }