class InnterDemo{
	public static void main (String[] args){
		//�ڲ�����󻯵ĸ�ʽ��
		
		//�ⲿ��.�ڲ��� ������ = new �ⲿ�����.new �ڲ������;
		//Demo.Innter innter = new Demo().new Innter();
		
		
		
		Demo.Innter innter = new Demo().new Innter();
		innter.printInnter();
		
	}
	
	//�����ڲ���ķ���������ʹ�����ⲿ���ж����ڲ�����ʵ�֡�
}

class Demo{
	
	
	class Innter{
		String name = "����һ���ڲ���";
	  public void printInnter(){
	  	System.out.println(name);
	  }
		
	}
	
}


