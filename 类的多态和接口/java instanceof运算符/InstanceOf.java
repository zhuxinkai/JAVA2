//多态带来一个问题，如何判断一个变量所实际引用的对象的类型。
//如果变量引用的是当前类或它的子类的实例，instanceof 返回true ,否则返回false
class InstanceOf{
	public static void main(String [] args){
		People obj = new People();
		
		if(obj instanceof Object){
			System.out.println("我是一个对象");
			
			
		}
		if(obj instanceof People){
			
			System.out.println("我是一个人类");
			
		}
		
	 if(obj instanceof Teacher){
	 	
	 	System.out.println("我是一个老师");

	 }	
		
		if(obj instanceof President){
			
			System.out.println("我是一个校长");
			
		}
		

	
	System.out.println("--------------------------------");
	
    obj = new Teacher();
	
		
		if(obj instanceof Object){
			System.out.println("我是一个对象");
			
			
		}
		if(obj instanceof People){
			
			System.out.println("我是一个人类");
			
		}
		
	 if(obj instanceof Teacher){
	 	
	 	System.out.println("我是一个老师");

	 }	
		
		if(obj instanceof President){
			
			System.out.println("我是一个校长");
			
		}
	
		}
	
}

class People{}
class Teacher extends People{}
class President extends Teacher{}
