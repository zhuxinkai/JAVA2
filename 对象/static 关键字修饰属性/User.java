class User{
	
		String name;
		int acountid;
		String addr;
		
		static int useraccount;
		
	public void printUser(){
		
		
		
		System.out.print("my name is  "+name+"   my home address is  "+addr+"  my bank account is "+ useraccount+"\n");
	}
	
	
}

class TestUser{
	
	public static void main (String[] args){
		User user = new User();
		User.useraccount++;
		user.printUser();
		User user1 = new User();
		User.useraccount++;
		
		user1.printUser();
		
	}
	
	
	
}
// ������ԣ��������ڴ���������ݹ���������������ԣ������ڶ��С�

