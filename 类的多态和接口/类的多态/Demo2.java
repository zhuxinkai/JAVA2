class Demo2{
	public static void main (String [] args){
		Master ma = new Master();
		ma.feed(new Animals(),new Food());  //ma.feed(Animals an=new Animals();,Food f = new Food();)
		ma.feed(new Dog(),new Bone());
		ma.feed(new Cat(),new Fish());
		
		//Master 类的feed 有两个参数，分别是Animals类型和Food类型，因为是父类，所有可以将子类的实例传递给它，这样Master类就不需要多个方法来给不同的动物喂食。
		
		
		
	}
	
	
	
}

//Animals及其子类
class Animals{
	public void eat(Food f){
		System.out.println("我是一只动物，我正在吃"+f.getFood());
		
	}
	
}

class Dog extends Animals{
	public void eat(Food f){
		System.out.println("我是一只狗，我正在吃"+f.getFood());
		
	}
	
}

class Cat extends Animals{
	public void eat(Food f){
		System.out.println("我是一只猫，我正在吃"+f.getFood());
		
	}
	
}


class Food{
	
	public String getFood(){
		return "食物";
		
	}
}

class Bone extends Food{
	
	public String getFood(){
		return "骨头";
		
	}
}


class Fish extends Food{
	
	
	public String getFood(){
		return "鱼";
	}
}


class Master{
	
	public void feed(Animals an,Food f){
		an.eat(f);
		
		
	}
	
}
//java调用方法的详细流程。
//动态绑定（基于方法表（method lable);
//1,编译器查看对象的声明类型和方法名，编译器获得所有可能被调用的候选方法列表。
//2，重载解析（如果在所有名为func的方法中，存在一个与提供的参数签名完全匹配的方法，那么就选择这个方法。
//3如果方法的修饰符是private ,static ,final ,或者是构造器，那么编译器将可以准确地知道应该调用哪个方法。
//4，


// JVM 首先访问obj的实际类型的方法表，可能是Animal类的方法表，也可能是Cat类及其子类的方法表。
//JVM 在方法表中搜索与cry()匹配的方法，找到后，就知道它属于哪个类了。
//JVM调用该方法。
