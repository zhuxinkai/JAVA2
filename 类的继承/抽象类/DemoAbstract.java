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


abstract class People{ //抽象类，抽象类不能对象化。
    private String name;
    public void setName(String name){
    	this.name = name;
       	
    }
    
    public String getName(){
    	return name;
        	
    }
       //抽象方法，抽象方法不能再父类（本类中具体的实现方法）。
    public abstract void work();
    	
}

class Teacher extends People{
	public void work(){
	System.out.println("我是老师,我的名字是"+getName()+"请大家认真听课，不要东张西望");
		
		
		
	}
	
	
}
class Driver extends People{
	public void work(){
		System.out.println("我是司机,我的名字是"+getName()+"请大家不要打我手机，我要认真开车");
		
	}
	
	
}

