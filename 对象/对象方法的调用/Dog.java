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
	dog.color = "黄色";
	dog.height = 25.34;
	dog.weight = 35.24;
	System.out.println("----------------dog的属性--------------");
		System.out.println("狗的颜色是"+dog.color);
	System.out.println("狗的身高是"+dog.height);
	System.out.println("狗的体重是"+dog.weight);
	
	System.out.println("----------------do1的属性--------------");
		Dog dog1 = new Dog();
	dog1.color = "white色";
	dog1.height = 15.34;
	dog1.weight = 5.24;
		
		System.out.println("狗的颜色是"+dog1.color);	
			System.out.println("狗的身高是"+dog1.height);	
			System.out.println("狗的体重是"+dog1.weight);
		System.out.println("----------------do2的属性--------------");	
			Dog dog2 = dog1;
			dog2.color = "many color";
				System.out.println("狗的颜色是"+dog2.color);	
			System.out.println("狗的身高是"+dog2.height);	
			System.out.println("狗的体重是"+dog2.weight);
			
			System.out.println("----------------再次打印do1的属性--------------");	
			
				System.out.println("狗的颜色是"+dog1.color);	
			System.out.println("狗的身高是"+dog1.height);	
			System.out.println("狗的体重是"+dog1.weight);
			
			dog.dogMove();
			dog.protectHome();
			dog1.protectHome();
			
			
		
		
	}
	
	
	
}