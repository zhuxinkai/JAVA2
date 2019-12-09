import com.sun.deploy.security.ValidationState;

import java.lang.reflect.*;

public class ReflectDemo4 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Person p = new Person("zhuxinkai", 15, "中国深圳");
        Object resultobj = copyObjectByReflect(p);
        System.out.println(resultobj);


    }

    public static Object copyObjectByReflect(Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Constructor<?> constructor = null;
        Object instance = null;


        constructor = clazz.getDeclaredConstructor();

        instance = constructor.newInstance();

        for (Field f : fields) {
            String filedname = f.getName();
            //  Type type = f.getType();

            String getmethodname = "get" + filedname.substring(0, 1).toUpperCase() + filedname.substring(1);
            String setmethodname = "set" + filedname.substring(0, 1).toUpperCase() + filedname.substring(1);

            Method seethed = null;
            Method getmethod = null;
            getmethod = clazz.getDeclaredMethod(getmethodname);
            /*
            反向获取方法时，如果是方法中带有参数的，必须在getDeclaredMethod中进行参数设置。
            例如set方法，带有String 类型的参数 name ;
            在本例题中的方式，则是通过getmethod 方法获取的返回值类型来确定的 seethed 方法的参数
            类型。

          public void setName(String name) {
                    this.name = name;
                                           }
             */
            seethed = clazz.getDeclaredMethod(setmethodname,getmethod.getReturnType());
            Object middleresult = getmethod.invoke(obj);
            seethed.invoke(instance, middleresult);





        }

        return instance;
    }
}






