class DemoAbstract{
	public static void main (String [] args){
		Teacher myteacher = new Teacher();
		myteacher.setName("zhuxinkai");
		myteacher.work();
		
		Driver mydriver = new Driver();
		mydriver.setName("LIUSHA");
		mydriver.work();
				
		
	}
		
	
}


abstract class People{ //�����࣬�����಻�ܶ��󻯡�
    private String name;
    public void setName(String name){
    	this.name = name;
       	
    }
    
    public String getName(){
    	return name;
        	
    }
       //���󷽷������󷽷������ٸ��ࣨ�����о����ʵ�ַ�������
    public abstract void work();
    	
}

class Teacher extends People{
	public void work(){
	System.out.println("������ʦ,�ҵ�������"+getName()+"�����������Σ���Ҫ��������");
		
		
		
	}
	
	
}
class Driver extends People{
	public void work(){
		System.out.println("����˾��,�ҵ�������"+getName()+"���Ҳ�Ҫ�����ֻ�����Ҫ���濪��");
		
	}
	
	
}

