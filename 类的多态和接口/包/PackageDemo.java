package cn.tx.array;//包的声明

class PackageDemo{
	


public static void main (String [] args){
	int [] array = {1,2,3,456,345,345,2342,35624,234};//数组的定义格式
	
	printArray(array);
	
		}
	public static void printArray(int [] array)		{	//传参的格式，与主方法的格式类似。在主方法中，不能实现其他方法，只能调用。
	for (int i =0; i<array.length;i++){	
		
		System.out.print(array[i]+"\n");
				}
	
	}


}

//带包的方式编译
// javac -d PackageDemo.java
//带包形式的执行
// java cn.tx.array.PackageDemo 