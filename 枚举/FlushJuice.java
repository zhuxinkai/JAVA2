class FlushJuice{
	enum FlushJuiceSize{Big,middle,small};
	//枚举需要用大括号。
	//枚举定义后，是否就像是一种数据类型。  （也不同，在赋值的时候很特别。）
	FlushJuiceSize size;
	

	
	
}

class FlushJuiceTest{
	public static void main(String[] args){
	FlushJuice flushjuice = new FlushJuice();
	flushjuice.size = FlushJuice.FlushJuiceSize.Big;
	System.out.println(flushjuice.size);
	}
	
}