class Dog{
	
String color;
double height;
double weight;
String name;

public void dogMove (){
	 System.out.println("  dog is move a step");
	
	
}
public void protectHome () {
	System.out.println(name+"  is protect the home");	 
	
	
	
}	


	
	
	
	
	
}


class TestDog{
	public static void main (String args[]){
		
		Dog dog = new Dog();
		dog.name = "zhuxinkai";
	dog.color = "��ɫ";
	dog.height = 25.34;
	dog.weight = 35.24;
	System.out.println("----------------dog������--------------");
		System.out.println("������ɫ��"+dog.color);
	System.out.println("���������"+dog.height);
	System.out.println("����������"+dog.weight);
	
	System.out.println("----------------do1������--------------");
		Dog dog1 = new Dog();
	dog1.color = "whiteɫ";
	dog1.height = 15.34;
	dog1.weight = 5.24;
		
		System.out.println("������ɫ��"+dog1.color);	
			System.out.println("���������"+dog1.height);	
			System.out.println("����������"+dog1.weight);
		System.out.println("----------------do2������--------------");	
			Dog dog2 = dog1;
			dog2.color = "many color";
				System.out.println("������ɫ��"+dog2.color);	
			System.out.println("���������"+dog2.height);	
			System.out.println("����������"+dog2.weight);
			
			System.out.println("----------------�ٴδ�ӡdo1������--------------");	
			
				System.out.println("������ɫ��"+dog1.color);	
			System.out.println("���������"+dog1.height);	
			System.out.println("����������"+dog1.weight);
			
			dog.dogMove();
			dog.protectHome();
			dog1.protectHome();
			
			
		
		
	}
	
	
	
}