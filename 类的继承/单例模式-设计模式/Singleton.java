class Singleton{
	private static Singleton s = new Singleton();

	 private Singleton(){
	 	
	 }
	
	public static Singleton getInstance(){
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