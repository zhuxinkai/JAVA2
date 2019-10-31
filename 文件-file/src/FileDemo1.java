import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main (String [] args) throws IOException {
        File file = new File("D:/test.java");
        file.createNewFile();

        File file2 = new File("D:/test");
        file2.mkdir();

        File file3 = new File("D:/test");
        file3.mkdirs();

        //基本上都是返回boolean 值。
        //删除文件，回收站中不存在。
        file.delete();


       //删除目录，只能删除空目录。需要逐级删除目录。 .delete();,需要改写file3对象。
            file3.delete();




       //相对路径，创建文件和目录。（不指定盘符，目录就是项目的路径）

        File file4 = new File("src/cn/tx");
        file4.mkdirs();





        //在package 里面创建文件。
       File file5 = new File("src/aa.java");
       file5.createNewFile();




        //判断文件是否存在
        System.out.println("判断文件是否存在 "+ file5.exists());





        //判断是否是文件（区别于目录）;
        System.out.println("判断是否为文件 "+file5.isFile());





        //判断是否是文件夹（目录）；

        System.out.println("判断是否为目录 "+file5.isDirectory());

        System.out.println("判断是否为目录 "+file4.isDirectory());





        //判断是否是绝对路径；判断文件是否可读； 判断文件是否可写；判断文件是否是隐藏的；

    System.out.println("判断文件是否隐藏 "+file5.isHidden());
    System.out.println("判断文件是否可读 "+file5.canRead());
    System.out.println("判断文件是否可写 "+file5.canWrite());
    System.out.println("判断文件是否绝对路径 "+file5.isAbsolute());












    }
}
