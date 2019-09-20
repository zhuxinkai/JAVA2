class JavaTeacher{
	String name;
	int age;
	public void teachJava(){
		
		
		System.out.println(name+" 老师正在教JAVA"+"他已经"+age+"岁了");
	}
	
	
	
}

class ObjectiveTeacher extends JavaTeacher{
	
}
/*
类的继承
class 子类名 extends 父类名{
  类的属性
  类的方法
}

子类继承父类，继承属性和方法。（暂时不考虑 final)，父类更抽象，子类更具体。

注意，父类中private 的属性无法继承。如果需要操作，必须通过set 和 get 的方法进行操作。私有的方法是无法继承下来的。

*/

class ExtendsDemo{
	public static void main (String [] args){
		//
	ObjectiveTeacher s = new ObjectiveTeacher();
	
	s.age = 38;
	s.name = "zhuxinkai";
	s.teachJava();
		
		
		
	}
	
	
	
}