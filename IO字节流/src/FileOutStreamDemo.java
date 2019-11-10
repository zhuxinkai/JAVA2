import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutStreamDemo {
    public static void main(String [] args) throws IOException {

        writeFile();


    }
    //创建字节流输出对象
    public static void writeFile() throws IOException {
        OutputStream opt = new FileOutputStream("a.txt");
        String str = "HelloWord";
        //一个字符串，转换成字节格式的数组。
        byte [] bts = str.getBytes();
        for(byte bb : bts){
            opt.write(bb);

        }
        opt.close();




    }
}
