import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class ProperitesDemo {
    public static void main (String [] args){
        Properties pt = new Properties();
        pt.setProperty("name","zhuxinkai");
        pt.setProperty("age","19");
        pt.setProperty("gender","man");
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter("propertiey.txt")));
            pt.list(pw);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(pw != null){
                pw.close();

            }
        }

    }
}
