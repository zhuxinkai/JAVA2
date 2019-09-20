/*
此范例中用来说明在继承中，如果父类中
私有化属性private 如何进行操作。


*/
class Teacher{
	private String name;
	private int age;
	//参数必须带上数据类型。
	public void setName(String name){
		this.name = name;
		
		
	}
	
		public void sleep(){
		System.out.println(getName()+"JAVA老师正在睡觉"+"今年他"+getAge());
		
		
	}
	public String getName(){
		
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
		
		
	}
}
//java 只能做单继承。可以做多级继承。   extends b,c ,这为多继承。  java 可以b继承 a  c继承b.
class JavaTeacher extends Teacher{	
	
}

class PhpTeacher extends Teacher{	
	
	
}


class ExtendsDemo{
	
	public static void main (String [] args){
		JavaTeacher jt = new JavaTeacher();
		jt.setName("xiaomeng");
		jt.setAge(18);
		jt.sleep();
		
		
		PhpTeacher pt = new PhpTeacher();
		//赋值是用方法进行赋值
		
		pt.setName("zhuxinkai");
		pt.setAge(38);
		pt.sleep();
		
		
		
		    
		
		
		
		
	}
	
	
}