public class Demo{
	public static void main(String[] args){
		Dog dog = new Dog();
		//在new 对象时，请注意一定要加()
		dog.move();
		
		
		
	}

}

class Animals{
	private String desc = "plseas remenber dog is the best friend with people";
	public String getDesc(){return desc;}
	public void move(){
		System.out.println("dog is move");
		
	
	}
	
	
}

class Dog extends Animals{
	//方法后面也时又括号的
	public void move() {
		
		
		//点取已经覆盖了的方法。此例种，对move 方法在子类种进行了重写，为了调用父类的同名
		//方法，则使用super关键字。
	   super.move();
	   
	   System.out.println("dog can walk and run");
	  // 调用父类种申明为private的变量。其实于调用父类中的方法时一个途径。需要父类提供返回该变量的方法。
	   System.out.println(super.getDesc());
	
  }
	
	
	
}