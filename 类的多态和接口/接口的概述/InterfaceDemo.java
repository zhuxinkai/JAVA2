class InterfaceDemo{
	public static void main (String [] args){
		JavaTeacher jt = new JavaTeacher();
    jt.teachLession();
   	jt.work();	
   	System.out.println(jt.PI);
   	 	System.out.println(TeacherService.PI);
   	
	}
	
	
}
// 接口就是不能有具体方法实现的抽象类。接口是一种特殊的类，所以格式为  interface 接口名{  接口方法} 的格式来写接口。

interface  TeacherService{
	public void teachLession();
  public void work();
//接口中不要使用private , static. final 
	float PI = 3.1415926f;
	//在接口定义都是常量，（常量的命名规则都是大写，多个单词之间用下划线来连接。 常量都是不可更改的，可以通过接口类对象化来访问，
	//也可以通过接口名访问，即类属性访问形式。
	
}


//类似于抽象类不能实例化。而接口也不能被实例化。
/*
class 类名 implements 接口名，接口名{ 
   //实现一个接口中的方法

 }
*
*/


class JavaTeacher implements TeacherService {
// 所有接口中的方法都需要实现。
	public void teachLession(){
		
		System.out.println("JAVA老师正在教课");
		
	}
	public void work(){
		
		System.out.println("JAVA老师正在工作");
	}
	
	
}