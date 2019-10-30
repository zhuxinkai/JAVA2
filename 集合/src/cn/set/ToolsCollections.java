package cn.set;

import cn.tx.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class ToolsCollections {
    public static void main (String [] args){
        //输出集合的反转  Collections.reverse
        List<String> ls1 = new ArrayList<String>();
        ls1.add("关羽");
        ls1.add("张飞");
        ls1.add("诸葛亮");
        ls1.add("刘备");
        ls1.add("赵云");
        ls1.add("黄盖");

        System.out.println(ls1);
        Collections.reverse(ls1);
        System.out.println(ls1);


        //输出集合的打乱 Collections.shuffle
        Collections.shuffle(ls1);
        System.out.println(ls1);



        //List 进行排序，包括有对象的List 的排序。
        List<String> ls2 = new ArrayList<String>();
        ls2.add("cdadfasdf");
        ls2.add("adbdafds");
        ls2.add("xdbxsdfja");
        ls2.add("adbxcdafsdf");
        System.out.println(ls2);
         Collections.sort(ls2);
        System.out.println(ls2);

        List<Student> ls3 = new ArrayList<Student>();
        ls3.add(new Student(12,"zhuxinkai",1,'1',12.3f));
        ls3.add(new Student(123,"zhuxinkai",23,'1',12.3f));
        ls3.add(new Student(12,"xhuxinkai",23,'1',12.3f));
        ls3.add(new Student(14,"chuxinkai",1,'1',12.3f));
        ls3.add(new Student(2,"zhuxinkai",13,'1',12.3f));



        System.out.println(ls3);
        Collections.sort(ls3);
        System.out.println(ls3);




        //转换成线程同步的List;
     Collections.synchronizedList(ls3);





    }
}
