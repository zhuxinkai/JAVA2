import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IoDemo1 {
    public static void main (String[] args) throws IOException {
     /*   IO流再JAVA中从输入输出角度分类：
        1，输入流  2，输出流
        IO流在JAVA中从数据的角度来分类。
        1，字符流           （文本，我们能够读懂的可以认为是字符流）
        2，字节流（二进制数据，音频，图片。）
       */

        writeFile1();
        wrieteFile2("b.txt");


    }


    public static void writeFile1() throws IOException {

        File helloword = new File("helloword.txt");
        helloword.createNewFile();
        FileWriter fw = new FileWriter(helloword);
        fw.write("helloword,this is a new word");
        fw.write("helloword2,this is a new word");
        // fw.flush();
        fw.close();    //close 会自动进行，清理缓冲区。

    }

    public static void wrieteFile2(String filename) throws IOException {
        //采用这种构造器的方式，则直接在绝对路径创建文件。
        FileWriter fw = new FileWriter(filename);
        for(int i=0; i<100; i++){

            fw.write("give me a good world  "+"\r\n");


            //合理的使用flush
            if(i%10 == 0){
                fw.flush();
            }

        }
        fw.flush();//把缓存中残存的数据写入文件中。
        fw.close();//关闭流资源，会进行flush操作。


    }



}
