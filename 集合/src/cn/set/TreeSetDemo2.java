package cn.set;


import java.util.*;

public class TreeSetDemo2 {
    public static void main (String [] args){
        List<Emp> emplost = new ArrayList<Emp>();
        emplost.add(new Emp(125,"zhuxinkai",10,'1'));
        emplost.add(new Emp(103,"zhuxinkai",10,'1'));
        emplost.add(new Emp(111,"zhuxinkai",10,'1'));
        emplost.add(new Emp(125,"zhuxinkai",1,'1'));

        /*
        实现对象的排序的两种方式。 1，利用TreeSet 进行，TreeSet的排序是调用对象的 compareTo方法，
        所以，在相应的对象类中，实现implements Comparable<指定泛型对象>,重写compareTo方法。
        利用整数的返回值来确定排序。
        2，利用工具类的Collections.sort()方法进行排序，Collections.sort(参数1：对象的List集合， 参数2: new 实现Comparator
        的类，在其中改写compare方法) public class CompareDemo implements Comparator<对象泛型：Emp>
        @Override
        public int compare(Emp o1, Emp o2)
        利用两个对象的比较，来返回整数值，判断大小。

         */

        Collections.sort(emplost,new CompareDemo());
       // Collections.sort(emplost);
        System.out.println(emplost);




    }
}
