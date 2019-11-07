import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main (String [] args) throws IOException {

    copy1();
    copy2();

    }

    public static void copy1() throws IOException {
        FileReader fr = null;
        FileWriter fw = null;

        fr = new FileReader("src/FileWriteDemo2.java");
        fw = new FileWriter("FileWriteDemo2.java");
        int num = 0;
        while((num = fr.read()) != -1){

            fw.write(num);

        }
        fw.close();
        fr.close();







    }


    public static void copy2() throws IOException {

        FileReader fr = null;
        FileWriter fw = null;

        fr = new FileReader("src/FileWriterDemo3.java");
        fw = new FileWriter("FileWriteDemo3.java");
        char [] chs = new char[1024];
        int len = -1;
        while((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);



        }
        //注意对于文件来说，任何的读写都需要关闭。或者flush. 另外先打开的，后关闭。。
        fw.close();
        fr.close();






    }





}
