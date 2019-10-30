package cn.set;

public class FewParameter {
    public static void main (String [] args){
/*可变参数简介，在不确定参数的个数时，可以使用可变的参数列表。
  每个方法最多只有一个可变参数，因此：可变参数必须是方法的最后一个参数。



 */
    int [] arr = {1,2,3,4,5,6,7,10,20,30,100};
System.out.println(countNumber(arr));

System.out.println(countNumber(1,2,3,4,5,6,7,8));
//可变参数完全可以当作一个数组来使用,或者说,本质上可变参数就是一个数组.所以,数组所拥有的方法,属性,可变参数一样拥有.
        

    }
public static int countNumber(int... arr ){
        int sum = 0;
        for (int i:arr){
            sum += i;
        }
        return sum;

}


}
