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
	//����Ĭ�ϼ̳е���Object ,���ԶԷ�final�÷���������д��
	//������api��Ҳ�Ƽ���toString �ȷ���������д��
	
	/*
	
	public String toString����{
	
	return class().class + "@" +  Interto.toHash(hashCode());
	
	
	}
	
	�鿴Դ��÷�������JDK��ԭ�ļ�Ŀ¼�е�src�п����ҵ���
	
*/
	
}