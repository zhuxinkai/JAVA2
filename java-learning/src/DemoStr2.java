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

        int index1= str.indexOf("orx");
        System.out.println(index1);

    }
}
