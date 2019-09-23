class DemoFinal {
	
	public static void main (String [] args){
		Dog mydog = new Dog();
		mydog.name = "贝贝";
		mydog.pi = 3.14159544646F;
		mydog.say();
		
			
	}
	
	
}

final class Animals{
	String name;
	int age;
	final float pi = 3.1415926F;

	
	public final void say(){
		System.out.println("我是一只动物，我的名字叫"+name);
		
	}
	
	
}


class Dog extends Animals{
	public void say(){
		
		System.out.println("我是一只小狗，我的名字叫"+name);
		System.out.println("我的长度是"+pi);
		
	}
	
	
}

/*
DemoFinal.java:32: 错误: 无法从最终Animals进行继承
class Dog extends Animals{
                  ^
DemoFinal.java:6: 错误: 无法为最终变量pi分配值
                mydog.pi = 3.14159544646F;
                     ^
DemoFinal.java:33: 错误: Dog中的say()无法覆盖Animals中的say()
        public void say(){
                    ^
  被覆盖的方法为final
3 个错误

byte  字节型    1 byte  3127
long 长整型      8 bytes    3L    ,92233720368L
float 单精度浮点数。


long 型以 l结尾。 8bytes



*/


