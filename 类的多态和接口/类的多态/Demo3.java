class Demo3{
	public static void main (String [] args){
		
		Leaders leader = new Leaders();
		
		    leader.checkTeacher(new Teacher());
		
			  leader.checkTeacher(new JavaTeacher());
		
				leader.checkTeacher(new PhpTeacher());
				
				
	}
		
}

class Teacher {
	public void techLession(){
		System.out.println("��֪����������ʦ�ڽ���");
	}
	
}

class JavaTeacher extends Teacher{
	public void techLession(){
		System.out.println("Java��ʦ���ڽ���");
		
		
	}
	
}

class PhpTeacher extends Teacher{
 public void techLession(){
 	System.out.println("PHP��ʦ���ڽ���");
 	
 }	
	
}

class Leaders{
	
	public void checkTeacher(Teacher t){
		System.out.println("��ʼ������ʦ");
		t.techLession();
		System.out.println("������ʦ����");
		
		
	}
	
	
}