package cn.tx.array;   //包后面需要加上分号。
//引入外部包的类
import us.tx.array.PackageDemo;   //引入类

class ArrayDemo{
public static void main (String [] args){
	int [] array = {12,3413,123,4352,12312,12312,523432,123};
	//us.tx.array.PackageDemo.printArray(array);  
	printArray(array);  //引入类后，当同包下的类使用。
	
	
	
}

}

//同一个包下的类的访问可以共同访问。
//类进行编译的时候，她的关联类也会被编译。(看结果是不成功的）。



//不同包的类的访问，需要源引入类为pulbic 类
