class Demo2{
	public static void main (String [] args){
		Master ma = new Master();
		ma.feed(new Animals(),new Food());  //ma.feed(Animals an=new Animals();,Food f = new Food();)
		ma.feed(new Dog(),new Bone());
		ma.feed(new Cat(),new Fish());
		
		//Master ���feed �������������ֱ���Animals���ͺ�Food���ͣ���Ϊ�Ǹ��࣬���п��Խ������ʵ�����ݸ���������Master��Ͳ���Ҫ�������������ͬ�Ķ���ιʳ��
		
		
		
	}
	
	
	
}

//Animals��������
class Animals{
	public void eat(Food f){
		System.out.println("����һֻ��������ڳ�"+f.getFood());
		
	}
	
}

class Dog extends Animals{
	public void eat(Food f){
		System.out.println("����һֻ���������ڳ�"+f.getFood());
		
	}
	
}

class Cat extends Animals{
	public void eat(Food f){
		System.out.println("����һֻè�������ڳ�"+f.getFood());
		
	}
	
}


class Food{
	
	public String getFood(){
		return "ʳ��";
		
	}
}

class Bone extends Food{
	
	public String getFood(){
		return "��ͷ";
		
	}
}


class Fish extends Food{
	
	
	public String getFood(){
		return "��";
	}
}


class Master{
	
	public void feed(Animals an,Food f){
		an.eat(f);
		
		
	}
	
}
//java���÷�������ϸ���̡�
//��̬�󶨣����ڷ�����method lable);
//1,�������鿴������������ͺͷ�������������������п��ܱ����õĺ�ѡ�����б�
//2�����ؽ����������������Ϊfunc�ķ����У�����һ�����ṩ�Ĳ���ǩ����ȫƥ��ķ�������ô��ѡ�����������
//3������������η���private ,static ,final ,�����ǹ���������ô������������׼ȷ��֪��Ӧ�õ����ĸ�������
//4��


// JVM ���ȷ���obj��ʵ�����͵ķ�����������Animal��ķ�����Ҳ������Cat�༰������ķ�����
//JVM �ڷ�������������cry()ƥ��ķ������ҵ��󣬾�֪���������ĸ����ˡ�
//JVM���ø÷�����
