package cn.set;

import cn.tx.Student;
import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;

import java.util.*;

public class SetDemo {
    public static void main (String [] args){
//测试下，LIst中是否可以允许元素的重复。
        List<String> ls1 = new ArrayList<>();
         ls1.add("songjiang");
         ls1.add("songjiang");
         System.out.println(ls1);
         ls1.add(null);
         ls1.add(null);
        System.out.println(ls1);
        //Set 的实现类  HashSet,实现set的无序性，和不可重复性，以及是否允许有空值。
        Set<String> set1 = new HashSet<String>();
        set1.add("宋江");
        set1.add("吴用");
        set1.add("武松");
        set1.add("宋江");
        set1.add(null);
        set1.add(null);
        System.out.println(set1);


        /*
        Set 如何判断元素的重复性。以字符串为例，调用字符串的euqil方法进行对比。

           IDEA 如何查看方法的父类，父类方法。

         */


       Set<Student> sttd1 = new HashSet<Student>();
       sttd1.add(new Student(1,"liusha",34,'2',12.3f));
       sttd1.add(new Student(2,"zhuxinkai",12,'1',15.21f));
       sttd1.add(new Student(3,"zhuxinkai",12,'1',15.21f));
        sttd1.add(new Student(4,"zhuxinkai",12,'1',15.23f));

        System.out.println(sttd1);







        //实现增加类对象类型的重复性对比。需要重写 equlas 和 hashCode两个方法。


        //通过iterator 进行删除，不会出现concureent modify 异常。
        Iterator<String> it1 = set1.iterator();

        while(it1.hasNext()){
           String init = it1.next();
           if (init.equals("武松")){
               it1.remove();

            }
           System.out.println(init);


        }




    }
}
