import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionListDemo {
    public static void main(String [] args){
        //list 有序的collection (也称为序列）。此接口的用户可以对列表种的每个元素的插入位置进行精准的控制。
        //数组是不可变长的，而集合解决了这个问题。
        List ls1 = new ArrayList();
        ls1.add("朱鑫凯");
        ls1.add("刘莎");
        ls1.add("朱勇涵");
        System.out.println(ls1);



        //在集合的指定位置插入

        ls1.add(1,"易运动");
        System.out.println(ls1);



        //在集合的指定位置插入集合。
        List ls2 = new ArrayList();
        ls2.add("刘佳");
        ls2.add("刘国辉");
        ls1.addAll(2,ls2);
        System.out.println(ls1);


        //获取集合的长度
        System.out.println(ls1.size());



        //获取集合种指定位置的元素，Object  obj调用tostring 方法时，调用的是子类的tostring (String）；
        Object obj = ls1.get(2);
        System.out.println(obj);
        System.out.println("-----------------------------------");




        //另外的方法遍历集合。
        for(int i = 0; i<ls1.size(); i++){
            Object obj1 = ls1.get(i);
            System.out.println(obj1);



        }
        System.out.println("---------------------这是利用ListIterator的遍历--------------");

        //关于ListIterator ,比collection 的Iterator 多了多个方法。利用ListIterator 进行遍历
        ListIterator collls = ls1.listIterator();
        while(collls.hasNext()){
            Object objin = collls.next();
            System.out.println(objin);


        }

        System.out.println("---------------------这是利用ListIterator进行反向遍历--------------");


        //利用ListIterator进行反向遍历。

        while(collls.hasPrevious()){
            Object objin2 = collls.previous();
            System.out.println(objin2);


        }

        System.out.println("---------------------ListIterator.add 进行遍历时添加。ListIterator的迭代器只能遍历出创建迭代器对象之前的list的状态的内容--------------");

        //ListIterator.add 进行遍历时添加。ListIterator的迭代器只能遍历出创建迭代器对象之前的list的状态的内容。
        while(collls.hasNext()){
            Object objin = collls.next();
            if (objin == "朱鑫凯"){
                collls.add("冯利枚");
            }
            System.out.println(objin);


        }

        System.out.println("---------------利用for循环进行List的遍历和添加。 list.size可以动态获取长度，在循环中的添加和删除--------------------");
        //利用for循环进行List的遍历和添加。 list.size可以动态获取长度，在循环中的添加和删除。
        for(int i = 0; i<ls1.size(); i++){
            Object objx = ls1.get(i);
            if (objx == "朱鑫凯"){
                ls1.add("冯利枚");
            }




        }
        System.out.println(ls1);
        //List的删除方法，根据索引进行删除。
      ls1.remove(1);

        System.out.println(ls1);

    }
}
