public class Demo{
	public static void main (String [] args){
		
		
		//父类的对象和方法
		Animals myAnimals = new Animals("贝贝");
		myAnimals.say();
		
		
		//子类的对象和方法
		Dog myDog = new Dog("松松");
		myDog.say();
				
	}
	
}

class Animals{
	String name;
	public Animals(String name){
		this.name = name;
		
	}
	public Animals(){}
	
	
	public void say(){
		
		System.out.print("我是一只小只动物，我的名字是"+name+"\n");
		
		
	}
	
	
}


class Dog extends Animals{
	public Dog(String name){
		super(name);  //父类构造器的调用。
		
		this.name = name;  
	}
 public void say(){
 	System.out.print("我是一只小狗，我的名字是"+name+"\n");
 	
 }	
	
}


/*
方法的覆盖/重载
1，方法的覆盖返回类型，方法名称，参数列表必须与原方法的相同。
2，覆盖方法不能比原方法访问性差。（原访问权限不允许缩小）。
3，覆盖的方法不允许比原方法抛出更多异常。
4，原方法为final类型时，不允许覆盖。
5，原方法不能为private ，否则新方法只是一个单纯的新方法，不是对原方法的覆盖。
6，静态方法，static 也不会发生覆盖，因为静态方法是在编译的时候把静态方法和类的引用类型进行匹配。





*/