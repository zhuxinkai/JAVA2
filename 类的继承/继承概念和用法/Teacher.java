/*
�˷���������˵���ڼ̳��У����������
˽�л�����private ��ν��в�����


*/
class Teacher{
	private String name;
	private int age;
	//������������������͡�
	public void setName(String name){
		this.name = name;
		
		
	}
	
		public void sleep(){
		System.out.println(getName()+"JAVA��ʦ����˯��"+"������"+getAge());
		
		
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
//java ֻ�������̳С��������༶�̳С�   extends b,c ,��Ϊ��̳С�  java ����b�̳� a  c�̳�b.
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
		//��ֵ���÷������и�ֵ
		
		pt.setName("zhuxinkai");
		pt.setAge(38);
		pt.sleep();
		
		
		
		    
		
		
		
		
	}
	
	
}