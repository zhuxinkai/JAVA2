package cn.tx;

public class DemoStr2 {
    public static void main(String[] args){
 //简历一个字符串
        String str = "Hello World";
 //返回整数索引参数位置的字符值。
        char c = str.charAt(6);
        System.out.println(c);

//返回字符在字符串中第一次出现的索引值。
        int b = str.indexOf('l');
        System.out.println(b);
//查找字符串在指定字符串中出现的索引值。
        int index = str.indexOf("l");
        System.out.println(index);
//返回字符串在字符串中的索引值，如果不存在，则返回-1.
        int index1= str.indexOf("orx");
        System.out.println(index1);
// 从指定位置开始返回第一次出现字符串的索引，包括其本身。
        int index2 = str.indexOf("ll",4);
        System.out.println(index2);
// 从指定位置开始截取字符串。
        String str2 = str.substring(3);
        System.out.println(str2);
// 截取从开始到结束索引之间的一段字符串，包括开始索引，不包括结束的索引。
        String str3 = str.substring(1,8);
        System.out.println(str3);
 //获取字符串对应的字节数组
 byte [] bs = str.getBytes();
 for(int i = 0;i< str.length();i++) {
     System.out.print(bs[i] + "\t");
 }
 System.out.println();
//转换成字符串数组。
     char [] cs = str.toCharArray();
     for(int i = 0;i< str.length();i++)   {
         System.out.print(cs[i]+"\t");



 }
        System.out.println();
        //valueof 转换成字符串类型。布尔类型，转成字符串类型。

        String str4 = str.valueOf(true);
        System.out.println(str4);

        System.out.println();
        //把字符数组转换成字符串。
        String str5 = str.valueOf(new char[] {'f','d','d'});
        System.out.println(str5);

        //大小写进行转换。以及连接字符串，一般情况下，连接字符串使用“+”来进行。
        String str6 = "zxkdsafjksdf";
        String str7 = "ZDKFAJSDFLKZKJCWER";
        System.out.println(str6.toUpperCase());
        System.out.println(str7.toLowerCase());
        System.out.println(str6.concat(str7.toLowerCase()));



    }
}
