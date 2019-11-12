import java.io.UnsupportedEncodingException;

public class ChartsDemo {
    public static void main (String [] args){
        String str = "中国";
        /*
        因为编辑器采用的是utf-8 的编码方式。 所有遇到跟其无法进行转换的编码方式时，就会出现乱码的现象。



         */
        //定义的时候时小的byte ，大的Byte时另外一个类。

        byte[] bbs = new byte[0];
        try {
            // charsetName 如果不支持，或者无法识别，那么就会报错。
            bbs = str.getBytes("GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(new String(bbs));


    }
}
