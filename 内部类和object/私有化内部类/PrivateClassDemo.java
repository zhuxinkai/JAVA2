class PrivateClassDemo{
	public static void main (String[] args){
		Demo demo = new Demo();
		demo.printDemoInt();
		
	}
	
	
}

class Demo{
	
	private class Innter{
		
		int j = 9;
		public void printInt(){
			System.out.println("这是内部私有类的数据"+j);
			
		}
	}
	//私有化内部类只能在外部类中被实例化。
	Innter innter = new Innter();
	public void printDemoInt(){
		innter.printInt();
		
	}
	
	
}

