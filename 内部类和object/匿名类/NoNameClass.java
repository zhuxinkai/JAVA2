class NoNameClass{
			public static void main (String [] args){
				//匿名类的实现，通过接口。		
			new MyInter(){
			public void method(){
				
				System.out.println("我是一个没有名字的类");
			}	
				
			}.method();		
						//这个匿名类的变量指向，需要完整的一个匿名类的实现。
						//
						
			MyInter mi = new MyInter(){
			public void method(){
				
				System.out.println("我是一个没有名字的类2");
			}	
				
			};
			
			mi.method();
			
			
			
			
			
			ImplementMyInter md = new ImplementMyInter();
			md.method();
			
			
				
			}
			
			
		
	
}


interface MyInter{
	public void method();
	
}

class ImplementMyInter implements MyInter{
	public void method(){
		System.out.println("我是一个有名字的类");
		
	}
	
}
