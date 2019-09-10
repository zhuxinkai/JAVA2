class Demo{
	
	
	



public static void main (String[] args) {
	
	int [] array = {1,2,3,234,1234,4235,4275,44298,1123789};
	 int index = quick(array,1123789);
	 System.out.print("this number 1123789  index is "+ index);
  
   

	
}

	


public static int quick(int [] h, int num){
	 int maxIndex = h.length - 1;
	 int minIndex = 0;
	 int middleIndex = maxIndex + minIndex-1/2;
	 /*
	 为啥需要括号，减1，取整。
	 因为，当minIndex 可能是0时，那么循环会导致，变成非整形的数字。
	 
	 Java中运算符的先后顺序
单目>算数运算符>移位>比较>按位>逻辑>三目>赋值

单目运算符（一元运算符，即一个变量）：+，-，++，--
算数运算符：+，-，*，/，%
移位运算符：<<,>>
关系运算符：>,<,>=,<=,==,!=
位运算符：&，|，~，^,
逻辑运算符：&&，||
三目运算符：表达式1？表达式2：表达式3;
赋值运算符：=等
 
位运算符主要针对二进制，它包括了：“与”、“非”、“或”、“异或”。从表面上看似乎有点像逻辑运算符，
但逻辑运算符是针对两个关系运算符来进行逻辑运算，而位运算符主要针对两个二进制数的位进行逻辑运算
int a=129;
int b=128;
int c=a&b;
“a”的值是129，转换成二进制就是10000001，而“b”的值是128，转换成二进制就是10000000。根据与运算符的运算规律，
只有两个位都是1，结果才是1，可以知道结果就是10000000，即128


位运算与逻辑运算的区别：
（|）和（||）成立的条件是只要一侧表达式为真，结果就为真，在（|）运算时，无论左侧的表达式的值为真还是为假，
都要判断右侧的表达式的值的真假，而（||）在运算时，只要左侧表达式的值为真，就不再判断右侧表达式的值了
	 
	 
	 
	 */
	 while (true) {
	 	          if(num == h[middleIndex]){
	 	          	
	 	          	break;
	 	          	
	 	          	
	 	          }
	 	          else{
	 	          	if (num > h[middleIndex]){
	 	          		minIndex = middleIndex;
	 	          		middleIndex = maxIndex + minIndex-1/2;
	 	          		
	 	          		
	 	          	}
	 	          	else{
	 	          		maxIndex = middleIndex;
	 	          		middleIndex = maxIndex + minIndex-1/2;
	 	          	}
	 	          	
	 	          	
	 	          }
	 	      
	 	          
	 	
	 	
	 }
	 return middleIndex;
	 
	 
	 
	       
	
	
	
	
}


   }