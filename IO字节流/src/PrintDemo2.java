import java.io.*;

public class PrintDemo2 {



    public static void main (String [] args)  {

        //定义缓冲区输入流对象
        BufferedReader fw = null;
        PrintWriter pw = null;
        String line;

        try {
            fw = new BufferedReader(new FileReader("IO字节流.iml"));
            pw = new PrintWriter(System.out);

            while((line = fw.readLine()) != null){
                pw.println(line);
                pw.flush();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (pw != null){
              pw.close();

            }
        }


        //设置自动刷新的打印流

    }
}
