import java.io.*;

public class CopyByBuffer {
    public static void main (String [] args) throws IOException {

        copyByBuffer();
        /*

        最高效的方法，在filereader , 和 filewriter方面使用char[]数组方式。
        让后，将其放入bufferreader ,和 bufferwriter中进行操作。
         */
    }
    public static void copyByBuffer() throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader bfr = null;
        BufferedWriter bfw = null;

       fr = new FileReader("src/BufferWriterDemo.java");
       fw = new FileWriter("BufferWriterDemo.java");
       bfr = new BufferedReader(fr);
       bfw = new BufferedWriter(fw);
       char [] chs = new char[1024];
       int len = -1;


       while((len = bfr.read(chs)) != -1){
           bfw.write(chs,0,len);

       }
       bfw.close();
       bfr.close();
    }
}
