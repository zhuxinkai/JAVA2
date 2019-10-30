package cn.set;

import cn.tx.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main (String [] args){

//compare方法，字符串的比较方法。
        //两个字符串相互比较，从第一个字符开始比较相同索引的字符，比较出现差异的第一个字符的值。
        String str1 = "abc";
        String str2 = "adc";
        System.out.println(str1.compareTo(str2));





        //比较两个对象的大小。需要实现Complier接口。
        Set<Student> studntsecond = new TreeSet<Student>();
        //当student 对象中出现了两个构造器的时候，构造器的自动辅助写功能丧失了，也许是不知道该用哪个构造器。
        studntsecond.add(new Student(1,"zhuxinkai",23,'1',13.2f));
        studntsecond.add(new Student(1,"chuxinkai",23,'1',13.2f));
        studntsecond.add(new Student(1,"xhuxinkai",33,'1',13.2f));
        studntsecond.add(new Student(5,"zhuxinkai",23,'1',13.2f));

        System.out.println(studntsecond);

        //TreeSet 会进行自然排序



        //TreeSet中进行对象的进行排序。




    }
}
