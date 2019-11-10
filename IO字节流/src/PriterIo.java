import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PriterIo {
    public static void main (String [] args){
        /*
        打印流，也分为字节打印流和字符打印流。
       PrintStream  （字节流打印）







       PrintWriter  都具有自动刷新功能。(字符流打印） ，特点：
       1，可以的打印任何数据类型。
       2，可以输出Writer 的子类。（封装）
       3，有OutputStream 子类，字节流可以转换成字符流。
       4，在若干方法上，可以进行自动刷新。
       5，可以直接写文件。
       PrintStream 构造器， PrintStream(filename:);


         */
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("c.txt");
            pw.println(true);
            pw.println("zhuxinkai");
            pw.println(12);
            pw.println('a');
            pw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (pw != null){
                pw.close();
            }
        }


    }
}
