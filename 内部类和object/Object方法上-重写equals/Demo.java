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
		System.out.println(studentA.equals(studentB));   //��д��equals��ִ�С�
		
		
	}
	
	
}


class Student{
	
	private String name;
	private int age;
	private char gender;   //˽�л����ԣ����з�װ��
	
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
	}                               //���з������ṩ�����Խ��в�����
	
public boolean equals(Object obj){  //��дequals ���������ݲ���ʱ����ΪObject ���������super�࣬���ԣ����е�����󶼿��Խ��д��ݡ�
	boolean result;                 //����Ϊboolean ���ͣ�����Ҫ����һ������ֵ��
	if (obj instanceof Student){    //�жϣ����ݵ��ࣨ���󻯺��Ƿ������ڸ����������߱���
	Student s = (Student)obj;          //���жԴ��ݲ��������ǿ��ת����
	if(s.getName().equals(this.name)&&s.getAge() == this.age && s.getGender() == this.gender ){  
		  //�жϣ����ڴ��ݲ����͵��÷����Ķ���������Խ��жԱȡ�
		  //�ڱ����п��Է���private�����ԡ�
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


//hashCode ����дequals����ʱ�����Ҳ��дhashCode . (JDK�еı�ע��  ;



//final finally finallize ������
//finalize  �����еĶ���û��������������ǣ��ͻᱻjvm ����finalize�����������
