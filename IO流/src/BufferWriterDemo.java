import java.io.*;

public class BufferWriterDemo {
    public static void main(String [] args) throws IOException {

    writeByBuffer();
    readBuffer();

    System.out.println("----------------我是用bufferread读出来的崽------------------");
    readBuffer1();



    }

    public static void writeByBuffer() throws IOException {
        FileWriter fw = null;

        BufferedWriter bfw = null;
        fw = new FileWriter("buffer.txt");
        bfw = new BufferedWriter(fw);
        bfw.write("java真好学啊，很简单，我很快就掌握了");
        bfw.close();





    }



    public static void readBuffer() throws IOException{
        FileReader fr = null;
        BufferedReader bfr = null;

        fr = new FileReader("src/IoDemo1.java");
        bfr =  new BufferedReader(fr);
        String str = null;
        while((str = bfr.readLine()) != null) {
            System.out.println(str);

        }
        bfr.close();





    }



/*
BufferedReader ,BufferedWriter ,及是在原来的对象FileReader, 和 FileWriter上进行了再一次的封装。
原先的方法和字符数组方式，依旧可以使用。  多了一个readline 的方法，返回的是一行的字符串。
所以可以利用这个方法，返回null来判断是否读到了文件结尾。

 */

    public static void readBuffer1() throws IOException{
        FileReader fr = null;
        BufferedReader bfr = null;
        fr = new FileReader("src/FileReaderDemo2.java");
        bfr =  new BufferedReader(fr);
        char [] chs = new char[1024];
        int len = -1;

        while((len = bfr.read(chs)) != -1 ){

            System.out.println(new String(chs,0,len));
        }





    }
}
