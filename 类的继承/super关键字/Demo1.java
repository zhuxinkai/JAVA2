public class Demo1{
	
	public static void main (String [] args){
		Dog dog = new Dog("С��",4);
		dog.say();
		
		
		
	}
	
}


class Animals{
	String name;
	int age;
	//����Ĺ��췽��
	public Animals(String name){
		this.name = name;
		
	}
	public Animals(){
		
	}
	
}


class Dog extends Animals{   //���಻��Ϊpublic ���͡� 
	public Dog (String name,int age){
		//���ø���Ĺ��췽�������ø���Ĺ��췽�������ڹ��췽���ĵ�һ�У�����ʼ��λ�ã���
		//�����ٹ��췽��������κη������ù��췽����
		//��һ�����췽���ڲ�ֻ�ܵ���һ�����췽����
		super(name);
		this.age = age;
	//���ע��super �� this������ super ���Ƕ�һ����������ã����ܽ�super��ֵ����һ�������������ֻ��һ��ָʾ���������ø��෽��������ؼ��֡�
	
				
	}
//��дһ��Ĭ�Ϲ�������û�е���super(),Ҳû�е���this()����ʵ����һ��������super(),���������Զ�����һ�����õ�����Ĺ��췽���У����Ҳ���������

	public Dog(){
		
		
		
	}
	
	
	public void say(){
		
		System.out.println(name+age+"����");
		
	}
	
	
}
