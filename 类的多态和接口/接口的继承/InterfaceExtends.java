class InterfaceExtends{
	public static void main(String[] args){
		
		AC jj = new AC();
		jj.say();
		jj.work();
		jj.stuid();
		
		
	}
	
	
	
}


//JDK 1.7֮�󣬽ӿ������̳кͶ༶�̳С�
//��������ʵ�֡�  class JavaTeacher implements A,B{      }


interface A{
	public void say();
	
}

interface B{
	
	public void stuid();
}

interface C extends A,B{
	
	public void work();
	
}


class AC implements C{
	public void say(){
		System.out.println("����һ��A�ӿڷ���");
	}
	
	public void stuid(){
		System.out.println("����һ��B�ӿڷ���");
		
	}
	public void work(){
		
		System.out.println("����һ��C�ӿڷ���");
		
	}
}




//D:\JAVA2\��Ķ�̬�ͽӿ�\�ӿڵļ̳�>java InterfaceExtends
//����һ��A�ӿڷ���
//����һ��C�ӿڷ���
//����һ��B�ӿڷ���
// ������ӿڣ����Կ���ִ�ж�̳нӿڵ�ִ��˳��  
