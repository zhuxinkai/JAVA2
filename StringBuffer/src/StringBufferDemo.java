public class StringBufferDemo {
    public static void main (String [] args){
        StringBuffer bs = new StringBuffer();
        bs.append("HELLO WORLD");
        System.out.println(bs);
        System.out.println(bs.length());
        System.out.println(bs.capacity());

        StringBuffer bs1 = new StringBuffer(20);
        System.out.println(bs1.length());
        System.out.println(bs1.capacity());

        StringBuffer bs2 = new StringBuffer("HELLO ZHUXINKAI");
        System.out.println(bs2.length());
        System.out.println(bs2.capacity());

        StringBuffer bs3 = new StringBuffer("HELLO ZHUXINKAI");
        System.out.println(bs3.length());
        //append 只能在末尾进行增加。
        bs3.append(new char[] {' ','l','o','v','e'});
        System.out.println(bs3);
        System.out.println(bs3.length());
        System.out.println(bs3.capacity());

        // 插入一个新的字符数组。 第一个参数是插入的位置，字符数组，插入的数组起始位置，插入的长度）；
        bs3.insert(bs3.length(),new char[] {' ','l','i','u','s','h','a'},0,7 );
        System.out.println(bs3);


       //bs3.replace 中start 的索引位置， end 索引位置。 中间利用字符串进行替换。其中不包括end索引位置本身。

        bs3.replace(2,4,"this is a good idea");
        System.out.println(bs3);








    }
}
