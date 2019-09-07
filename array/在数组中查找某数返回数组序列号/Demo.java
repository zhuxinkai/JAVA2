class Demo{
	
	
public static void main (String[] args) {
	
	int [] array = {1,2,3,234,12312,42534,1212,424,12312,344,2312,2312,4354,12312};

int [] index = findnum(array,12312);
	for (int i=0 ; i <index.length;i++){
		if (index[i] == 0) {
			 break;
		    }
		
		System.out.print("the number 's index is "+ index[i]+"\t");
		
	   }
  
     
  
	
	
}
	public static int [] findnum(int[] h, int f)   {
		
	 	int [] index = new int [10];
    int j = 0;
	for (int i=0; i<h.length; i++){
	 
	 	 if (f == h[i]) {
	 	  	
	 	  	index[j] = i;
	 	  	j++;
	 	  	
	 	  	
	             }
	 	      	
	 	  
	 	   }
	 return index;

	}
	
}



   