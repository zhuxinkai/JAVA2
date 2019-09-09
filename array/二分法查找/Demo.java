class Demo{
	


public static void main (String[] args) {
	
	int [] array = {1,2,3,234,1234,4235,4275,44298,1123789};
	 int index = quick(array,1123789);
	 System.out.print("this number 1123789  index is "+ index);
 

	
}


public static int quick(int [] h, int num){
	 int maxIndex = h.length - 1;
	 int minIndex = 0;
	 int middleIndex = (maxIndex + minIndex)-1/2;
	 while (true) {
	 	          if(num == h[middleIndex]){
	 	          	
	 	          	break;
	 	          	
	 	          	
	 	          }
	 	          else{
	 	          	if (num > h[middleIndex]){
	 	          		minIndex = middleIndex;
	 	          		middleIndex = (maxIndex + minIndex)-1/2;
	 	          		
	 	          		
	 	          	}
	 	          	else{
	 	          		maxIndex = middleIndex;
	 	          		middleIndex = (maxIndex + minIndex)-1/2;
	 	          	}
	 	          	
	 	          	
	 	          }
	 	      
	 	          
	 	
	 	
	 }
	 return middleIndex;
	 
	 
	 
	       
	
	
	
	
}


   }
