class InterfaceExtends{
	public static void main(String[] args){
		
		AC jj = new AC();
		jj.say();
		jj.work();
		jj.stuid();
		
		
	}
	
	
	
}


//JDK 1.7之后，接口允许多继承和多级继承。
//可以做多实现。  class JavaTeacher implements A,B{      }


interface A{
	public void say();
	
}

interface B{
	
	public void stuid();
}

interface C extends A,B{
	
	public void work();
	
}


class AC implements C{
	public void say(){
		System.out.println("我是一个A接口方法");
	}
	
	public void stuid(){
		System.out.println("我是一个B接口方法");
		
	}
	public void work(){
		
		System.out.println("我是一个C接口方法");
		
	}
}




//D:\JAVA2\类的多态和接口\接口的继承>java InterfaceExtends
//我是一个A接口方法
//我是一个C接口方法
//我是一个B接口方法
// 出输出接口，可以看出执行多继承接口的执行顺序。  
