import java.util.Scanner;

class ScannerDemo{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);  //通过构造器产生一个对象。
		/*
		 int i = sc.nextInt();
		 System.out.println();
		
		
		
		int j = sc.nextInt(); 
		 
		 int d = i*j;
		 System.out.println();
		System.out.println("我猜到了小家伙，你输入的两个数的是"+ d);
		System.out.println("我是不是很厉害，你想学编程吗");
		*/
		String line = sc.nextLine();
		System.out.println("你输入的字符串是"+line);
		
		
		
	}
	
}