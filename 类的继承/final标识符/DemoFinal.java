class DemoFinal {
	
	public static void main (String [] args){
		Dog mydog = new Dog();
		mydog.name = "����";
		mydog.pi = 3.14159544646F;
		mydog.say();
		
			
	}
	
	
}

final class Animals{
	String name;
	int age;
	final float pi = 3.1415926F;

	
	public final void say(){
		System.out.println("����һֻ����ҵ����ֽ�"+name);
		
	}
	
	
}


class Dog extends Animals{
	public void say(){
		
		System.out.println("����һֻС�����ҵ����ֽ�"+name);
		System.out.println("�ҵĳ�����"+pi);
		
	}
	
	
}

/*
DemoFinal.java:32: ����: �޷�������Animals���м̳�
class Dog extends Animals{
                  ^
DemoFinal.java:6: ����: �޷�Ϊ���ձ���pi����ֵ
                mydog.pi = 3.14159544646F;
                     ^
DemoFinal.java:33: ����: Dog�е�say()�޷�����Animals�е�say()
        public void say(){
                    ^
  �����ǵķ���Ϊfinal
3 ������

byte  �ֽ���    1 byte  3127
long ������      8 bytes    3L    ,92233720368L
float �����ȸ�������


long ���� l��β�� 8bytes



*/


