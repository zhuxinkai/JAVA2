class Demo{
	
	public static void main (String args[]){
		int array [][] = new int [3][4];
    array[0][0] = 12;
    array[0][1] = 24;
    array[0][2] = 98;
    array[0][3] = 129;
     
     array[1][0] = 125;
    array[1][1] = 26464;
    array[1][2] = 598;
    array[1][3] = 1259;
    		
    array[2][0] = 125;
    array[2][1] = 254;
    array[2][2] = 985;
    array[2][3] = 1259;
   printArray(array);
    		 		
    		}	
    		
		
		
		
		/*
		二维数组的遍历，不用指定二维数组的宽度。 array.length;  array[i].length;
		\t \n 的斜杠，一定是上面的杠。
		System.out.print(); 和 System.out.println(); 的区别
		Print与Println的区别

    print 可以做格式化输出，而println不行。
    另外 println会自动换行，而print 不会。
    
		*/
		

	
	public static void printArray(int array[][]){
		for (int i = 0; i <array.length; i++){


			for (int j = 0;j<array[i].length;j++){

			System.out.print(array[i][j]+"\t");



			}
		System.out.println();

		}
		


		
		
	}
	
	
	
	
	 
}