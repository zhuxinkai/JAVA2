import java.lang.reflect.*;

public class ReflectDemo2 {
    public static void main(String[] args) {
        //在try之外定义Class对象类。
        Class<?> clazz;

        {
            try {
                //获得Person的类对象。通过类所在的位置及类名的方式
                clazz = Class.forName("Person");
                //获取构造器
                Constructor<?> constructor = clazz.getDeclaredConstructor();
                try {
                    //通过构造器，获取一个对象。
                    Object instance = constructor.newInstance();
                    System.out.println(instance);
                    //获取该类对象的方法数组。
                    Method [] method = clazz.getDeclaredMethods();
                    //开始遍历方法
                    for(Method m : method){
                        //获取方法名
                        String filedname = m.getName();
                        //如果方法名是以set开头的
                        if(filedname.startsWith("set")){
                            //将方法的第四个字符开始，全部转成小写。并且赋值回来。
                            filedname = filedname.substring(3).toLowerCase();
                            try {
                              //  通过指定的方法名，转换来的属性名，获取属性对象。
                                Field field = clazz.getDeclaredField(filedname);
                                //获取属性对象的类型对象。
                                Type fieldtype = field.getType();
                                //Type firsttype = String.class;
                               // Type secondtype = Integer.class;
                                //进行判断，如果这个类型是整型的，那么方法就是setAge;赋值整型数据
                                if(fieldtype == Integer.class){

                                    m.invoke(instance,12);
                                    //如果属性类型是字符型的，并且是setname方法，那么就是 setName 方法。
                                    /*

                                    注意，字符串的比较不能适用== ，必须适用equals 方法进行比较。
                                     */
                                }else if(fieldtype.equals(String.class) && filedname.equals("name")){
                                    m.invoke(instance,"zhuxinkai");

                                }else if (fieldtype == String.class && filedname.equals("address")){
                                    m.invoke(instance,"中国深圳");

                                }



                            } catch (NoSuchFieldException e) {
                                e.printStackTrace();
                            }
                        }




                    }
                    System.out.println(instance);








                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }


            } catch (ClassNotFoundException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

    }


    // 根据类的默认构造器来获得一个对象







}
