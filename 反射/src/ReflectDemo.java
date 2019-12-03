import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) {
        Person p = new Person("ZHUXINKAI",1,"DFK");
        test(p);
        test(new Integer(15));
        getClass2(p);

    }

    public static void getClass2(Person p){
        Class clazz = Person.class;
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods) {
            System.out.println(m);
        }
        System.out.println("-----------------------------------------------------");
        Field[] fields = clazz.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println("-----------------------------------------------------");
        Constructor<?>[] cs = clazz.getConstructors();
        for(Constructor c:cs){
            System.out.println(c);

        }
        System.out.println("-----------------------------------------------------");

    }







    public static void test(Object obj){
        Class<?> clazz = obj.getClass();

        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods) {
            System.out.println(m);
        }
        System.out.println("-----------------------------------------------------");
        Field[] fields = clazz.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println("-----------------------------------------------------");
        Constructor<?>[] cs = clazz.getConstructors();
        for(Constructor c:cs){
            System.out.println(c);

        }
        System.out.println("-----------------------------------------------------");

    }


    }


