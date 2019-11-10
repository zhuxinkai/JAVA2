import java.io.*;

public class ConverterDemo {
    public static void main (String [] args) throws IOException {
           BufferedWriter bfw = new BufferedWriter(new FileWriter("b.txt"));
        //定义一个system.in 的 inputStream 流
            InputStream is = System.in;
            /*
            要想使用字符流的高效缓冲区来操作字节流
            定义字符BufferedReader 工具，在new BufferedReader 中将 原先的， InputStream 字节流，转换成字符流对象
            通过 inputStreamReader.
             */
             BufferedReader brw = new BufferedReader(new InputStreamReader(is));
             String str;
             while((str =brw.readLine()) != null){
                 //注意字符串的比较，必须要用equals.
                 if(str.equals("exit")){
                     break;
                 }
                 bfw.write(str);
                 bfw.write("\r\n");
                 bfw.flush();


             }



    }
}
