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
			System.out.println("�����ڲ�˽���������"+j);
			
		}
	}
	//˽�л��ڲ���ֻ�����ⲿ���б�ʵ������
	Innter innter = new Innter();
	public void printDemoInt(){
		innter.printInt();
		
	}
	
	
}

