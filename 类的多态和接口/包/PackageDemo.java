package cn.tx.array;//��������

class PackageDemo{
	


public static void main (String [] args){
	int [] array = {1,2,3,456,345,345,2342,35624,234};//����Ķ����ʽ
	
	printArray(array);
	
		}
	public static void printArray(int [] array)		{	//���εĸ�ʽ�����������ĸ�ʽ���ơ����������У�����ʵ������������ֻ�ܵ��á�
	for (int i =0; i<array.length;i++){	
		
		System.out.print(array[i]+"\n");
				}
	
	}


}

//�����ķ�ʽ����
// javac -d PackageDemo.java
//������ʽ��ִ��
// java cn.tx.array.PackageDemo 