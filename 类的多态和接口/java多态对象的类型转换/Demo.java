//这里所说的对象类型转换，是指存在继承关系的对象，不是任意类型的对象。

class Demo{
	public static void main (String [] args){
		SuperClass superObject = new SuperClass();
		SonClass sonObject = new SonClass();
		//
		 //SonClass sonObject1 = (SonClass)superObject; //不能在直接将父类的对象强制转换成子类类型。
		
		superObject = sonObject;   //向上转换的子类对象
		SonClass sonObject1 = (SonClass)superObject;   //再次转换为子类类型。
		//子类对象必须向上转型后，才能向下转型。
		
		
		
		
	}

		
		
		
		
	}
	
	
	



class SuperClass{}
class SonClass extends SuperClass{}


//总结，对象类型转换在程序运行时检查，向上转换会自动进行，向下转型的对象必须是当前引用类型的子类。（superObj = sonObj;进行转换）。


