package cn.tx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo4 {
    public static void main (String [] args){
      /*
 集合中可以存储任何的数据类型，实际情况是在集合中只存一种数据类型，我们可以通过泛型来指定这种数据类型。

      泛型
       */

        Collection<String> cs = new ArrayList<String>();
        cs.add("朱鑫凯");
        System.out.println(cs);
       //当集合中加入与泛型不匹配的数字时，则报错。 cs.add(132);



      //指定集合中只能添加学生类的对象
        List<Student> ls = new ArrayList<Student>();
        ls.add(new Student(1,"zhuxinkai",12,'1',13f));
        System.out.println(ls);




        //指定集合中添加学生类的子类。

        List<ChildStudent> ls2 = new ArrayList<ChildStudent>();
        ls2.add(new ChildStudent(2,"liusha",23,'2',14f));
        System.out.println(ls2);

        ls.addAll(ls2);
        System.out.println(ls);



    }
}
