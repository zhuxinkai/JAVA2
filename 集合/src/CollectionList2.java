import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionList2 {
    public static void main(String [] args){
        /*rrayList 不是线程同步的，不具有线程安全，但是效率高。
一般情况下不使用ArrayList  ,直接使用List即可。
         LinkList List 接口的链接列表实现。实现所有可选的列表操作。 并且允许所有元素（包括null).除了实现List接口外，
         LinkList 类还为在列表的开头及结尾get ,remove ,和insert 元素提供了统一的命名方法。
         这些操作允许将链接列表用做堆栈，队列，或双端队列。
         不是线程安全的。
链表的数据结构。------》张三（OX99)[]      李四（0x98)[0x99]   王五 （0x97)[0x98]
栈的数据结构  -- 先进后出 （push  , pop(出）
队列的数据结构  ---先进先出


         */
         //把元素插入到列表的头部，和尾部。LinkedList
        LinkedList ls2 = new LinkedList();
        ls2.add("宋江");
        ls2.add("吴用");
        ls2.add("曹刚");
        System.out.println(ls2);
        ls2.addFirst("武松");
        System.out.println(ls2);
        ls2.addLast("阮小七");
        System.out.println(ls2);


        //获取头元素

        System.out.println(ls2.element());

        //POP对栈进行操作。

        System.out.println(ls2.pop());
        System.out.println(ls2);

        //PUSH对栈进行操作。set 进行替换
            ls2.push("孙二娘");
        System.out.println(ls2);
            ls2.set(0,"武松");
        System.out.println(ls2);




/*
Vector 相对于 Linkedlist 是线程安全的。
 addElement , elementat  , firestElement
等都是他的特殊方法。

 */

//Vector 的遍历。获得集合中的每个元素（枚举类型）。

    Vector ve = new Vector();
        ve.add("宋江");
        ve.add("吴用");
        ve.add("曹刚");
       /* System.out.println(ls2);
        ls2.addFirst("武松");
        System.out.println(ls2);
        ls2.addLast("阮小七");
        *
        */
        Enumeration es = ve.elements();
        while(es.hasMoreElements()){
            Object obj = es.nextElement();
            if ("吴用".equals(obj)){
                ve.add("朱鑫凯");


            }
            System.out.println(obj);
        }












    }
}





