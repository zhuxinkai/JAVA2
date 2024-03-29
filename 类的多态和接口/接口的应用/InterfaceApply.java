//采用接口的方式，来实现计算圆和正方形的周长和面积。

class InterfaceApply{
	public static void main (String [] args){
		Cictcl cj = new Cictcl(5.2);
		Rect kj = new Rect(5.2);
		
		System.out.println("半径是"+cj.getR()+"的圆，周长是"+cj.getArea(5.2));
		System.out.println("半径是"+cj.getR()+"的圆，面积是"+cj.getAround(5.2));
		
		
		System.out.println("边长是"+kj.getR()+"的正方形，周长是"+kj.getAround(5.2));
		System.out.println("边长是"+kj.getR()+"的正方形，面积是"+kj.getArea(5.2));
		
		
	}
	
	
	
}
//使用接口的好处。
//1，降低了耦合，增加可维护性。
//类不能做多继承，但是单个类可以实现多个接口。并且，接口可以做多继承也可以做多级继承。
//接口定义是一种标准，可以使我们的代码分层开发，分模块开发。

interface CircInter{
	public double getAround(double r);
	public double getArea(double a);
	public final static double  PI = 3.1415; 	
}


class Cictcl implements CircInter{
	private double r;
	//构造器的前面不需要同方法一样要加返回值类型。否则报错。
	public Cictcl(double r){
		this.r = r;
		
	} 
 	public double getR(){
 		
 		return r; 		
 	
 	}
 	
	public double getAround(double r){
 		r = PI*r*r;
 		return r;
 	}	
 	public double getArea(double a){
 		a = PI*a*2;
 		return a;
 	}
 	
}


class Rect implements CircInter{
	private double r;
	public Rect(double r){
		this.r = r;
		
	} 
 	public double getR(){
 		
 		return r; 		
 	
 	}
 	
	public double getAround(double r){
 		r = 4*r;
 		return r;
 	}	
 	public double getArea(double a){
 		a = a*a;
 		return a;
 	}
 	
}
/*
*
接口和抽象类的区别
1，接口中的方法必须都是抽象方法，而抽象类中的方法可以是抽象方法也可以不是抽象方法。
2， 接口可以进行多继承，而抽象类只能进行单继承。
3，接口中的变量默认是fianl static 的，而抽象类中的变量没有这些前缀。
4，接口中的方法默认是abstract，而抽象类中的方法，必须加abstract 关键字。
5，接口和抽象类都不能被实例化，接口通过类来实现，再进行实例化。 而抽象类通过类来继承，通过子类来实例化。。


*/