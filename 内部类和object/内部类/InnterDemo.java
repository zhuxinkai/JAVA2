class InnterDemo{
	public static void main (String[] args){
		//内部类对象化的格式是
		
		//外部类.内部类 变量名 = new 外部类对象.new 内部类对象;
		//Demo.Innter innter = new Demo().new Innter();
		
		
		
		Demo.Innter innter = new Demo().new Innter();
		innter.printInnter();
		
	}
	
	//访问内部类的方法，可以使用在外部类中对象化内部类来实现。
}

class Demo{
	
	
	class Innter{
		String name = "我是一个内部类";
	  public void printInnter(){
	  	System.out.println(name);
	  }
		
	}
	
}


