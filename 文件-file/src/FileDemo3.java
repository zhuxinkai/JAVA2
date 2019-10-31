import java.io.File;

public class FileDemo3 {
    public static void main(String[] args){
        //获取系统的根目录，遍历所有的根目录。
        /*
   File [] fileaa = File.listRoots();
   for(File file : fileaa){

       System.out.println(file);

   }
        System.out.println("---------------------------------------------");

*/

        //获取指定目录下的所有子目录。listFiles()
        File filesbb = new File("D:\\文档\\GitHub\\JAVA2");
        File [] ff = filesbb.listFiles();
        printDirectory(ff);
/*

        System.out.println("---------------------------------------------");
        String [] fbfb = filesbb.list();
        for(String file : fbfb){

            System.out.println(file);

        }
        System.out.println("---------------------------------------------");

*/

    }
    public static void printDirectory(File [] ff){
        for (File ffadb : ff) {

            if (ffadb.isDirectory()) {
                printDirectory(ffadb.listFiles());
                String[] ffbb = ffadb.list();
                for (String file2 : ffbb) {
                    System.out.println(file2);


                }
            }


        }
    }
}
