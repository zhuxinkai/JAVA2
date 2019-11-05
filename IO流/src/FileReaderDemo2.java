import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String [] args) throws IOException {
        FileWriter fw = new FileWriter("xx.txt");
        fw.write("asdkfjsdklajk");
        fw.close();



        FileReader fr = new FileReader("xx.txt");
        char [] chs = new char[5];// new 一个字符数组

/*
         public int read(char[] cbuf,
                int offset,
                int length)
         throws IOException将字符读入数组的一部分。
Specified by:
read在 Reader
参数
cbuf - 目的缓冲区
offset - 开始存储字符的偏移量
length - 要读取的最大字符数
结果
读取的字符数，如果已经达到流的结尾，则为-1
异常
IOException - 如果发生I / O错误




 */
        int num = fr.read(chs); //将文件读成字符数组。返回值为，转换的字符数组中的字符个数。
        String str = new String(chs); //字符数组转换成字符串
        System.out.println(str);
        System.out.println(num);

        System.out.println("------------------------------------------------");


        num = fr.read(chs);
         str = new String(chs);
        System.out.println(str);
        System.out.println(num);

        System.out.println("------------------------------------------------");

        num = fr.read(chs);
        str = new String(chs);
        System.out.println(str);
        System.out.println(num);

        System.out.println("------------------------------------------------");





    }
}
