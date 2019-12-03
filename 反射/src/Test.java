import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
     //   ArrayList<?> ar = new ArrayList<>();
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Method[] methods = clazz.getDeclaredMethods();
            for(Method m : methods) {
                System.out.println(m);
            }
            System.out.println("-----------------------------------------------------");
            Field [] fields = clazz.getDeclaredFields();
            for(Field f : fields){
                System.out.println(f);
            }
            System.out.println("-----------------------------------------------------");
            Constructor<?>[] cs = clazz.getConstructors();
            for(Constructor c:cs){
                System.out.println(c);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

