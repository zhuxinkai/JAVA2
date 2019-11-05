import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main (String [] args) throws IOException {
        FileWriter fwnew = new FileWriter("d.txt");
        //写入字符数组，相当于写入一个字符串。
        char [] char123 = {'a','b','c','d'};
        System.out.println(char123);

        fwnew.write(char123);//当添加换行符时，却出现了，变成地址的方式+hashCode的方式。


        //对于字符数组，按要求节选性写入
        fwnew.write(char123,2,2);
        // 直接对于字符串，进行节选性的写入

        fwnew.write("this is a good new "+"\r\n",8,8);
        fwnew.flush();
        fwnew.close();











    }
}
