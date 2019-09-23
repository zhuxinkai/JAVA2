class Teacher{
	 public static void sort(array []){
		 int middle=0;
		 for (int i = 0; i<array.length;i++)
			 f{
				 for (int j = 0; j < array.length-i-1; j++)
				 {
					if (array[i]<array[j]){
                       middle = array[j];
                       array[j] = array[i];					   
                       array[i] = middle;
					   
					}					

				
					 
				 }

				 
				 
				 
			 }
	 
		 
		 
	 }
	
	pulbic static void arrayPrint(array []){
	 for (int i =0;i<array.lenght;i++)
	 {
		 System.out.print(array[i]);
		 
		 
	 }
	}
}

class TestTeacher{
	
	public static void main (String[] args){
		int array = {12,544,4564,1,64,4654,34,454,4633};
		Teacher.sort(array);
		Teacher.arrayPrint(array);
		
		
		
	}
	
	
	
}
