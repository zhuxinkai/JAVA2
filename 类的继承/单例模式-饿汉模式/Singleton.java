class Singleton{
	private static Singleton s;  //定义数据类型，用类的名字定义。

	 private Singleton(){
	 	
	 }
	
	public static Singleton getInstance(){
 //   public static getInstance(){   方法没有放回数据的类型。
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
/*



public final class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}


*/
