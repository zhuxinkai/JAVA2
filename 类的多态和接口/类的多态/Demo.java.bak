class Demo{
	public static void main (String [] args){
		Animals obj = new Animals();
		obj.sound = "不知道";
		obj.say();
		obj = new Dog();     //我们将变量定义为父类的类型，却引用子类的对象，这个过程就是向上转型。程序运行时通过动态绑定来实现对子类方法的调用，也就时多态性。
		
		obj.sound = "旺旺";  //可以看出 obj  既可以时动物，也可以是猫，狗。它有不同的表现形式，这就被称为多态。
		                     //多态是一个事物有不同的表现形式或形态。
		                     //多态的三个条件，1，必须要有继承 2，需要有重写， 3，需要父类变量引用子类对象。
		obj.say();
		
		obj = new Cat();
    obj.sound = "喵喵";
		obj.say();//多态的调用方法，首先看父类是否有该方法，无（报错）。然后检查子类是否重写，如果重写，则执行子类的方法，如果没有重写，则执行父类的方法。
		
	}
	
	
}


class Animals{
	String sound;
	public void say(){
		
		System.out.println("我是动物，我的叫声是"+sound);
	}
	
}

class Dog extends Animals{
	public void say(){
		System.out.println("我是一只狗，我的叫声是"+sound);
		
	}
	
}


class Cat extends Animals{
	public void say(){
		System.out.println("我是一只猫，我的叫声是"+sound);
	}
	
}
