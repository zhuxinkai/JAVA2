class Demo{
	public static void main (String [] args){
		Animals obj = new Animals();
		obj.sound = "不知道";
		obj.say();
		obj = new Dog();      //多态的赋值与对象化与其他不一致。
		
		obj.sound = "旺旺";
		obj.say();
		
		obj = new Cat();
    obj.sound = "喵喵";
		obj.say();
		
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
