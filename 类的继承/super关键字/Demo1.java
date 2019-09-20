public class Demo1{
	
	public static void main (String [] args){
		Dog dog = new Dog("小花",4);
		dog.say();
		
		
		
	}
	
}


class Animals{
	String name;
	int age;
	//父类的构造方法
	public Animals(String name){
		this.name = name;
		
	}
	public Animals(){
		
	}
	
}


class Dog extends Animals{   //子类不能为public 类型。 
	public Dog (String name,int age){
		//调用父类的构造方法，调用父类的构造方法必须在构造方法的第一行（最起始的位置），
		//不能再构造方法以外的任何方法调用构造方法。
		//在一个构造方法内部只能调用一个构造方法。
		super(name);
		this.age = age;
	//最后注意super 和 this的区别。 super 不是对一个对象的引用，不能将super赋值给另一个对象变量，它只是一个指示编译器调用父类方法的特殊关键字。
	
				
	}
//编写一个默认构造器，没有调用super(),也没有调用this()，其实是又一个隐含的super(),编译器会自动插入一个调用到父类的构造方法中，并且不带参数。

	public Dog(){
		
		
		
	}
	
	
	public void say(){
		
		System.out.println(name+age+"岁了");
		
	}
	
	
}
