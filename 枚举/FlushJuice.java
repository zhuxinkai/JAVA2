class FlushJuice{
	enum FlushJuiceSize{Big,middle,small};
	//ö����Ҫ�ô����š�
	//ö�ٶ�����Ƿ������һ���������͡�  ��Ҳ��ͬ���ڸ�ֵ��ʱ����ر𡣣�
	FlushJuiceSize size;
	

	
	
}

class FlushJuiceTest{
	public static void main(String[] args){
	FlushJuice flushjuice = new FlushJuice();
	flushjuice.size = FlushJuice.FlushJuiceSize.Big;
	System.out.println(flushjuice.size);
	}
	
}