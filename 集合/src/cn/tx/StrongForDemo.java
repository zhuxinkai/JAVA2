package cn.tx;

import java.util.ArrayList;
import java.util.Collection;

public class StrongForDemo {
    public static void main (String [] args){


        //增强型的for 循环。 sc 的生成中，new 一个对象，要带括号。

    Collection <String> sc = new ArrayList <String>() ;
    sc.add("宋江");
    sc.add("武松");
    sc.add("孙二娘");
    for(String str : sc){
        /*
        if("孙二娘".equals(str)){
            sc.add("孙二娘老公");

            Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
	at java.util.ArrayList$Itr.next(ArrayList.java:859)
	at cn.tx.StrongForDemo.main(StrongForDemo.java:17)


        } 这里暴露了增强型for循环的一个问题，就是不具备线程安全。
*/
        System.out.println(str);
    }
    /*增强型for 循环，第二种方式，循环类。 并发异常。。

    增强型数组的遍历，其实只适合于数组类型的遍历。
    for(遍历的数据类型，（类似于泛型），遍历中所使用的变量名 ： 遍历对象）

     */
    Student studentzengzeng = new Student(123,"zxk",37,'1',13f);
        Collection <Student> sc2 = new ArrayList <Student>() ;
        sc2.add(studentzengzeng);


    for(Student ss : sc2){
        System.out.println(ss);
    }








    }





}
