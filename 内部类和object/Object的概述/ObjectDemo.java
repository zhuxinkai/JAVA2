class ObjectDemo{
	
	public static void main(String [] args){
		ObjectUse ou = new ObjectUse();
		
		System.out.println(ou.toString());
		System.out.println(ou.hashCode());
		
		
	}
}

class ObjectUse{
	int age ;
	String name;
	//对于默认继承的类Object ,可以对非final得方法进行重写。
	//而且在api中也推荐对toString 等方法进行重写。
	
	/*
	
	public String toString（）{
	
	return class().class + "@" +  Interto.toHash(hashCode());
	
	
	}
	
	查看源码得方法，在JDK得原文件目录中得src中可以找到。
	
*/
	
}