import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo1 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Person");
            Field field = clazz.getDeclaredField("age");
            System.out.println(field);

            Method method = clazz.getDeclaredMethod("test",new Class<?>[]{});
            System.out.println(method);

            Method method1 = clazz.getDeclaredMethod("setName", String.class);
            System.out.println(method1);

            Constructor<?> constructor = clazz.getDeclaredConstructor();
            System.out.println(constructor);

            Constructor<?> constructor1 = clazz.getDeclaredConstructor(String.class,int.class,String.class);
            System.out.println(constructor1);

        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
