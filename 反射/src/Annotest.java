public @interface Annotest {

    /*
    我们创建出来的注解自动的实现了 Annotation 接口。
    非标识注解（注解内有值的），通过反射方式调用这个方法的时候猜有意义。
    @author zhuxinkai

     */
    /*
    注解内部可以定义值，这里面的值既不是属性也不是方法。
    语法： 数据类型 值得名字();


     */

    String value();


}
