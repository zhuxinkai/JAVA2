class Demo{
	public static void main (String[] args){
		Student studentA = new Student();
		Student studentB = new Student();
		studentA.setName("misszhangshan");
		studentA.setAge(15);
		studentA.setGender('1');
		studentB.setName("misszhangshan");
		studentB.setAge(15);
		studentB.setGender('2');
		System.out.println(studentA.equals(studentB));   //重写后equals的执行。
		
		
	}
	
	
}


class Student{
	
	private String name;
	private int age;
	private char gender;   //私有化属性，进行封装。
	
	public void setName(String name){
		this.name = name;
		
		
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
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public char getGender(){
		return gender;
	}                               //公有方法，提供对属性进行操作。
	
public boolean equals(Object obj){  //重写equals 方法，传递参数时，因为Object 是所有类的super类，所以，所有的类对象都可以进行传递。
	boolean result;                 //方法为boolean 类型，所以要定义一个返回值。
	if (obj instanceof Student){    //判断，传递的类（对象化后）是否是属于该类的子类或者本身。
	Student s = (Student)obj;          //进行对传递参数对象的强制转换。
	if(s.getName().equals(this.name)&&s.getAge() == this.age && s.getGender() == this.gender ){  
		  //判断，对于传递参数和调用方法的对象本身的属性进行对比。
		  //在本类中可以访问private的属性。
		  //if(s.name().equals(this.name)&&s.age == this.age && s.gender == this.gender){
		result = true;
	}else{
		result = false;
	}

	}else{
		result = false;
	}
	
		return result;
	
}
	
	
	
	
}


//hashCode 在重写equals方法时，最好也重写hashCode . (JDK中的备注）  ;



//final finally finallize 的区别。
//finalize  当堆中的对象没有针对他的引用是，就会被jvm 调用finalize方法清除掉。
