class InterfaceDemo{
	public static void main (String [] args){
		JavaTeacher jt = new JavaTeacher();
    jt.teachLession();
   	jt.work();	
   	System.out.println(jt.PI);
   	 	System.out.println(TeacherService.PI);
   	
	}
	
	
}
// �ӿھ��ǲ����о��巽��ʵ�ֵĳ����ࡣ�ӿ���һ��������࣬���Ը�ʽΪ  interface �ӿ���{  �ӿڷ���} �ĸ�ʽ��д�ӿڡ�

interface  TeacherService{
	public void teachLession();
  public void work();
//�ӿ��в�Ҫʹ��private , static. final 
	float PI = 3.1415926f;
	//�ڽӿڶ��嶼�ǳ����������������������Ǵ�д���������֮�����»��������ӡ� �������ǲ��ɸ��ĵģ�����ͨ���ӿ�����������ʣ�
	//Ҳ����ͨ���ӿ������ʣ��������Է�����ʽ��
	
}


//�����ڳ����಻��ʵ���������ӿ�Ҳ���ܱ�ʵ������
/*
class ���� implements �ӿ������ӿ���{ 
   //ʵ��һ���ӿ��еķ���

 }
*
*/


class JavaTeacher implements TeacherService {
// ���нӿ��еķ�������Ҫʵ�֡�
	public void teachLession(){
		
		System.out.println("JAVA��ʦ���ڽ̿�");
		
	}
	public void work(){
		
		System.out.println("JAVA��ʦ���ڹ���");
	}
	
	
}