class JavaTeacher{
	String name;
	int age;
	public void teachJava(){
		
		
		System.out.println(name+" ��ʦ���ڽ�JAVA"+"���Ѿ�"+age+"����");
	}
	
	
	
}

class ObjectiveTeacher extends JavaTeacher{
	
}
/*
��ļ̳�
class ������ extends ������{
  �������
  ��ķ���
}

����̳и��࣬�̳����Ժͷ���������ʱ������ final)�������������������塣

ע�⣬������private �������޷��̳С������Ҫ����������ͨ��set �� get �ķ������в�����˽�еķ������޷��̳������ġ�

*/

class ExtendsDemo{
	public static void main (String [] args){
		//
	ObjectiveTeacher s = new ObjectiveTeacher();
	
	s.age = 38;
	s.name = "zhuxinkai";
	s.teachJava();
		
		
		
	}
	
	
	
}