class Demo1{
	
	public static void main (String [] args){
		
	 int a = 20;
	 int b = 25;
	 int c = compareNum(a,b);
	 if ( c == 0){
	 	System.out.println("the two number is the same number");
	 		 	
	 }else{
	 
	 System.out.println("the big number is"+ "\t"+c);
	 
	  }
		
		
		
		
	}
	//驼峰命名法，xxxYyyZzz 的方式。  compareNum
	
	
	public static int compareNum (int a,int b){
		int result = 0;
		if (a> b){
			result = a;
			
			
			
			
		}else if(b > a) {
			
			result = b;
			
			
			
		}else{
			
			
			result = 0;
		}
		
		return result;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}