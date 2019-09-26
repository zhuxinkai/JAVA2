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
		System.out.println("不知道哪门子老师在讲课");
	}
	
}

class JavaTeacher extends Teacher{
	public void techLession(){
		System.out.println("Java老师正在讲课");
		
		
	}
	
}

class PhpTeacher extends Teacher{
 public void techLession(){
 	System.out.println("PHP老师正在讲课");
 	
 }	
	
}

class Leaders{
	
	public void checkTeacher(Teacher t){
		System.out.println("开始考察老师");
		t.techLession();
		System.out.println("考察老师结束");
		
		
	}
	
	
}