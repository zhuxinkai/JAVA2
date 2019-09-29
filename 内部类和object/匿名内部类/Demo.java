//匿名内部类是在方法体内部实现匿名类。

class Demo{
	public static void main (String[] args){
		InterDemo.method();
		
		
	}
	
	
}


interface MyInter{
	
	public void show();
}



class InterDemo{
	public static void method(){
		new MyInter(){
			public void show(){
				int i = 9;
				System.out.println("我是一个内部匿名类" + i);
				
				
			}
			
			
		}.show();
		
		
	}
	
	
}