import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String [] args){
        //Iterator  接口，对Collection 进行迭代的迭代器

        //新建一个集合
        Collection coll = new ArrayList();
        for (int i = 0;i<10;i++){
            coll.add("李四"+i);

        }
        //这个迭代器，只能给这个集合使用。
        Iterator itel = coll.iterator();
        //hasNext()方法
        //再利用迭代器对集合进行遍历的时候，不允许对集合进行操作。

        while (itel.hasNext()){
            String str1 = (String)itel.next();
         /*   if("李四4".equals(str1)){
                coll.add("李五");
            }
        //再利用迭代器对集合进行遍历的时候，不允许对集合进行操作。

          */
            System.out.println(str1);

        }





    }
}
