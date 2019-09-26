/*
单例模式
class Singleton{
	private static Singleton s;

	 private Singleton(){
	 	
	 } 通过私有化构造器,禁止外部调用构造器。同时提供一个静态方法，调用这个唯一的对象。
	
	public static Singleton getInstance(){
		if (s == null){
			s =  new Singleton();
		}
		return s;
	}
	
}	

class TestSingle{
	public static void main (String [] args){
		
	Singleton s = Singleton.getInstance();
	
	System.out.println(s);
	
  Singleton s1 = Singleton.getInstance();
	System.out.println(s1);
	
	Singleton s2 = Singleton.getInstance();
	System.out.println(s2);
	
	Singleton s3 = Singleton.getInstance();
	System.out.println(s3);
	
	
	}

	
	
}



*/

/*
*
*抽象模板


*/

