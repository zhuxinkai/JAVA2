/*
����ģʽ
class Singleton{
	private static Singleton s;

	 private Singleton(){
	 	
	 } ͨ��˽�л�������,��ֹ�ⲿ���ù�������ͬʱ�ṩһ����̬�������������Ψһ�Ķ���
	
	public static Singleton getInstance(){
		if (s == null){
			s =  new Singleton();
		}
		return s;
	}
	
}	

class TestSingle{
	public static void main (String [] args){
		
	Singleton s = Singleton.getInstance();
	
	System.out.println(s);
	
  Singleton s1 = Singleton.getInstance();
	System.out.println(s1);
	
	Singleton s2 = Singleton.getInstance();
	System.out.println(s2);
	
	Singleton s3 = Singleton.getInstance();
	System.out.println(s3);
	
	
	}
o(	{



	
}



*/

/*
*
*����ģ��


*/


class Demo{
	public static void main (String [] args){
		SonInterDo s = new SonInterDo();
		s.allToDo();
	}
	
}

abstract class InterDo{
	public void toDo(){
		
	}
	
	public abstract void onlyKnow();
		
	
	public long everyToDo(){
		long startTime =System.currentTimeMillis();
		return startTime;
	}

public void allToDo(){
	toDo();
	onlyKnow();
	everyToDo();
} 	
	
	
}


class SonInterDo extends InterDo{
	
	public void onlyKnow(){}
	public void toDo(){
		for(int i = 0;i<100;i++){
			System.out.println("��������ִ��"+i+"%");
		}
		
	}


public void allToDo(){
	long startTime = everyToDo();

	toDo();
  long endTime = everyToDo();
  long resultTime = endTime-startTime;
 System.out.println("����ִ��ʱ����"+resultTime+"����");	
	
}	
	
}


