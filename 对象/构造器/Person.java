class Person{
			
			int age;
			String name;
			char gender;
			
			public void printPerson(){
				
				System.out.println("my name is "+ name +" I am "+age+" old "+"I am "+gender);
						
			}
	
	public Person(){
		
		
	}
	/*
	��Ҫ��ʾ��������ص�Ĭ�Ϲ�������������д��ڴ������Ĺ������Ļ���
	*/
	public Person(String name){
		this.name = name;
		
		
	}
	
	public Person(String name,int age){
		this(name);
		//�൱��ִ����Person(name);
		this.age = age;
		
		
	}
	public Person(String name,int age,char gender){
	 this(name,age);
		this.gender = gender;
		
	}
	
	
	
	
	
	
}


class TestPerson{
	public static void main(String[] args){
		Person p = new Person();
		p.printPerson();
		System.out.println("----------------------");
		
		Person p1 = new Person("zhuxinkai");
		p1.printPerson();
		System.out.println("----------------------");
		
		Person p2 = new Person("zhuxinkai",20);
		p2.printPerson();
		System.out.println("----------------------");
		
		Person p3 = new Person("zhuxinkai",20,'��');
		p3.printPerson();
		System.out.println("----------------------");
		
		
		
		
		
		
		
	}
	
	
	
}