class Car{
	
	
	
			private int carNum;
			private String color;
			private String brand;
			
			public void run(){
				
				
				System.out.println("I am a car  "+brand+"  color is  "+color+"  the carnum is "+carNum);
				
				
				
				
			}	
		
	 		public void setCarNum(int carNum){
	 			this.carNum = carNum;
	 		}
			public void setColor(String color){
				this.color = color;
				
				
			}	
		 public void setBrand(String brand){
		 	this.brand = brand;
		 }
	
	
}


class TestCar{
	
	public static void main (String[] args){
		Car car = new Car();
		car.setCarNum(888888);
		car.setColor("red");
		car.setBrand("toyoto");
		car.run();
		
		
		
	}
	
	
	
	
}