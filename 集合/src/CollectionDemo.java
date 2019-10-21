import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionDemo {
    public static void main (String args []){


        //创建集合

         Collection cs = new ArrayList();
         for (int i = 0; i<10; i++){

        //利用集合的add方法，对集合中添加相应的数据
             cs.add(new Person("张三"+i,i,'1'));

         }


         System.out.println(cs);

    Collection coll = new ArrayList();
    for (int i =0; i<10; i++){
        coll.add("张三"+i);




    }
    System.out.println(coll);
    //将一个集合添加到另外要给集合当中使用addAll方法
    cs.addAll(coll);
    cs.add(new Date());
    System.out.println(cs);

    /*集合的删除
    cs.clear();
    System.out.println(cs);

*/


    Collection coll2 = new ArrayList();
    for (int i=0;i< 10; i++){
        coll2.add("张三"+i);

        for (int j =0; j <10 ; j++){

        coll2.add("李四"+j);



        }




    }

        System.out.println(coll2);
    // 对集合中的数据进行删除。
        coll2.remove("张三0");
        System.out.println(coll2);
        //从集合中删除一个集合的内容
        cs.removeAll(coll);
        System.out.println(cs);



}
}



class Person{




    //利用IDEA 的generate 可以自动生成get 和 set方法。
    private String name;

    private Integer age;

    private char gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, Integer age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
