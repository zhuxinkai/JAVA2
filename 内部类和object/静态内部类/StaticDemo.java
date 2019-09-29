class StaticDemo{
	
	public static void main (String[] args){
		
		Demo.DemoInter di = new Demo.DemoInter();
	di.show();
	di.show1();
	System.out.println("--------------------");
	Demo.show2();
		
	}
}


class Demo{
	
	static class DemoInter{
		public void show(){
			
			
			System.out.println("这是一个内部静态类方法");
		}
	public static void show1(){
		
		System.out.println("这是一个内部类的静态类的静态方法");
	}	
		
	}
	
	public static void show2(){
		//为啥这个是只能在方法中实现；
	DemoInter di = new DemoInter();
	di.show();
	di.show1();
	
}
	
	
}