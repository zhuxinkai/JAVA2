import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main (String [] args) throws IOException {
        //追加性的写文件，利用FileWriter的不同构造器，在文件的后面增加一个关于append的boolean 的值。

        FileWriter fw = new FileWriter("b.txt",true);
        fw.write("\r\n");
        fw.write("I love you\r\n");
        fw.flush();
        fw.close();

        /* 输出换行
       把文本写入文件中\代表换行，问题是不同的环境下，换行的方式不同。
       Windows  : \r\n
        linux :\n
        Mac: \r
       利用windows的方式，兼容 linux 和mac

         */

    }
}
