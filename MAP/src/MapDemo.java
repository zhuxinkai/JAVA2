import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String [] args){
        Map<String,String> map1 = new HashMap<String,String>();
        map1.put("及时雨","宋江");
        map1.put("行者","武松");
        map1.put("花和尚","鲁智深");
        map1.put("青面兽","杨庆");
        map1.put(null,"zhuxinkai");
        System.out.println(map1);
       // map1.clear();
        System.out.println("----------------");
        System.out.println(map1);
        //Map中的键值，增加在泛型定义阶段，定义为Person 对象。
        Map<String,Person> map2 = new HashMap<String,Person>();
        map2.put("key1",new Person(1,"zhuxinkai",37,174.3f));
        map2.put("key2",new Person(2,"liusha",11,174.3f));
        map2.put("key3",new Person(3,"zhuyonghan",11,174.3f));
        map2.put("key4",new Person(4,"liujia",35,174.3f));
        System.out.println(map2);

        boolean ishavekey = map2.containsKey("key3");
        System.out.println(ishavekey);
     //重写了equals 和 hashCode 方法。使得判断两个对象是否相等的方法，通过比较值来返回boolean值。

        boolean ishavevalue = map2.containsValue(new Person(1,"zhuxinkai",37,174.3f));
        System.out.println(ishavevalue);

        boolean ishavevalue2 = map2.containsValue(new Person(1,"liusha",37,174.3f));
        System.out.println(ishavevalue2);
        //利用遍历键的方式，遍历出键值。比较常用。
        Set<String> st1 = map2.keySet();
        for(String sst : st1){
            System.out.println(map2.get(sst));

        }

        /*两种遍历map的方式，一种是通过，keySet的方法，获取到键值的集合。遍历键值集合的时候，利用get方法，获取相应的键值。
        另外一种方式是通过entrySet的方法，获取到Map.Entry对象的Set集合，通过遍历Map.Entry对象时，获取对象的getKey();
        getValue方法来遍历MAP.


         */

            Set<Map.Entry<String,Person>> smap = map2.entrySet();
        for(Map.Entry<String,Person> ssp : smap){
           String key = ssp.getKey();
           Person person = ssp.getValue();
           System.out.println("键是  "+key+"  键值是  "+person);

        }

        map2.remove("key1");
        System.out.println(map2);

        map2.remove("key4");
        System.out.println(map2);





    }
}
