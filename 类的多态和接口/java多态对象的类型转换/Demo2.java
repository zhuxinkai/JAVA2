public class Demo2{
	
	
	public static void main(String [] args) {
		SuperClass superObj = new SuperClass();
		SonClass sonObj = new SonClass();
		
		if (superObj instanceof SonClass){ //如果变量引用的是当前类或者子类实例，那么返回true ,否则返回false
			SonClass sonObj1 = (SonClass)superObj;
		}else{
			System.out.println("1不能转换");
		}
		
		superObj = sonObj;
		
		
		if (superObj instanceof SonClass){   
			SonClass sonObj1 = (SonClass)superObj;
		}else{
			System.out.println("2不能转换");
		}
		
		
	}
}

class SuperClass{}
class SonClass extends SuperClass{}
//总结，对象类型转换在程序运行时检查，向上转换会自动进行，向下转型的对象必须是当前引用类型的子类。（superObj = sonObj;进行转换）。