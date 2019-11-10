import java.io.*;

public class PrintDemo3 {
    public static void main (String [] args){
        BufferedReader bf = null;
        PrintWriter pw = null;
        String line = null;
        try {
            bf = new BufferedReader(new FileReader("IO字节流.iml"));
            pw = new PrintWriter(new BufferedWriter(new FileWriter("IO字节流复制文件.iml")),true);
            //构造器中，需要将Writer象，才可以，进行autoFlush . 则无需进行 pw.flush(); 操作。

            while ((line = bf.readLine())!= null){
                pw.write(line);
                pw.write("\r\n");





            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(pw != null){
                pw.close();
            }
            if (bf != null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
