class Demo{
	public static void main (String [] args){
		Animals obj = new Animals();
		obj.sound = "��֪��";
		obj.say();
		obj = new Dog();      //��̬�ĸ�ֵ�������������һ�¡�
		
		obj.sound = "����";
		obj.say();
		
		obj = new Cat();
    obj.sound = "����";
		obj.say();
		
	}
	
	
}


class Animals{
	String sound;
	public void say(){
		
		System.out.println("���Ƕ���ҵĽ�����"+sound);
	}
	
}

class Dog extends Animals{
	public void say(){
		System.out.println("����һֻ�����ҵĽ�����"+sound);
		
	}
	
}


class Cat extends Animals{
	public void say(){
		System.out.println("����һֻè���ҵĽ�����"+sound);
	}
	
}
