public class Demo{
	public static void main (String [] args){
		
		
		//����Ķ���ͷ���
		Animals myAnimals = new Animals("����");
		myAnimals.say();
		
		
		//����Ķ���ͷ���
		Dog myDog = new Dog("����");
		myDog.say();
				
	}
	
}

class Animals{
	String name;
	public Animals(String name){
		this.name = name;
		
	}
	public Animals(){}
	
	
	public void say(){
		
		System.out.print("����һֻСֻ����ҵ�������"+name+"\n");
		
		
	}
	
	
}


class Dog extends Animals{
	public Dog(String name){
		super(name);  //���๹�����ĵ��á�
		
		this.name = name;  
	}
 public void say(){
 	System.out.print("����һֻС�����ҵ�������"+name+"\n");
 	
 }	
	
}


/*
�����ĸ���/����
1�������ĸ��Ƿ������ͣ��������ƣ������б������ԭ��������ͬ��
2�����Ƿ������ܱ�ԭ���������Բ��ԭ����Ȩ�޲�������С����
3�����ǵķ����������ԭ�����׳������쳣��
4��ԭ����Ϊfinal����ʱ���������ǡ�
5��ԭ��������Ϊprivate �������·���ֻ��һ���������·��������Ƕ�ԭ�����ĸ��ǡ�
6����̬������static Ҳ���ᷢ�����ǣ���Ϊ��̬�������ڱ����ʱ��Ѿ�̬����������������ͽ���ƥ�䡣





*/