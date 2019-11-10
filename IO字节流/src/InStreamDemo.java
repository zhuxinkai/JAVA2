import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InStreamDemo {
    public static void main(String [] args) throws IOException {
        readFile();
        System.out.println("--------------------------------------");
        readFile2();



    }
    public static void readFile() throws IOException {
        InputStream ism = null;
        ism = new FileInputStream("a.txt");
        /*
        这是第一种读取方式，读取一个字符。但是对于中文的话，则会出现无法识别的情况。

        在后面的输出中出现乱码的问题，是因为前次的读取
                导致读取了半个字符。

         */
        int num = 0;
      /*ystem.out.println(num = ism.read());
       //ystem.out.println((char)num);
        //第二种方式，则读取一个字节数组。
       */
        byte [] bts = new byte[1024];
        num = ism.read(bts);
        System.out.println(num);
        System.out.println(new String(bts,0,num));



    }

    public static void readFile2() throws IOException {
        InputStream ism = null;
        ism = new FileInputStream("a.txt");
        int num = 0;
/*
在字符流的读取过程中，构造器在字节数组中，制定了读取的长度，起止位置。


 */
        byte [] bts = new byte[1024];
        num = ism.read(bts,0,23);
        System.out.println(bts);
        System.out.println(new String(bts,0,num));




    }
}
