public class Demo{
	public static void main(String[] args){
		Dog dog = new Dog();
		//��new ����ʱ����ע��һ��Ҫ��()
		dog.move();
		
		
		
	}

}

class Animals{
	private String desc = "plseas remenber dog is the best friend with people";
	public String getDesc(){return desc;}
	public void move(){
		System.out.println("dog is move");
		
	
	}
	
	
}

class Dog extends Animals{
	//��������Ҳʱ�����ŵ�
	public void move() {
		
		
		//��ȡ�Ѿ������˵ķ����������֣���move �����������ֽ�������д��Ϊ�˵��ø����ͬ��
		//��������ʹ��super�ؼ��֡�
	   super.move();
	   
	   System.out.println("dog can walk and run");
	  // ���ø���������Ϊprivate�ı�������ʵ�ڵ��ø����еķ���ʱһ��;������Ҫ�����ṩ���ظñ����ķ�����
	   System.out.println(super.getDesc());
	
  }
	
	
	
}