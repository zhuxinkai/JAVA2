class Super{
	String name;
	int age;
	
	public Super(){
		
		 System.out.println("父类构造器被调用");
		 
	}
	
	
}

class SuperSon extends Super{
	
	public SuperSon(){
		super();
		System.out.println("子类构造器被调用");
		
	}
	
	
	
}


class SuperDemo{
	public static void main (String [] args){
			SuperSon s = new SuperSon();
		
	}

	
	
	
	
	
	
}