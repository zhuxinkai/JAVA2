class Person{
	//���ԣ�����û�г�ʼֵ��λ��һ�������С�
	//��Ա���� name;age;gender ��Ա������ָ�����ԣ�Ҳ���������е�ֱ������������
	String name;
	int age;
	char gender;
	//i�Ǿֲ���������static �����С�2���ֲ����븳��ֵ����ʹ�á�
	// �洢��ջ�С��������ڣ�����ʱ��������ǰ�ķ������������ִ����Ͼ���ʧ��
	//��װ���� classno;  
	
	
	//static ���ε�������ԡ�����Ҫ������Ķ��󻯣��Ϳ���ֱ�ӷ��ʺ����㡣
	//�洢�����ݹ������������Ǵ洢��ջ���߶��С�
	static int personcount = 100;
	
	//static ���� �������ڹ����ࡣstatic �ķ���ֻ����static �����ԡ�
	//����˵���򣬵��𣬴�ӡ�ȷ����ࡣ
	
	
	
	
	private int classno;
	
	
	public void setClassNo(int classno){
		this.classno = classno;
		
		
	}
	
	public int getClassNo(){
		return classno;
		
		
	}
	
	//������ public ���� ��������{}
	public Person(){
		
	}
//Ĭ�Ϲ�����
//�������Ĺ�������������ڴ������Ĺ���������ôĬ�Ϲ�������Ҫ��д��
//����������ͬ�����Ĺ�������
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
	//��Ϊ���������� 
	public void eat(){
		
		System.out.println("���ڳԷ�");
		
		
		
		
	}
	/* ���в��� 1������Ѱ��������main() ,TestPerson class.����������ջ��
	*������һ�����󣬶�������Ա�д����У���ջ����һ��������ָ���ַ����ָ���������
	*�ֱ�Զ�������Խ��и�ֵ��
	*�������ִ�н����󣬵�ַ��ջ������p��Ϊ�������󣬲��ûᱻ�������������ա�
	
	
	*/
	
}


class TestPerson{
	public static void main (String[] args){
		//���� ������ = new ����();
		//�ֲ�������p�Ǿֲ��������ڷ������������еı�����֮λ�ֲ�������
		
		Person p = new Person();
		//�����Ը�ֵ
		p.name = "���ο�";
		
		p.age = 10;
		p.gender = '��';
		p.setClassNo(15);
		int classno = p.getClassNo();
    System.out.println(classno);		
		
		Person p1 = new Person("zhuxinkai",25,'��');
		System.out.println(p1.name+p1.gender+p1.age);
		//�����Եķ��ʣ�����Ҫ���󻯡� ֻҪ����ص�JVM�У����̲�����ֻ�е�JVMֹͣʱ���������ڲ�
		//��ʧ��
		System.out.println(++Person.personcount);
		
		
	}
	
	
	
	
	
	
}