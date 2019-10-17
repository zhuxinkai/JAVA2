package cn.tx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateDemo {
    public static void main (String [] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        //创建SimpleDateFormate的一个对象。
        SimpleDateFormat sd = new SimpleDateFormat();
        //使用对象的方法format,传递的参数是一个日期。
        System.out.println(sd.format(date));
        //计算前一天的时间点。24小时以前。
    long msf = 24*60*60*1000;
    long tms = System.currentTimeMillis()- msf;
    System.out.println(sd.format(new Date(tms)));
//通过格式化的字符串，来定制格式
    SimpleDateFormat sd1 = new SimpleDateFormat("yy年MM月dd日HH时mm分ss秒SSS毫秒E a");
    System.out.println(sd1.format(date));
    //最常用的格式如下。
    SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /*将字符串转换成日期对象。使用SimpleDateFormat 的parse 方法，其中
        *字符传的格式，与对象构造器的格式必须完全一直。
        * 在案例中，存在着因为中间的":"格式不匹配导致触发异常的。
        * 编译器，会对相应的一些抛异常做强制要求
        *
     */
    System.out.println(sd2.format(date));
    String str1 = "1982-10-16 15:32:46";
    Date date2 = sd2.parse(str1);
    System.out.println(date2);
    System.out.println(date2.getTime());




    }
}
