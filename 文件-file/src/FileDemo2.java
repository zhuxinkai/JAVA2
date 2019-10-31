import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String [] args) throws IOException {

        //获取文件的相对路径，获取文件的绝对路径，获取文件名字;获取文件大小；（字节为单位） ； 获得最后的修改时间

        File file1 = new File("D:/Javascirpt.js");
        file1.createNewFile();
        //对于相对路径创建的文件，获取相对路径getpath ，则是他的文件名。绝对路径方式创建的文件，他的相对路径也是他的绝对路径。

        System.out.println("获取文件的相对路径  "+file1.getPath() );
        System.out.println("获取文件的绝对路径  " + file1.getAbsolutePath());

        System.out.println("获取文件的名字  "+ file1.getName());
       //获取文件的大小，竟然使用length;

        System.out.println("获取文件的大小" + file1.length());
       File file3 = new File("D:\\JAVA视频\\05.面对对象\\51、面向对象概述.mp4");
       System.out.println("获取视频文件的大小  "+(file3.length()/(1024*1024))+"M");


       long timelast = file1.lastModified();
        SimpleDateFormat dtime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");


       System.out.println( dtime.format(timelast));






    }
}
