class NoNameClass{
			public static void main (String [] args){
				//�������ʵ�֣�ͨ���ӿڡ�		
			new MyInter(){
			public void method(){
				
				System.out.println("����һ��û�����ֵ���");
			}	
				
			}.method();		
						//���������ı���ָ����Ҫ������һ���������ʵ�֡�
						//
						
			MyInter mi = new MyInter(){
			public void method(){
				
				System.out.println("����һ��û�����ֵ���2");
			}	
				
			};
			
			mi.method();
			
			
			
			
			
			ImplementMyInter md = new ImplementMyInter();
			md.method();
			
			
				
			}
			
			
		
	
}


interface MyInter{
	public void method();
	
}

class ImplementMyInter implements MyInter{
	public void method(){
		System.out.println("����һ�������ֵ���");
		
	}
	
}
