//�����ڲ������ڷ������ڲ�ʵ�������ࡣ

class Demo{
	public static void main (String[] args){
		InterDemo.method();
		
		
	}
	
	
}


interface MyInter{
	
	public void show();
}



class InterDemo{
	public static void method(){
		new MyInter(){
			public void show(){
				int i = 9;
				System.out.println("����һ���ڲ�������" + i);
				
				
			}
			
			
		}.show();
		
		
	}
	
	
}