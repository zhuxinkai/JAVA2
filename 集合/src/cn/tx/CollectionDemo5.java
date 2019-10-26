package cn.tx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo5 {
    public static void main (String [] args){
        //泛型的作用。在迭代器，遍历中的使用。
        List<String> ls = new ArrayList<String>();
        ls.add("zhuxinkai");
        ls.add("liusha");
        ls.add("zhuyonghang");

        Iterator<String> it = ls.iterator();
        while (it.hasNext()){

            System.out.println(it.next());

        }




        //泛型在类中定义的时候，可以使用。


        }



    }

