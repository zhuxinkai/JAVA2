class Demo{
	
	
	



public static void main (String[] args) {
	
	int [] array = {1,2,3,234,12312,42534,121212,42443244£¬4464971364};
	 quick(array);
   Arrayprint(array);
   

	
}
	public static void Arrayprint(int[] h)   {
   
	for (int i=0; i<h.length; i++)
	 {
	 	
	 	System.out.print(h[i]+"\t");
	 	
	 }
	
}

public static void quick(int [] h){
	
	 for (int i = 0; i < h.length/2; i++)
	   {
	   	int middle = 0;
	   	middle = h[i];
	   	h[i] = h[h.length-i-1];
	   	h[h.length-i-1] = middle;
	   	  
	   	
	   	
	   	
	   	
	   	
	   }
	
	
	
	
	
}


   }