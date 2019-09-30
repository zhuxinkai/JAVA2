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
		System.out.println(studentA.equals(studentB));
		
		
	}
	
	
}


class Student{
	
	private String name;
	private int age;
	private char gender;
	
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
	}
	
public boolean equals(Object obj){
	boolean result;
	Student s = (Student)obj;
	if(s.getName().equals(this.name)&&s.getAge() == this.age && s.getGender() == this.gender ){
		result = true;
	}else{
		result = false;
	}
	return result;
	
}
	
	
	
	
}