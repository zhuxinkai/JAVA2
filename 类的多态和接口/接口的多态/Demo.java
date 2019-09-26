class Demo{
	public static void main(String [] args){
		
		Leader leader = new Leader();
		
		leader.checkLession(new JavaTeacher("张三"));//通过构造器传参。生成对象直接传给方法。
		leader.checkLession(new PhpTeacher("李四"));
		
		
	}
	
}

interface TeacherInter{       //接口不是public 类型的
	public void teacherLession();
	public void sleep();
		
}

class JavaTeacher implements TeacherInter{
	String name;
	int age;
	public JavaTeacher(String name){
		this.name = name;
	}
	
 public void teacherLession(){
 	System.out.println(name+"老师教JAVA,正在上课");
 	
 }
 public void sleep(){
 	System.out.println(name+"老师教JAVA，在绳子上睡觉");
 	
 }
	

}

class PhpTeacher implements TeacherInter{
	String name;
	int age;
	public PhpTeacher(String name){
		this.name = name;
	}
	
 public void teacherLession(){
 	System.out.println(name+"老师教PHP,正在上课");
 	
 }
 public void sleep(){
 	System.out.println(name+"老师教PHP，在床上睡觉");
 	
 }
	

}


class Leader{
	public void checkLession(TeacherInter t){    //接口的多态与类的多态类似，只需要传相应的类型参数即可。
		if (t instanceof JavaTeacher){   //instanceof 判断是否属于该类的子类或者是该类对象。。返回blooen类型 true 或者 false;
				System.out.println("开始考察JAVA老师");
			
		}else{  System.out.println("开始考察PHP老师"); }

 t.teacherLession();
 t.sleep();
 
 System.out.println("考察结束");		

		
	}
	
	
	
}