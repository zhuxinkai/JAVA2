class StaticDemo{
	
	public static void main (String[] args){
		
		Demo.DemoInter di = new Demo.DemoInter();
	di.show();
	di.show1();
	System.out.println("--------------------");
	Demo.show2();
		
	}
}


class Demo{
	
	static class DemoInter{
		public void show(){
			
			
			System.out.println("����һ���ڲ���̬�෽��");
		}
	public static void show1(){
		
		System.out.println("����һ���ڲ���ľ�̬��ľ�̬����");
	}	
		
	}
	
	public static void show2(){
		//Ϊɶ�����ֻ���ڷ�����ʵ�֣�
	DemoInter di = new DemoInter();
	di.show();
	di.show1();
	
}
	
	
}