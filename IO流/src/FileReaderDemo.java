import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main (String [] args) throws IOException {
        FileReader fd1 = new FileReader("helloword.txt");
        FileReader fd2 = new FileReader("helloword.txt");

readFileMethod(fd1);
System.out.println("---------------------------------------------");
readFileMethod2(fd2);

// -1时文本读取完毕的标志


    }


    public static void readFileMethod(FileReader fd1) throws IOException {

        int num = 0;

        while((num = fd1.read()) != -1){

           // System.out.println((char)num);

            System.out.print((char)num);

        }

    }
    //方法二之所以，输出结果不一致，是因为在读的时候，没有做输出。所以漏了一次。

    public static void readFileMethod2(FileReader fd1) throws IOException {
        while((fd1.read()) != -1){

            System.out.print((char)fd1.read());
        }




    }



}
