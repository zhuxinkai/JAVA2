class Person{
	//属性，可以没有初始值，位置一定再类中。
	//成员变量 name;age;gender 成员变量是指的属性，也就是在类中的直接下属变量。
	String name;
	int age;
	char gender;
	//i是局部变量，在static 语句块中。2，局部必须赋初值才能使用。
	// 存储在栈中。生命周期，定义时产生，当前的方法的括号语句执行完毕就消失。
	//封装数据 classno;  
	
	
	//static 修饰的类的属性。不需要进行类的对象化，就可以直接访问和运算。
	//存储在数据共享区，而不是存储在栈或者堆中。
	static int personcount = 100;
	
	//static 方法 ，常用于工具类。static 的方法只能用static 的属性。
	//比如说排序，倒叙，打印等方法类。
	
	
	
	
	private int classno;
	
	
	public void setClassNo(int classno){
		this.classno = classno;
		
		
	}
	
	public int getClassNo(){
		return classno;
		
		
	}
	
	//构造器 public 类名 （参数）{}
	public Person(){
		
	}
//默认构造器
//带参数的构造器，如果存在带参数的构造器，那么默认构造器需要重写。
//带有三个不同参数的构造器。
public Person(String name){
	this.name = name;
	
	
}
public Person(String name, int age){
	this(name);
	this.age = age;
	
}	
public Person(String name,int age, char gender){
	this(name,age);
	this.gender = gender;
	
	
}	
	//行为，即方法。 
	public void eat(){
		
		System.out.println("正在吃饭");
		
		
		
		
	}
	/* 运行步骤 1，首先寻找主方法main() ,TestPerson class.将主方法入栈。
	*创建了一个对象，对象的属性被写入堆中，在栈中有一个变量名指向地址，并指向这个对象。
	*分别对对象的属性进行赋值。
	*程序代码执行结束后，地址出栈，对象p成为匿名对象，不久会被垃圾回收器回收。
	
	
	*/
	
}


class TestPerson{
	public static void main (String[] args){
		//类名 变量名 = new 类名();
		//局部变量。p是局部变量，在方法或者语句块中的变量称之位局部变量。
		
		Person p = new Person();
		//给属性赋值
		p.name = "朱鑫凯";
		
		p.age = 10;
		p.gender = '男';
		p.setClassNo(15);
		int classno = p.getClassNo();
    System.out.println(classno);		
		
		Person p1 = new Person("zhuxinkai",25,'男');
		System.out.println(p1.name+p1.gender+p1.age);
		//类属性的访问，不需要对象化。 只要类加载到JVM中，即刻产生。只有当JVM停止时，生命周期才
		//消失。
		System.out.println(++Person.personcount);
		
		
	}
	
	
	
	
	
	
}