import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo3 {
    public static void main(String[] args) {
        Class<?> clazz;
        Object instance = null;

        /*
         变量在try 之外声明，并且需要赋予初值。try中的变量都是局部变量。如果需要在try之外引用他，
         那么需要在try之外声明他。*/


        try {
            //采用第一种方式，获取改类的Class对象。
            clazz = Class.forName("Person");
            //反向解析，获取该类的方法；
            Method method = clazz.getDeclaredMethod("setName", String.class);
            Method method1 = clazz.getDeclaredMethod("setAddress", String.class);
            Method method2 = clazz.getDeclaredMethod("setAge", Integer.class);
            try {
                instance = clazz.newInstance();
                try {
                    //反向解析，执行该类的方法。
                    method.invoke(instance,"zhuxinkai");
                    method1.invoke(instance,"中国深圳");
                    method2.invoke(instance,25);

                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();

        }
        System.out.println(instance);

    }


}
