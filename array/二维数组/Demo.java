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
		��ά����ı���������ָ����ά����Ŀ�ȡ� array.length;  array[i].length;
		\t \n ��б�ܣ�һ��������ĸܡ�
		System.out.print(); �� System.out.println(); ������
		Print��Println������

    print ��������ʽ���������println���С�
    ���� println���Զ����У���print ���ᡣ
    
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